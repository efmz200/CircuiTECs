package compuertas;

/**
 *
 * @author Erick
 */
public class CompuertaNOR extends Compuerta{    
   
    public void CompuertaNOR(){
        this.setCantEntradas(2);
        this.setCantSalidas(1);        
    }
   
     public void  operar(){
        this.setSalida(!(entrada1||entrada2));        
    }
}
