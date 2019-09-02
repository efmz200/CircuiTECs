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
public class CompuertaXNOR extends Compuerta{
    boolean entrada1;
    boolean entrada2;
    public void CompuertaAnd(){
        this.cantEntradas=2;
        this.cantSalidas=1;
    }
    public void setEntrada(boolean entrada){
        if ((entrada1!=true) || (entrada1!= false)){
            entrada1=entrada;
        }
        entrada2= entrada;
    }
    @Override
    public void operar(){
        if(entrada1==entrada2){
            this.setSalida(true);
        }
        else{
             this.setSalida(false);
        }
    }
    
}
