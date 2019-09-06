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
class CompuertaAnd extends Compuerta {    
    public void CompuertaAnd(){
        this.setCantEntradas(2);
        this.setCantSalidas(1);                      
    }    
    public void  operar(){        
        this.setSalida(entrada1&entrada2);        
    }    
}
