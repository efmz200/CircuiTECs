
package compuertas;

import compuertas.Compuerta;
import listas.DoubleEndedLinkedList;
import listas.Nodo;

/**
 *
 * @author Erick
 */
public class OprComp {
    public static Compuerta getComp(int compId,DoubleEndedLinkedList lista){
        Nodo<Compuerta> aux=lista.getNodo(0);
        while(aux != null){
            if(aux.getDato().getId()==compId){
                System.out.println("Se encontro la compuerta con el id");
                System.out.println(aux.getDato().id);
                System.out.println("que es tipo");
                System.out.println(aux.getDato().getTipo());
                return aux.getDato();
            }
            aux=aux.getNext();
        }
        return null;
    }
}
