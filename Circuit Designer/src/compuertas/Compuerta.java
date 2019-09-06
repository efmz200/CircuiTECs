package compuertas;
import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Compuerta {
    DoubleEndedLinkedList listaEntradas;
    private int cantEntradas;
    private int cantSalidas;
    private boolean salida;
    boolean entrada1;
    boolean entrada2;
    
    public void setEntrada1(boolean entrada){
        entrada1=entrada;              
    }
    public void setEntrada2(boolean entrada){
        entrada2=entrada;     
    }
    public void setListaEntradas(DoubleEndedLinkedList listaEntradas) {
        this.listaEntradas = listaEntradas;
    }

    public void setCantEntradas(int cantEntradas) {
        this.cantEntradas = cantEntradas;
    }

    public void setCantSalidas(int cantSalidas) {
        this.cantSalidas = cantSalidas;
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
