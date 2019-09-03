/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuertas;

/**
 *
 * @author Erick
 */
public class CompuertaNOT extends Compuerta {
    boolean entrada;
    public void CompuertaNOT(){
        this.setCantEntradas(1);
    this.setCantSalidas(1);
    }
    public void setEntrada(boolean entrada){
         this.entrada= entrada;
    }
    
    public void  operar(){
        this.setSalida(!(entrada));        
    }
    
}
