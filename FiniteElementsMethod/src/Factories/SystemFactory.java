/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Factories;

import finiteelementsmethod.SystemSolver;
import finiteelementsmethod.FEMSystem;

/**
 *
 * @author luis.alberto.moruno
 */
public abstract class SystemFactory {
    protected FEMSystem sistema;
    protected SystemSolver resolucion;
    public abstract FEMSystem createSistema(String tM);
    public abstract SystemSolver createResolucion(String tR);
}
