/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User1
 */
public class FXMLInputQuestionController extends Application implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }   
    
    @FXML
    void onSaveClick(){
        System.out.println("working");
    }
    
   public static void main(String []args){
       System.out.println("main method");
       launch(args);
   }

    @Override
    public void start(Stage primaryStage) throws Exception {
         Parent home = FXMLLoader.load(getClass().getResource("FXMLInputQuestion.fxml"));
         //tableScene = new Scene(FXMLLoader.load(getClass().getResource("FXMLTable.fxml")));
        
        
        
        Scene scene = new Scene(home);
        Scene homeScene = scene;
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
}
