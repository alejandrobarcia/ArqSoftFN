/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import finiteelementsmethod.MatrizCompleta;
import finiteelementsmethod.MatrizDiagonales;
import finiteelementsmethod.MatrizSkyline;
import finiteelementsmethod.MiVector;
import finiteelementsmethod.Resolucion;
import finiteelementsmethod.ResolucionMetodoEcuac1;
import finiteelementsmethod.ResolucionMetodoEcuac2;
import finiteelementsmethod.ResolucionMetodoEcuac3;
import finiteelementsmethod.Sistema;
import finiteelementsmethod.SistemaEcuaciones;

/**
 *
 * @author luis.alberto.moruno
 */
public class FabricaProdsSistemaEcuaciones extends FabricaProdsMEF{

    public Sistema createSistema(String tM) {
        if(tM.equalsIgnoreCase("completa")){
            sistema=new SistemaEcuaciones(new MatrizCompleta(), new MiVector());
        }else if(tM.equalsIgnoreCase("diagonales")){
            sistema=new SistemaEcuaciones(new MatrizDiagonales(), new MiVector());
        }else if(tM.equalsIgnoreCase("skyline")){
            sistema=new SistemaEcuaciones(new MatrizSkyline(), new MiVector());
        }
        return sistema;
    }

    public Resolucion createResolucion(String tR) {
       if(tR.equalsIgnoreCase("ecuac1")){
            resolucion=new ResolucionMetodoEcuac1();
        }else if(tR.equalsIgnoreCase("ecuac2")){
            resolucion=new ResolucionMetodoEcuac2();
        }else if(tR.equalsIgnoreCase("ecuac3")){
            resolucion=new ResolucionMetodoEcuac3();
        }
       return resolucion;
    }
    
}
