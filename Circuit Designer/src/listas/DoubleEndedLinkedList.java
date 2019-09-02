/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Erick
 * @param <T>
 */
public class DoubleEndedLinkedList<T>{
    private Nodo<T> head;
    private Nodo<T> tile;
    private int lenn;
   
    /**
     * Constructor de lista enlazada con docble final
     *  
     */
    public DoubleEndedLinkedList(){
   
        head=null;
        tile=null;
        lenn=0;        
    }
    /**
     * Método para obtener el largo de la lista
     * @return 
     */
    public int len(){
        return this.lenn;
    }
    public void addFirst(){
        if (this.head==null){
            this.head= new Nodo();
            this.tile= this.head;
        }
        else{
            Nodo<T> temp= this.head;
            this.head= new Nodo();
            this.head.setNext(temp);
        }
        lenn++;
    }
    public void addFirst(T dato){
        if (this.head==null){
            this.head= new Nodo(dato);
            this.tile= this.head;
            
        }
        else{
            Nodo<T> temp= this.head;
            this.head= new Nodo();
            this.head.setNext(temp);
        }
        lenn++;
    }
    public void addLast(){
        Nodo <T>temp=new Nodo();
        this.tile.setNext(temp);
        this.tile=temp;
        
    }
     public void addLast(T dato){
        Nodo <T>temp=new Nodo(dato);
        this.tile.setNext(temp);
        this.tile=temp;
        lenn++;
     }
    public void add(int i){
        if(this.head==null){
            this.head=new Nodo<>();
        }
        if (i==this.lenn-1){
            addLast();
            return ;
        }
        if (i==lenn){
            return ;
        }
        int pos = 1;
        Nodo<T> aux=this.head;
        while(pos<i){
            aux=aux.getNext();
            pos++;
        }
        Nodo<T> temp=aux.getNext();
        aux.setNext(new Nodo());
        aux.getNext().setNext(temp);
        lenn++;
    
    }
    public void add(int i,T dato){
        if(this.head==null){
            this.head= new Nodo<>(dato);
            return;
        }
        if (i==this.lenn-1){
            addLast(dato);
            return ;
        }
        if (i==lenn){
            return ;
        }
        int pos = 1;
        Nodo<T> aux=this.head;
        while(pos<i){
            aux=aux.getNext();
            pos++;
        }
        Nodo<T> temp=aux.getNext();
        aux.setNext(new Nodo(dato));
        aux.getNext().setNext(temp);
        lenn++;
    
    }
    public Nodo<T> in(T dato){
        Nodo<T> aux=head;
        while (aux.getNext()!= null){
            if (aux.getDato().equals(dato)){
                return aux;
            }
  
        }
        return null;
    }
    private void removeFirst(){
        this.head=this.head.getNext();
    }
    
    public void remove(int pos){
        if (pos==0){
            removeFirst();
        }
        if (pos>lenn){
            System.out.println("indice inexistente");
            return;
        }
        int cont=1;
        Nodo<T> aux=this.head;
        while (cont<pos){
            cont++;
            aux= aux.getNext();
        }
        if (aux.getNext().getNext()==this.tile){
            aux.setNext(null);
            tile=aux;
            return;
        }
        aux.setNext(aux.getNext().getNext());
    }
}
