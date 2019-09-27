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
    private int id;
    private int cantCompuertas;
    private OprComp opr= new OprComp();
    /**
     * Constructor del Facade
     */
    public Facade(){
        listaCompuertas= new DoubleEndedLinkedList();
        id=0; 
        cantCompuertas=0;
    }
    /**
     * Metodo que recibe un id y retorna la salida que tiene la compuerta con ese id
     * @param id int   
     * @return boolean
     */
    public boolean getValor(int id){   
        Compuerta comp;
        comp=opr.getComp(id,listaCompuertas);
        return comp.getSalida();
    }
    /**
     * Metodo que retorna una lista con los id de las compuertas que estan al final del circuito
     * @return lista con los id de las compuertas que estan al final del circuito
     */
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
    /**
     * Metodo que conecta dos compuertas basado en su id 
     * @param idComp1 id de la compuerta que envia la salida
     * @param idComp2 id de la compuerta que recibe la entrada
     */
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
    /**
     * Metodo que crea una nueva compuerta y la agrega a la lista de compuertas
     * @param tipo String que se utiliza para establecer el tipo de compuerta que se quiere crear
     */
    public void crearComp(String tipo){
        Compuerta comp=new Compuerta(tipo,id);       
        System.out.println("Se ha creado una compuerta "+comp.getTipo()+" con el id "+comp.id);        
        listaCompuertas.add(comp);
        id++;
        cantCompuertas++;
    }
    /**
     * Metodo que recorre la lista de compuertas y segun sus entradas y su tipo da una salida
     */
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
    /**
     * Metodo que muestra las connecciones de las compuertas
     */
    public void conectionList(){
        Nodo<Compuerta> aux=listaCompuertas.getNodo(0);
        while (aux!=null){
            System.out.println("La compuerta "+aux.getDato().getId()+ " se conecta con");            
            opr.mostratComp(aux.getDato().getListaEntradas());
            aux=aux.getNext();
        }
    }
}

