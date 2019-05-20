/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

/**
 *
 * @author luis.alberto.moruno
 */
public abstract class FEMSystem {
    private Matrix matriz;
    public FEMSystem(Matrix matriz){
        this.matriz=matriz;
    }
    public Matrix getMatriz(){
        return this.matriz;
    }
}
