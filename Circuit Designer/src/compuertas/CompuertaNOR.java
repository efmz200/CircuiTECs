package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class CompuertaNOR extends Compuerta{    
     public void compuertaNor(){
        listaEntradas=new DoubleEndedLinkedList();
    }
    public void  operar(){        
        DoubleEndedLinkedList lista= getListaEntradas();
        if(lista.in(true)){
            setSalida(false);
            return;
        }
        setSalida(true);
    } 
}
