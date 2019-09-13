/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

import Facade.Facade;
import compuertas.Compuerta;
import listas.DoubleEndedLinkedList;
import listas.Nodo;

/**
 *
 * @author Erick
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Facade facade=new Facade();
        facade.crearComp("TRUE");
        facade.crearComp("FALSE");
        facade.crearComp("NOR");
        //facade.crearComp("OR");
        facade.conectar(1,2);
        facade.conectar(1,2);
        facade.conectar(0,2);
        //facade.conectar(2,3);
        //facade.conectar(1,3);
        facade.correr();
        facade.getSalida();
        
        
        
        
//        lista.getNodo(0).getDato().operacion();
//        lista.getNodo(0).getDato().addSiguiente( lista.getNodo(1).getDato());
//        lista.getNodo(0).getDato().addSiguiente( lista.getNodo(1).getDato());
//        lista.getNodo(0).getDato().addSiguiente( lista.getNodo(2).getDato());
//        lista.getNodo(1).getDato().addSiguiente( lista.getNodo(2).getDato());
//        lista.getNodo(0).getDato().enviarSalida();
//        lista.getNodo(1).getDato().operacion();
//        lista.getNodo(1).getDato().enviarSalida();
//        lista.getNodo(2).getDato().operacion();
        //System.out.println(lista.getNodo(2).getDato().getSalida());
        
        
         
        //aux.addEntrada(false);
        
       
        //System.out.println(aux.getListaEntradas().same());
       
        //System.out.println(aux.getSalida());
        
        
        
        //lista.getNodo(0).getDato().getSalida();
        //System.out.println(lista.getNodo(0).getDato().getSalida());
        
     
    }
    
}
