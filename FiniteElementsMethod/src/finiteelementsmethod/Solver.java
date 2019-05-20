/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package finiteelementsmethod;

import Factories.SystemFactory;
import java.util.List;

/**
 *
 * @author luis.alberto.moruno
 */
public class Solver {
    private SystemSolver resolucion;
    private Solution solucion;
    private List elementos;
    private SystemFactory fabrica;
    public Solver(List elementos){
        this.elementos=elementos;
    }
    public void ensamblarElementos() {
        System.out.println("Se ha ensamblado la totalidad de las contribuciones de los elementos al sistema");
    }
    public Solution getSolucion(){
        return this.solucion;
    }
    public void resolver(String tM, String tR){
        this.fabrica.createSistema(tM);
        this.resolucion=this.fabrica.createResolucion(tR);
        this.ensamblarElementos();
        this.solucion=this.resolucion.resolverSistema();
    }
    public void setFabrica(SystemFactory f){
        fabrica=f;
    }
}
