/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
class CompuertaAnd extends Compuerta { 
    public void compuertaAnd(){
        listaEntradas=new DoubleEndedLinkedList();
    }
    public void  operar(){        
        DoubleEndedLinkedList lista= getListaEntradas();
        if(lista.in(false)){
            setSalida(false);
            return;
        }
        setSalida(true);
    }    
}
