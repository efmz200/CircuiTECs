package compuertas;

import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class CompuertasXOR extends Compuerta {
    
    public void CompuertaAnd(){
        listaEntradas= new DoubleEndedLinkedList();
    }
    
    public void operar(){        
        setSalida(!(listaEntradas.same()));
    }
}
