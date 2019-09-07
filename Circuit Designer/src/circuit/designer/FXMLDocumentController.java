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

/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        DoubleEndedLinkedList lista;
        // TODO
        lista = new DoubleEndedLinkedList();
        lista.add(true); 
        lista.add(true);
        lista.add(true);
        lista.add(true);
        lista.add(true);
        lista.add(true);
        System.out.println(lista.same());
        
        System.out.println("PRINT LEN " + lista.len());
                
    }    
    
}
