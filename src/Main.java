import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Writer;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.antlr.runtime.tree.Tree;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.antlr.stringtemplate.language.AngleBracketTemplateLexer;

public class Main {
	private static final String TEMPLATE_FILE = "template.stg";

	public static void main(String[] args) throws RecognitionException,
			FileNotFoundException, IOException {
		ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(
				"src/TestInput.txt"));
		raeselLexer lexer = new raeselLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		raeselParser parser = new raeselParser(tokens);
		raeselParser.s_return result = parser.s();
		Tree t = (Tree) result.getTree();
		System.out.println("nach dem parsen");
		System.out.println(t.toStringTree());

		CommonTreeNodeStream nodes = new CommonTreeNodeStream(t);
		nodes.setTokenStream(tokens);
		SymbolraeselNormalisierung normalizer = new SymbolraeselNormalisierung(nodes);
		SymbolraeselNormalisierung.s_return ast2 = normalizer.s();
		CommonTree r2 = ((CommonTree) ast2.tree);
		System.out.println("\n\nnach dem normalisieren");
		System.out.println(r2.toStringTree());


		CommonTreeNodeStream nodes2 = new CommonTreeNodeStream(r2);
		nodes2.setTokenStream(tokens);
		SymbolraetselEmitter emitter = new SymbolraetselEmitter(nodes2);
		InputStream templateIs = Main.class.getClassLoader()
				.getResourceAsStream(TEMPLATE_FILE);

		StringTemplateGroup templates = new StringTemplateGroup(
				new InputStreamReader(templateIs, "ISO-8859-15"),
				AngleBracketTemplateLexer.class);
		emitter.setTemplateLib(templates);
		SymbolraetselEmitter.puzzle_return puzzle_return = emitter.puzzle();
		String output = puzzle_return.getTemplate().toString();
		System.out.println("\n\nausgabe");
		System.out.println(output);
		
		Writer writer = new BufferedWriter(new FileWriter(new File("src/chocoSolver/SymbolraetselChocoSolver.java")));
		writer.write(output);
		writer.flush();
		writer.close();

	}

}
