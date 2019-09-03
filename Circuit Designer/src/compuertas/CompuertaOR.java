package compuertas;

/**
 *
 * @author Erick
 */
class CompuertaOR extends Compuerta {
    
    public void CompuertaOR(){
        this.setCantEntradas(2);
        this.setCantSalidas(1);
    }
    public void  operar(){   
        this.setSalida(entrada1||entrada2);        
    }
}
