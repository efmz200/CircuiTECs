package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class CompuertaNAND extends Compuerta{
    
     public void compuertaNand(){
        listaEntradas=new DoubleEndedLinkedList();
    }
    public void  operar(){        
        DoubleEndedLinkedList lista= getListaEntradas();
        if(lista.in(false)){
            setSalida(true);
        }
        setSalida(false);
    }     
}
