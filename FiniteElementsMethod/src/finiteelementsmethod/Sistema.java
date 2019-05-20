/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

/**
 *
 * @author luis.alberto.moruno
 */
public abstract class Sistema {
    private Matriz matriz;
    public Sistema(Matriz matriz){
        this.matriz=matriz;
    }
    public Matriz getMatriz(){
        return this.matriz;
    }
}
