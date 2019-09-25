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
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import listas.DoubleEndedLinkedList;


/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    private Facade facade;
    @FXML private TextField idComp1;
    @FXML private TextField idComp2;
    @FXML private AnchorPane root;
    double orgSceneX, orgSceneY;
    double orgTranslateX, orgTranslateY;
    private DoubleEndedLinkedList<ImageView> listaImgComp;
   
    public FXMLDocumentController() {
        this.facade = new Facade();
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
       imgAnd.setTranslateX(100);
       imgAnd.setTranslateY(100);
       imgAnd.setOnMousePressed(OnMousePressedEventHandler);
       imgAnd.setOnMouseDragged(OnMouseDraggedEventHandler);
       root.getChildren().add(imgAnd); 
       
    }
    EventHandler<MouseEvent> OnMousePressedEventHandler = new EventHandler<MouseEvent>() {
 
        @Override
        public void handle(MouseEvent t) {
            orgSceneX = t.getX();
            orgSceneY = t.getY();
            orgTranslateX = ((ImageView)(t.getSource())).getTranslateX();
            orgTranslateY = ((ImageView)(t.getSource())).getTranslateY();
        }
    };
     
    EventHandler<MouseEvent> OnMouseDraggedEventHandler = new EventHandler<MouseEvent>() {
 
        @Override
        public void handle(MouseEvent t) {
            double offsetX = t.getSceneX() - orgSceneX;
            double offsetY = t.getSceneY() - orgSceneY;
            double newTranslateX = orgTranslateX + offsetX;
            double newTranslateY = orgTranslateY + offsetY;
             
            ((ImageView)(t.getSource())).setTranslateX(newTranslateX);
            ((ImageView)(t.getSource())).setTranslateY(newTranslateY);
        }
    };
    
    
    @FXML
    private void btnNand(ActionEvent event) throws IOException {
        facade.crearComp("NAND");
        Image imgNAND =new Image("CompImagenes/NAND.png");
        ImageView imgNand=new ImageView();      
        imgNand.setImage(imgNAND);        
        imgNand.setX(100);
        imgNand.setY(100);
        listaImgComp.add(imgNand);
        root.getChildren().add(imgNand);
    }
    @FXML
    private void btnOr(ActionEvent event) throws IOException {
       facade.crearComp("OR");
       Image imgOR =new Image("CompImagenes/OR.png");
       ImageView imgOr=new ImageView();      
       imgOr.setImage(imgOR);   
       imgOr.setX(100);
       imgOr.setY(100);
       root.getChildren().add(imgOr);
    }
    @FXML
    private void btnNor(ActionEvent event) throws IOException {
       facade.crearComp("NOR");
       Image imgNOR =new Image("CompImagenes/NOR.png");
       ImageView imgNor=new ImageView();      
       imgNor.setImage(imgNOR);
       imgNor.setX(100);
       imgNor.setY(100);
       root.getChildren().add(imgNor);
    }
    @FXML
    private void btnXor(ActionEvent event) throws IOException {
       facade.crearComp("XOR");
       Image imgXOR =new Image("CompImagenes/XOR.png");
       ImageView imgXor=new ImageView();      
       imgXor.setImage(imgXOR);
       imgXor.setX(100);
       imgXor.setY(100);
       root.getChildren().add(imgXor);
    }
    @FXML
    private void btnXnor(ActionEvent event) throws IOException {
       facade.crearComp("XNOR");
       Image imgXNOR =new Image("CompImagenes/XNOR.png");
       ImageView imgXnor=new ImageView();      
       imgXnor.setImage(imgXNOR);
       imgXnor.setX(100);
       imgXnor.setY(100);
       root.getChildren().add(imgXnor);
    }
    @FXML
    private void btnNot(ActionEvent event) throws IOException {
       facade.crearComp("NOT");
       Image imgNOT =new Image("CompImagenes/NOT.png");
       ImageView imgNot=new ImageView();      
       imgNot.setImage(imgNOT);  
       imgNot.setX(100);
       imgNot.setY(100);
       root.getChildren().add(imgNot);
    }
    @FXML
    private void btnTrue(ActionEvent event) throws IOException {
       facade.crearComp("TRUE");
       Image imgTRUE =new Image("CompImagenes/TRUE.png");
       ImageView imgTrue=new ImageView();      
       imgTrue.setImage(imgTRUE);
       imgTrue.setX(100);
       imgTrue.setY(100);
       root.getChildren().add(imgTrue); 
    }
    @FXML
    private void btnFalse(ActionEvent event) throws IOException {
       facade.crearComp("FALSE");
       Image imgFALSE =new Image("CompImagenes/FALSE.png");
       ImageView imgFalse=new ImageView();      
       imgFalse.setImage(imgFALSE);
       imgFalse.setX(100);
       imgFalse.setY(100);
       root.getChildren().add(imgFalse);
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
        listaImgComp=new DoubleEndedLinkedList();
        
        //TODO   
    }    
    
}
