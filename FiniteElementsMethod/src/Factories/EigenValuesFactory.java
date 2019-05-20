/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import finiteelementsmethod.FullMatrix;
import finiteelementsmethod.DiagonalsMatrix;
import finiteelementsmethod.Skyline;
import finiteelementsmethod.SystemSolver;
import finiteelementsmethod.FEMSystem;
import finiteelementsmethod.EigenValSystem;

/**
 *
 * @author luis.alberto.moruno
 */
public class EigenValuesFactory extends SystemFactory{
    public FEMSystem createSistema(String tM) {        
        if(tM.equalsIgnoreCase("completa")){
            sistema=new EigenValSystem(new FullMatrix());
        }else if(tM.equalsIgnoreCase("diagonales")){
            sistema=new EigenValSystem(new DiagonalsMatrix());
        }else if(tM.equalsIgnoreCase("skyline")){
            sistema=new EigenValSystem(new Skyline());
        }
        return sistema;
    }

    public SystemSolver createResolucion(String tR) {
        return null; //ToDo
    }
}
