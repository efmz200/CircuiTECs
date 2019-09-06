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
        DoubleEndedLinkedList lista= getListaEntradas();
        int cont=0;
        int largo=lista.len();
        boolean primPos=lista.getInfo(0);
       
        while (cont<=largo){
            
        }
              
        if(lista){
            setSalida(false);
        }
        setSalida(true);
    }    
    
}
