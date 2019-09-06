package compuertas;
import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Compuerta {
    DoubleEndedLinkedList listaEntradas=new DoubleEndedLinkedList();
    private int cantEntradas;
    private int cantSalidas;
    private boolean salida;
        
    public void addEntrada(boolean entrada){
        listaEntradas.add(entrada);
        this.cantEntradas++;
    }   
    public void setSalida(boolean dato){
        this.salida=dato;
    }
    public boolean getSalida(){
        return salida;
    }
    public DoubleEndedLinkedList getListaEntradas() {
        return listaEntradas;
    }

    public int getCantEntradas() {
        return cantEntradas;
    }

    public int getCantSalidas() {
        return cantSalidas;
    }    
}
