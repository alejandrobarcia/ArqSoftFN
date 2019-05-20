/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import finiteelementsmethod.Resolucion;
import finiteelementsmethod.Sistema;

/**
 *
 * @author luis.alberto.moruno
 */
public abstract class FabricaProdsMEF {
    protected Sistema sistema;
    protected Resolucion resolucion;
    public abstract Sistema createSistema(String tM);
    public abstract Resolucion createResolucion(String tR);
}
