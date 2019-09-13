/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import compuertas.Compuerta;
import compuertas.OprComp;
import listas.DoubleEndedLinkedList;
import listas.Nodo;

/**
 *
 * @author Erick
 */
public class Facade {
    private DoubleEndedLinkedList<Compuerta> listaCompuertas;
    //DoubleEndedLinkedList list;
    private int id;
    private int cantCompuertas;
    
    public Facade(){
        listaCompuertas= new DoubleEndedLinkedList();
        id=0; 
        cantCompuertas=0;
    }
    public void conectar(int idComp1,int idComp2){
        Nodo<Compuerta> aux=listaCompuertas.getNodo(0);
        Compuerta comp1;
        Compuerta comp2;
        OprComp opr= new OprComp();
        comp1=opr.getComp(idComp1,listaCompuertas);
        comp2=opr.getComp(idComp2,listaCompuertas);
        if (comp1==null||comp2==null){
            System.out.println("La compuerta no existe");
            return;
        } 
       comp1.addSiguiente(comp2); 
    }    
    public void crearComp(String tipo){
        Compuerta comp=new Compuerta(tipo,id);       
        System.out.println(comp.getTipo());        
        System.out.println(comp.id);         
        listaCompuertas.add(comp);
        id++;
        cantCompuertas++;
    }
    public void correr(){
         Nodo<Compuerta> aux=listaCompuertas.getNodo(0);
        while(aux.getNext()!= null){
            aux.getDato().operacion();
            aux.getDato().enviarSalida();
            aux=aux.getNext();
        }
        aux.getDato().operacion();
//        aux.getDato().enviarSalida();
        
        //System.out.println(aux.getDato().getSalida());
        
         
    }
    public void getSalida(){
        System.out.println(listaCompuertas.getLast().getDato().getSalida());
    }
    
}

