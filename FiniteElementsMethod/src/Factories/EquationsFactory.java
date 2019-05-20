/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import finiteelementsmethod.FullMatrix;
import finiteelementsmethod.DiagonalsMatrix;
import finiteelementsmethod.Skyline;
import finiteelementsmethod.MyVector;
import finiteelementsmethod.SystemSolver;
import finiteelementsmethod.FEMSystem;
import finiteelementsmethod.EquationsSystem;

/**
 *
 * @author luis.alberto.moruno
 */
public class EquationsFactory extends SystemFactory{

    public FEMSystem createSistema(String tM) {
        if(tM.equalsIgnoreCase("completa")){
            sistema=new EquationsSystem(new FullMatrix(), new MyVector());
        }else if(tM.equalsIgnoreCase("diagonales")){
            sistema=new EquationsSystem(new DiagonalsMatrix(), new MyVector());
        }else if(tM.equalsIgnoreCase("skyline")){
            sistema=new EquationsSystem(new Skyline(), new MyVector());
        }
        return sistema;
    }

    public SystemSolver createResolucion(String tR) {
        return null; //ToDo
    }
    
}
