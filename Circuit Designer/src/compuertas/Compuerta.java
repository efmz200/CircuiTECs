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

    /**
     * Metodo para obtener el tipo de compuerta 
     * @return String
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Constructor de la compuerta
     * @param tipo String del tipo de compuerta que se quiere crear
     * @param id int identificador de la compuerta que se quiere crear
     */
    public Compuerta(String tipo,int id){
        this.tipo=tipo;
        listaEntradas=new DoubleEndedLinkedList();
        this.id=id;
    }
    /**
     * Metodo para agregar una entrada a la lista de entradas
     * @param entrada boolean 
     */
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
    /**
     * Metodo que agrega una compuerta a la lista de compuertas a las que se les debe de mandar la salida de la compuerta 
     * @param compuerta Compuerta a la cual se le enviara la salida 
     */
    public void addSiguiente(Compuerta compuerta){
        compuertasSiguientes.add(compuerta);
    }
    /** 
     * Metodo que cambia la salida que va a tener la compuerta
     * @param dato boolean
     */
    private void setSalida(boolean dato){
        this.salida=dato;
    }
    /**
     * Metodo para obtener la salida de la compuerta
     * @return boolean
     */
    public boolean getSalida(){
        return salida;
    }
    /**
     * Metodo para poder obtener la lista de entradas de la compuerta
     * @return DoubleEndedLinkedList lista de entradas
     */
    public DoubleEndedLinkedList getListaEntradas() {
        return listaEntradas;
    }
    /**
     * Metodo que devuelve la cantidad de entradas que posee la compuerta
     * @return int
     */
    public int getCantEntradas() {
        return cantEntradas;
    }
    /**
     * Metodo que aumenta la cantidad de entradas que posee la entrada
     */
    public void addCantSalida(){
        this.cantSalidas++;
    }
    /**
     * Metodo para obetener la cantidad de salidas que tiene la compuerta
     * @return int
     */
    public int getCantSalidas () {
        return cantSalidas;
    } 
    /**
     * Metodo que hace que la compuerta genere un resultado en base a sus entradas y su tipo
     */
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
    /**
     * Metodo que envia la salida de la compuerta a las compuertas que esten en su lista de compuertas siguientes
     */
    public void enviarSalida(){
        int fin=compuertasSiguientes.len();
        int contador=0;
        while (contador<fin){
            compuertasSiguientes.getNodo(contador).getDato().addEntrada(salida);
            contador++;
        }
    }
    /**
     * Metodo que permite cambiar el id de la compuerta
     * @param id int
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * Metodo para obtener el id de la compuerta 
     * @return int
     */
    public int getId(){
        return this.id;
    }
}


