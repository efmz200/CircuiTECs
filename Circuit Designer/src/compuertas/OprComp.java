
package compuertas;

import compuertas.Compuerta;
import listas.DoubleEndedLinkedList;
import listas.Nodo;

/**
 *
 * @author Erick
 */
public class OprComp {
    public Compuerta getComp(int compId,DoubleEndedLinkedList lista){
        Nodo<Compuerta> aux=lista.getNodo(0);
        while(aux != null){
            if(aux.getDato().getId()==compId){
                System.out.println("La compuerta con el id "+aux.getDato().id+ " de tipo "+aux.getDato().getTipo());
                
                return aux.getDato();
            }
            aux=aux.getNext();
        }
        return null;
    }
    /**
     * Metodo para obtener las salidas del circuito
     * @param lista que contiene las compuertas donde se va a buscar
     */
    public void getSalidas(DoubleEndedLinkedList lista){
         Nodo<Compuerta> aux=lista.getNodo(0);
        while(aux != null){
            if (aux.getDato().getCantSalidas()==0){
                System.out.println("Una de las salidas es: "+aux.getDato().getSalida());
                System.out.println(aux.getDato().getSalida());
                aux=aux.getNext();
                continue;
            }            
            aux=aux.getNext();       
        
        }
    }
    public void mostratComp(DoubleEndedLinkedList lista){
        Nodo<Compuerta> aux=lista.getNodo(0);
        while(aux!=null){
            System.out.println(aux.getDato().getId());
            aux=aux.getNext();
        }
    }
}
