/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circuit.designer;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import listas.DoubleEndedLinkedList;
import listas.Nodo;
import compuertas.Compuerta;
/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    DoubleEndedLinkedList<Compuerta> lista;
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        Compuerta aux= new Compuerta("AND");
        lista.add(aux);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
       lista = new DoubleEndedLinkedList();
        
        
                
        
    }    
    
}
