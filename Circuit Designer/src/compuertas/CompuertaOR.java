package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
class CompuertaOR extends Compuerta {
    
    public void CompuertaOR(){
        listaEntradas=new DoubleEndedLinkedList();
    }
    public void  operar(){   
               
        DoubleEndedLinkedList lista= getListaEntradas();
        if(lista.in(true)){
            setSalida(true);
            return;
        }
        setSalida(false);
    }   
}
