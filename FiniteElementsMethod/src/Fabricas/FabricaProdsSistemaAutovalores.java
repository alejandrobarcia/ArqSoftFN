/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import finiteelementsmethod.MatrizCompleta;
import finiteelementsmethod.MatrizDiagonales;
import finiteelementsmethod.MatrizSkyline;
import finiteelementsmethod.Resolucion;
import finiteelementsmethod.ResolucionMetodoAuto1;
import finiteelementsmethod.ResolucionMetodoAuto2;
import finiteelementsmethod.ResolucionMetodoAuto3;
import finiteelementsmethod.Sistema;
import finiteelementsmethod.SistemaAutoValores;

/**
 *
 * @author luis.alberto.moruno
 */
public class FabricaProdsSistemaAutovalores extends FabricaProdsMEF{
    public Sistema createSistema(String tM) {        
        if(tM.equalsIgnoreCase("completa")){
            sistema=new SistemaAutoValores(new MatrizCompleta());
        }else if(tM.equalsIgnoreCase("diagonales")){
            sistema=new SistemaAutoValores(new MatrizDiagonales());
        }else if(tM.equalsIgnoreCase("skyline")){
            sistema=new SistemaAutoValores(new MatrizSkyline());
        }
        return sistema;
    }

    public Resolucion createResolucion(String tR) {
        if(tR.equalsIgnoreCase("auto1")){
            resolucion=new ResolucionMetodoAuto1();
        }else if(tR.equalsIgnoreCase("auto2")){
            resolucion=new ResolucionMetodoAuto2();
        }else if(tR.equalsIgnoreCase("auto3")){
            resolucion=new ResolucionMetodoAuto3();
        } 
        return resolucion;
    }
}
