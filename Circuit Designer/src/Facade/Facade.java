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
    private OprComp opr= new OprComp();
    
    public Facade(){
        listaCompuertas= new DoubleEndedLinkedList();
        id=0; 
        cantCompuertas=0;
    }
    public DoubleEndedLinkedList compFinales(){
        DoubleEndedLinkedList<Integer> listId=new DoubleEndedLinkedList();
        int cont=0;
        Nodo<Compuerta> aux= listaCompuertas.getNodo(cont);
        while(aux != null){
           if (aux.getDato().getCantSalidas()==0){
               listId.add(cont);
               aux=aux.getNext();
               cont++;
               continue;
           } 
           aux=aux.getNext();
           cont++;
        }
    return listId;   
    }
    public void conectar(int idComp1,int idComp2){
        Compuerta comp1;
        Compuerta comp2;        
        System.out.println("Se conectaran:");
        comp1=opr.getComp(idComp1,listaCompuertas);
        comp2=opr.getComp(idComp2,listaCompuertas);
        if (comp1==null||comp2==null){
            System.out.println("La compuerta no existe");
            return;
        } 
       comp1.addSiguiente(comp2); 
       comp1.addCantSalida();
    }    
    public void crearComp(String tipo){
        Compuerta comp=new Compuerta(tipo,id);       
        System.out.println("Se ha creado una compuerta "+comp.getTipo()+" con el id "+comp.id);        
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
        opr.getSalidas(listaCompuertas);         
    }
    
    public void conectionList(){
        Nodo<Compuerta> aux=listaCompuertas.getNodo(0);
        while (aux!=null){
            System.out.println("La compuerta "+aux.getDato().getId()+ " se conecta con");
            opr.mostratComp(aux.getDato().getListaEntradas());
            aux=aux.getNext();
        }
    }
}

