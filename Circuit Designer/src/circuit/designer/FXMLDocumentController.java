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
import javafx.scene.layout.AnchorPane;


/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    private Facade facade;
    @FXML private TextField idComp1;
    @FXML private TextField idComp2;
    @FXML private AnchorPane root;
   
    public FXMLDocumentController() {
        this.facade = new Facade();
    }
    
    @FXML
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
        
        //botnAnd.setGraphic(new ImageView(imgAND));
    }
    
    @FXML
    private void btnCorrer(ActionEvent event) throws IOException {
       facade.correr();
    }
    @FXML
    private void btnAnd(ActionEvent event) throws IOException {
       facade.crearComp("AND");
       Image imgAND =new Image("CompImagenes/AND.png");
       ImageView imgAnd=new ImageView();      
       imgAnd.setImage(imgAND);
       root.getChildren().add(imgAnd);       
       
       
    }
    @FXML
    private void btnNand(ActionEvent event) throws IOException {
        facade.crearComp("NAND");
        Image imgNAND =new Image("CompImagenes/NAND.png");
        ImageView imgNand=new ImageView();      
        imgNand.setImage(imgNAND);        
        root.getChildren().add(imgNand);
    }
    @FXML
    private void btnOr(ActionEvent event) throws IOException {
       facade.crearComp("OR");
       Image imgOR =new Image("CompImagenes/NAND.png");
       ImageView imgOr=new ImageView();      
       imgOr.setImage(imgOR);        
       root.getChildren().add(imgOr);
    }
    @FXML
    private void btnNor(ActionEvent event) throws IOException {
       facade.crearComp("NOR");
       Image imgNOR =new Image("CompImagenes/NAND.png");
       ImageView imgNor=new ImageView();      
       imgNor.setImage(imgNOR);        
       root.getChildren().add(imgNor);
    }
    @FXML
    private void btnXor(ActionEvent event) throws IOException {
       facade.crearComp("XOR");
       Image imgXOR =new Image("CompImagenes/NAND.png");
       ImageView imgXor=new ImageView();      
       imgXor.setImage(imgXOR);        
       root.getChildren().add(imgXor);
    }
    @FXML
    private void btnXnor(ActionEvent event) throws IOException {
       facade.crearComp("XNOR");
       Image imgXNOR =new Image("CompImagenes/NAND.png");
       ImageView imgXnor=new ImageView();      
       imgXnor.setImage(imgXNOR);        
       root.getChildren().add(imgXnor);
    }
    @FXML
    private void btnNot(ActionEvent event) throws IOException {
       facade.crearComp("NOT");
    }
    @FXML
    private void btnTrue(ActionEvent event) throws IOException {
       facade.crearComp("TRUE");
    }
    @FXML
    private void btnFalse(ActionEvent event) throws IOException {
       facade.crearComp("FALSE");
    }      
    
    @FXML
    public void conectar(ActionEvent event) throws IOException {
        int id1=Integer.parseInt(idComp1.getText());
        int id2=Integer.parseInt(idComp2.getText());
        facade.conectar(id1, id2);
    }  
    @FXML
    public void conecciones(ActionEvent event) throws IOException {
        facade.conectionList();
    }
    @FXML
    public void ventana(ActionEvent event) throws IOException {
        facade.conectionList();
    }
    

    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        
        
        //TODO   
    }    
    
}
