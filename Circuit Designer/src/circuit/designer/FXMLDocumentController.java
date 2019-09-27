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
import javafx.scene.image.Image;
import Facade.Facade;
import javafx.event.EventHandler;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Font;
import listas.DoubleEndedLinkedList;
import listas.Nodo;


/**
 *
 * @author Erick
 */
public class FXMLDocumentController implements Initializable {
    
    private Facade facade;
    @FXML private TextField idComp1;
    @FXML private TextField idComp2;
    @FXML private AnchorPane root;
    private double orgSceneX, orgSceneY;
    private double orgTranslateX, orgTranslateY;
    private DoubleEndedLinkedList<ImageView> listaImgComp;
    private DoubleEndedLinkedList<String> listaRGB;
    
    @FXML
    private void btnCorrer(ActionEvent event) throws IOException {
       facade.correr();
       DoubleEndedLinkedList<Integer> listId=facade.compFinales();
       Nodo<Integer> aux=listId.getNodo(0);
       int contador=0;
       while (aux!=null){
           Nodo<ImageView> imgCompuerta=listaImgComp.getNodo(aux.getDato());
           Label salida=new Label(Boolean.toString(facade.getValor(listId.getInfo(contador))));
           salida.setLayoutX(imgCompuerta.getDato().getTranslateX()+160);
           salida.setLayoutY(imgCompuerta.getDato().getTranslateY()+40);
           salida.setFont(new Font("Serif", 20));
           root.getChildren().add(salida);
           aux=aux.getNext();
           contador++;
       }
    }    
    /**
     * Tomado de:
     * http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html
     */
    EventHandler<MouseEvent> OnMousePressedEventHandler = new EventHandler<MouseEvent>() {
 
        @Override
        public void handle(MouseEvent t) {
            orgSceneX = t.getSceneX();
            orgSceneY = t.getSceneY();
            orgTranslateX = ((ImageView)(t.getSource())).getTranslateX();
            orgTranslateY = ((ImageView)(t.getSource())).getTranslateY();
        }
    };
    
