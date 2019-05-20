/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

import Factories.EigenValuesFactory;
import java.util.List;

/**
 *
 * @author luis.alberto.moruno
 */
public class FiniteElementsMethod {
    private static List ld;
    private static Solution sol;
    
    public void discretizar(){
        System.out.println("Discretizando region estudiada...");
    }
    public void renumerarNodos(){
         System.out.println("Renumerando nodos...");
    }
    public void postProcesar(){
         System.out.println("Postprocesando solucion calculada...");
    }
    public Solution getSolucion(){
        return this.sol;
    }
    public static void main(String[] args){
        FiniteElementsMethod fem = new FiniteElementsMethod();
        fem.discretizar();
        fem.renumerarNodos();
        Solver solver=new Solver(ld);
        solver.setFabrica(new EigenValuesFactory());
        solver.resolver("skyline", "Auto1");
        fem.postProcesar();
    }
    
}
