package chocoSolver;

import static choco.Choco.allDifferent;
import static choco.Choco.eq;
import static choco.Choco.makeIntVar;
import static choco.Choco.plus;
import static choco.Choco.scalar;
import static choco.Choco.mult;

import choco.Choco;
import choco.Options;
import choco.cp.model.CPModel;
import choco.cp.solver.CPSolver;
import choco.kernel.model.Model;
import choco.kernel.model.variables.integer.IntegerExpressionVariable;
import choco.kernel.model.variables.integer.IntegerVariable;
import choco.kernel.solver.Solver;

import java.util.List;
import java.util.ArrayList;

public class SymbolraetselChocoSolver {
	public static void main(String[] args) {
		
		List<IntegerVariable> carryList;
	    carryList = new ArrayList<>();
		int initpos=0; 
		int extracpos=0;
		// Build model
        Model model = new CPModel();
        
        // Declare every letter as a variable
        IntegerVariable A = makeIntVar("A",0,9,Options.V_ENUM);
        IntegerVariable B = makeIntVar("B",0,9,Options.V_ENUM);
        IntegerVariable C = makeIntVar("C",0,9,Options.V_ENUM);
        IntegerVariable D = makeIntVar("D",0,9,Options.V_ENUM);
        IntegerVariable F = makeIntVar("F",0,9,Options.V_ENUM);
        IntegerVariable G = makeIntVar("G",0,9,Options.V_ENUM);
        IntegerVariable H = makeIntVar("H",0,9,Options.V_ENUM);
        IntegerVariable J = makeIntVar("J",0,9,Options.V_ENUM);
        IntegerVariable K = makeIntVar("K",0,9,Options.V_ENUM);
        IntegerVariable L = makeIntVar("L",0,9,Options.V_ENUM); 
		
		// Add constraint of all different letters.
		model.addConstraint(allDifferent(new IntegerVariable[]{A, B, C, D, F, G, H, J, K, L}));


		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),Choco.ZERO),plus(G,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),F),F),plus(L,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),L),plus(G,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),K),K),plus(H,mult(carryList.get(extracpos-1),10))));	
				++extracpos;



		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),Choco.ZERO),C),plus(C,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),B),F),plus(H,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),J),H),plus(A,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),J),C),plus(L,mult(carryList.get(extracpos-1),10))));	
				++extracpos;



		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),K),Choco.ZERO),plus(K,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),D),A),plus(F,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),L),C),plus(B,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),J),B),plus(K,mult(carryList.get(extracpos-1),10))));	
				++extracpos;



		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),C),plus(K,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),F),H),plus(D,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),A),plus(L,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),K),L),plus(J,mult(carryList.get(extracpos-1),10))));	
				++extracpos;



		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),B),A),plus(F,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),J),C),plus(L,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),J),B),plus(K,mult(carryList.get(extracpos-1),10))));	
				++extracpos;



		        
		    // Declare Carry variables
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));
		    	carryList.add(makeIntVar("addcarry"+ (initpos++),0,1,Options.V_ENUM));     
			    carryList.add(makeIntVar("addcarry"+ (initpos++),0,0,Options.V_ENUM));
		        
		    // Add Constrains
				
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),C),plus(K,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),L),F),plus(F,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),G),H),plus(B,mult(carryList.get(extracpos-1),10))));
				model.addConstraint(eq(plus(plus(carryList.get(++extracpos),H),C),plus(K,mult(carryList.get(extracpos-1),10))));	
				++extracpos;
		 // Build a solver, read the model and solve it
		Solver s = new CPSolver();
        s.read(model);
        if(s.solve()) {
			System.out.println("Das Raetsel wurde geloest!");
			System.out.println(A.getName() + " = " + s.getVar(A).getVal());
			System.out.println(B.getName() + " = " + s.getVar(B).getVal());
			System.out.println(C.getName() + " = " + s.getVar(C).getVal());
			System.out.println(D.getName() + " = " + s.getVar(D).getVal());
			System.out.println(F.getName() + " = " + s.getVar(F).getVal());
			System.out.println(G.getName() + " = " + s.getVar(G).getVal());
			System.out.println(H.getName() + " = " + s.getVar(H).getVal());
			System.out.println(J.getName() + " = " + s.getVar(J).getVal());
			System.out.println(K.getName() + " = " + s.getVar(K).getVal());
			System.out.println(L.getName() + " = " + s.getVar(L).getVal());
		} else {
			System.out.println("Das Raetsel konnte nicht geloest werden!");
		}
	}
}