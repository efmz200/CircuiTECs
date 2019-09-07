package compuertas;

/**
 *
 * @author Erick
 */
public class CompuertaNOT extends Compuerta {
    
    boolean entrada;
    public void CompuertaNOT(){
        entrada=true;
    }
    public void setEntrada(boolean entrada){
         this.entrada= entrada;
    }
    
    public void  operar(){
        this.setSalida(!(entrada));        
    }
    
}
