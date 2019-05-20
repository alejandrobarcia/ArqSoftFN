/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

/**
 *
 * @author luis.alberto.moruno
 */
public class SistemaEcuaciones extends Sistema{
    private MiVector vector;
    public SistemaEcuaciones(Matriz matriz, MiVector vector){
        super(matriz);
        this.vector = vector;
    }
    
    public MiVector getVector(){
        return this.vector;
    }
}
