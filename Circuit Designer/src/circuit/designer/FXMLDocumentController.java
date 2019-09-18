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
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import Facade.Facade;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    private Facade facade;
    @FXML private TextField idComp1;
    @FXML private TextField idComp2;
    @FXML private Button btnConect;

    public FXMLDocumentController() {
        this.facade = new Facade();
    }
    
    @FXML
    private void btnCorrer(ActionEvent event) throws IOException {
       facade.correr();
    }
    private void btnConectar(ActionEvent event) throws IOException {
        //System.out.println(idComp1.getText());
    }
    
    private void btnAnd(ActionEvent event)throws IOException {
        facade.crearComp("AND");
    }
    
    private void btnFalse(ActionEvent event)throws IOException {
        facade.crearComp("FALSE");       
    }
    
    private void btnNand(ActionEvent event)throws IOException {
        facade.crearComp("NAND");
    }
    
    private void btnNor(ActionEvent event)throws IOException {
        facade.crearComp("NOR");
    }
    
    private void btnNot(ActionEvent event)throws IOException {
        facade.crearComp("NOT");
    }
    
    private void btnOr(ActionEvent event)throws IOException {
        facade.crearComp("OR");
    }
    
    private void btnTrue(ActionEvent event)throws IOException {
        facade.crearComp("TRUE");
    }
    
    private void btnXnor(ActionEvent event)throws IOException {
        facade.crearComp("XNOR");
    }
    
    private void btnXor(ActionEvent event)throws IOException {
        facade.crearComp("XOR");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        System.out.println("hola");
        
        
                
        
    }    
    
}
