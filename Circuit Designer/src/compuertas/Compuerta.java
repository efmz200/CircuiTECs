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
    private final String tipo;
    
    public Compuerta(String tipo){
        this.tipo=tipo;
        listaEntradas=new DoubleEndedLinkedList();
    }
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
    
    public void operacion(){
        if (tipo.equals("AND")){
           if(listaEntradas.in(false)){
            setSalida(false);
        }
        setSalida(true);
        }
        if (tipo.equals("FALSE")){
            setSalida(false);
        
        }
        if (tipo.equals("NAND")){
            if(listaEntradas.in(false)){
            setSalida(true);
        }
        setSalida(false);
        }
        if (tipo.equals("NOR")){
             if(listaEntradas.in(true)){
                setSalida(false);
                return;
            }
            setSalida(true);
        }
        if (tipo.equals("NOT")){
            boolean dato;
            
        }
        if (tipo.equals("OR")){
            if(listaEntradas.in(true)){
            setSalida(true);
        }
        setSalida(false);
        
        }if (tipo.equals("TRUE")){
            setSalida(true);
        
        }
        if (tipo.equals("XNOR")){
            setSalida((listaEntradas.same()));
        
        }
        if (tipo.equals("XOR")){
            setSalida(!(listaEntradas.same()));
        }
    }
}
