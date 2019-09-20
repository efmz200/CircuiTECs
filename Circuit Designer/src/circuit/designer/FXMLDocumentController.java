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
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.image.Image;
import Facade.Facade;


import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;


/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    private Facade facade;
    @FXML private TextField idComp1;
    @FXML private TextField idComp2;
   
    public FXMLDocumentController() {
        this.facade = new Facade();
    }
    private void cargarBtns(){
        
        //Obtencion del link de las imagenes 
        URL linkAND  = getClass().getResource("/CompImages/AND.png");
        URL linkNAND = getClass().getResource("/CompImages/NAND.png");
        URL linkNOR  = getClass().getResource("/CompImages/NOR.png");
        URL linkNOT  = getClass().getResource("/CompImages/NOT.png");
        URL linkOR   = getClass().getResource("/CompImages/OR.png");
        URL linkXNOR = getClass().getResource("/CompImages/XNOR.png");
        URL linkXOR  = getClass().getResource("/CompImages/XOR.png");
        
        //guardado de las imagenes en una variable 
        Image imgAND =new Image(linkAND.toString(),200,200,false,true); 
        Image imgNAND =new Image(linkNAND.toString(),200,200,false,true); 
        Image imNOR =new Image(linkNOR.toString(),200,200,false,true); 
        Image imgNOT =new Image(linkNOT.toString(),200,200,false,true); 
        Image imgOR =new Image(linkOR.toString(),200,200,false,true); 
        Image imgXNOR =new Image(linkXNOR.toString(),200,200,false,true); 
        Image imgXOR =new Image(linkOR.toString(),200,200,false,true);
        
        //btnAND.setGraphic(new ImageView(imgAND));
    }
    
    @FXML
    private void btnCorrer(ActionEvent event) throws IOException {
       facade.correr();
    }
    private void btnAnd(ActionEvent event) throws IOException {
       facade.crearComp("AND");
    }
    private void btnNand(ActionEvent event) throws IOException {
        facade.crearComp("NAND");
    }
    private void btnOr(ActionEvent event) throws IOException {
       facade.crearComp("OR");
    }
    private void btnNor(ActionEvent event) throws IOException {
       facade.crearComp("NOR");
    }
    private void btnXor(ActionEvent event) throws IOException {
       facade.crearComp("XOR");
    }
    private void btnXnor(ActionEvent event) throws IOException {
       facade.crearComp("XNOR");
    }
    private void btnNot(ActionEvent event) throws IOException {
       facade.crearComp("NOT");
    }
    private void btnTrue(ActionEvent event) throws IOException {
       facade.crearComp("TRUE");
    }
    private void btnFalse(ActionEvent event) throws IOException {
       facade.crearComp("FALSE");
    }      
    
    @FXML
    public void Conectar(ActionEvent event) throws IOException {
        int id1=Integer.parseInt(idComp1.getText());
        int id2=Integer.parseInt(idComp2.getText());
        facade.conectar(id1, id2);
        System.out.println(id1);
        System.out.println(id2);
        
    }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {                
        //TODO   
    }    
    
}
