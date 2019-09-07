package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class CompuertaXNOR extends Compuerta{    
     public void compuertaAnd(){
        listaEntradas=new DoubleEndedLinkedList();
    }
    public void  operar(){
        setSalida((listaEntradas.same()));
    }       
}
