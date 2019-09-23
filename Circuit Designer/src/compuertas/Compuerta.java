package compuertas;
import listas.DoubleEndedLinkedList;

/**
 *
 * @author Erick
 */
public class Compuerta {
    private DoubleEndedLinkedList listaEntradas=new DoubleEndedLinkedList();
    private DoubleEndedLinkedList<Compuerta> compuertasSiguientes=new DoubleEndedLinkedList();
    private int cantEntradas;
    private int cantSalidas;
    private boolean entry;
    private boolean salida;
    private String tipo;
    public int id;

    public String getTipo() {
        return tipo;
    }
    
    
    public Compuerta(String tipo,int id){
        this.tipo=tipo;
        listaEntradas=new DoubleEndedLinkedList();
        this.id=id;
    }
    public void addEntrada(boolean entrada){
        if(this.tipo=="NOT"){
            if (cantEntradas==0){
                entry=entrada;
                return;
            }
            return;
        }
        listaEntradas.add(entrada);
        this.cantEntradas++;
    }   
    public void addSiguiente(Compuerta compuerta){
        compuertasSiguientes.add(compuerta);
    }
    private void setSalida(boolean dato){
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
    public void addCantSalida(){
        this.cantSalidas++;
    }
    public int getCantSalidas () {
        return cantSalidas;
    } 
    
    public void operacion(){
        if (tipo==("AND")){
           if(listaEntradas.in(false)){
            setSalida(false);
            return;
            }
            setSalida(true);
            return;
        }
        if (tipo==("FALSE")){
            setSalida(false);
            return;
        }
        if (tipo==("NAND")){
            if(listaEntradas.getInfo(0).equals(true)&&listaEntradas.same()){
                setSalida(false);
                return;
            }
            setSalida(true);
            return;
            
            
        }
        if (tipo==("NOR")){
             if(listaEntradas.getInfo(0).equals(false)&&listaEntradas.same()){
                setSalida(true);
                return;
            }
            setSalida(false);
            return;
        }
        if (tipo==("NOT")){
            setSalida(!(entry));
            
        }
        if (tipo==("OR")){            
            if(listaEntradas.in(true)){
                setSalida(true);
                return;
            }
            setSalida(false);
            return;
        }
        if (tipo==("TRUE")){
            setSalida(true);
            return;
        }
        if (tipo==("XNOR")){
            System.out.println(listaEntradas.same());
            setSalida(listaEntradas.same());
            return;
        }
        if (tipo==("XOR")){            
            setSalida(!(listaEntradas.same()));
            }
        
    }
    public void enviarSalida(){
        int fin=compuertasSiguientes.len();
        int contador=0;
        while (contador<fin){
            compuertasSiguientes.getNodo(contador).getDato().addEntrada(salida);
            contador++;
        }
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
}


