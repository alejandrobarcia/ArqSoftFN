/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

/**
 *
 * @author luis.alberto.moruno
 */
public class EquationsSystem extends FEMSystem{
    private MyVector vector;
    public EquationsSystem(Matrix matriz, MyVector vector){
        super(matriz);
        this.vector = vector;
    }
    
    public MyVector getVector(){
        return this.vector;
    }
}
