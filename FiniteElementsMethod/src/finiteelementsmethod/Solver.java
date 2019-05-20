/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

import Fabricas.FabricaProdsMEF;
import java.util.List;

/**
 *
 * @author luis.alberto.moruno
 */
public class Solver {
    private Resolucion resolucion;
    private Solucion solucion;
    private List elementos;
    private FabricaProdsMEF fabrica;
    public Solver(List elementos){
        this.elementos=elementos;
    }
    public void ensamblarElementos() {
        System.out.println("Se ha ensamblado la totalidad de las contribuciones de los elementos al sistema");
    }
    public Solucion getSolucion(){
        return this.solucion;
    }
    public void resolver(String tM, String tR){
        this.fabrica.createSistema(tM);
        this.resolucion=this.fabrica.createResolucion(tR);
        this.ensamblarElementos();
        this.solucion=this.resolucion.resolverSistema();
    }
    public void setFabrica(FabricaProdsMEF f){
        fabrica=f;
    }
}