    /**
     * Tomado de:
     * http://java-buddy.blogspot.com/2013/07/javafx-drag-and-move-something.html
     */ 
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
    private void btnAnd(ActionEvent event) throws IOException {
       facade.crearComp("AND");
       Image imgAND =new Image("CompImagenes/AND.png");
       ImageView imgAnd=new ImageView();      
       imgAnd.setImage(imgAND);
       imgAnd.setTranslateX(1);
       imgAnd.setTranslateY(1);
       imgAnd.setOnMousePressed(OnMousePressedEventHandler);
       imgAnd.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgAnd);
       root.getChildren().add(imgAnd);        
    }
    
    @FXML
    private void btnNand(ActionEvent event) throws IOException {
        facade.crearComp("NAND");
        Image imgNAND =new Image("CompImagenes/NAND.png");
        ImageView imgNand=new ImageView();      
        imgNand.setImage(imgNAND);        
        imgNand.setTranslateX(1);
        imgNand.setTranslateY(1);
        imgNand.setOnMousePressed(OnMousePressedEventHandler);
        imgNand.setOnMouseDragged(OnMouseDraggedEventHandler);
        listaImgComp.add(imgNand);
        root.getChildren().add(imgNand);
    }
    
    @FXML
    private void btnOr(ActionEvent event) throws IOException {
       facade.crearComp("OR");
       Image imgOR =new Image("CompImagenes/OR.png");
       ImageView imgOr=new ImageView();      
       imgOr.setImage(imgOR);   
       imgOr.setTranslateX(1);
       imgOr.setTranslateY(1);
       imgOr.setOnMousePressed(OnMousePressedEventHandler);
       imgOr.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgOr);
       root.getChildren().add(imgOr);
    }
    
    @FXML
    private void btnNor(ActionEvent event) throws IOException {
       facade.crearComp("NOR");
       Image imgNOR =new Image("CompImagenes/NOR.png");
       ImageView imgNor=new ImageView();      
       imgNor.setImage(imgNOR);
       imgNor.setTranslateX(1);
       imgNor.setTranslateY(1);
       imgNor.setOnMousePressed(OnMousePressedEventHandler);
       imgNor.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgNor);
       root.getChildren().add(imgNor);
    }
    
    @FXML
    private void btnXor(ActionEvent event) throws IOException {
       facade.crearComp("XOR");
       Image imgXOR =new Image("CompImagenes/XOR.png");
       ImageView imgXor=new ImageView();      
       imgXor.setImage(imgXOR);
       imgXor.setTranslateX(1);
       imgXor.setTranslateY(1);
       imgXor.setOnMousePressed(OnMousePressedEventHandler);
       imgXor.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgXor);
       root.getChildren().add(imgXor);
    }
    
    @FXML
    private void btnXnor(ActionEvent event) throws IOException {
       facade.crearComp("XNOR");
       Image imgXNOR =new Image("CompImagenes/XNOR.png");
       ImageView imgXnor=new ImageView();      
       imgXnor.setImage(imgXNOR);
       imgXnor.setTranslateX(1);
       imgXnor.setTranslateY(1);
       imgXnor.setOnMousePressed(OnMousePressedEventHandler);
       imgXnor.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgXnor);
       root.getChildren().add(imgXnor);
    }
    
    @FXML
    private void btnNot(ActionEvent event) throws IOException {
       facade.crearComp("NOT");
       Image imgNOT =new Image("CompImagenes/NOT.png");
       ImageView imgNot=new ImageView();      
       imgNot.setImage(imgNOT);  
       imgNot.setTranslateX(1);
       imgNot.setTranslateY(1);
       imgNot.setOnMousePressed(OnMousePressedEventHandler);
       imgNot.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgNot);
       root.getChildren().add(imgNot);
    }
    @FXML
    private void btnTrue(ActionEvent event) throws IOException {
       facade.crearComp("TRUE");
       Image imgTRUE =new Image("CompImagenes/TRUE.png");
       ImageView imgTrue=new ImageView();      
       imgTrue.setImage(imgTRUE);
       imgTrue.setTranslateX(1);
       imgTrue.setTranslateY(1);
       imgTrue.setOnMousePressed(OnMousePressedEventHandler);
       imgTrue.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgTrue);
       root.getChildren().add(imgTrue); 
    }
    
    @FXML
    private void btnFalse(ActionEvent event) throws IOException {
       facade.crearComp("FALSE");
       Image imgFALSE =new Image("CompImagenes/FALSE.png");
       ImageView imgFalse=new ImageView();      
       imgFalse.setImage(imgFALSE);
       imgFalse.setTranslateX(1);
       imgFalse.setTranslateY(1);
       imgFalse.setOnMousePressed(OnMousePressedEventHandler);
       imgFalse.setOnMouseDragged(OnMouseDraggedEventHandler);
       listaImgComp.add(imgFalse);
       root.getChildren().add(imgFalse);
    }      
    
    @FXML
    private void conectar(ActionEvent event) throws IOException {
        int id1=Integer.parseInt(idComp1.getText());
        int id2=Integer.parseInt(idComp2.getText());
        facade.conectar(id1, id2);
        ImageView comp1= listaImgComp.getNodo(id1).getDato();
        ImageView comp2 =listaImgComp.getNodo(id2).getDato();
        Line linea= new Line(comp1.getTranslateX()+159,comp1.getTranslateY()+48,comp2.getTranslateX()+8,comp2.getTranslateY()+5+Math.random()*80+1);
        int col1= (int) Math.round(Math.random()*254);
        int col2= (int) Math.round(Math.random()*254);
        int col3= (int) Math.round(Math.random()*254);
        String RGB= String.valueOf(col1)+String.valueOf(col2)+String.valueOf(col3);
        while (listaRGB.in(RGB)){
            col1= (int) Math.round(Math.random()*254);
            col2= (int) Math.round(Math.random()*254);
            col3= (int) Math.round(Math.random()*254); 
        }
        listaRGB.add(RGB);
        linea.setStroke(Color.rgb(col1, col2, col3));
        linea.setStrokeWidth(4);
        root.getChildren().add(linea);
    }
    
    @FXML
    private void conecciones(ActionEvent event) throws IOException {
        facade.conectionList();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) { 
        listaImgComp=new DoubleEndedLinkedList();
        facade= new Facade();
        listaRGB=new DoubleEndedLinkedList();
        
        //TODO   
    } 
}
