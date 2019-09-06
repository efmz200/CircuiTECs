package compuertas;

/**
 *
 * @author Erick
 */
public class CompuertaNAND extends Compuerta{
    
    public void CompuertaNAND(){
        this.setCantEntradas(2);
        this.setCantSalidas(1);
    }
    public void  operar(){
        
        this.setSalida(!(entrada1&entrada2));        
    }
}
