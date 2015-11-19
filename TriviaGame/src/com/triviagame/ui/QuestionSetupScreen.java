/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Przemek Stepien
 */
public class QuestionSetupScreen extends Application {

    @Override
    public void start(Stage stage) {
      
        Label title = new Label("Questions Setup!");
        Label questionLabel = new Label ("Enter the question: ");
        Label answerLabel = new Label ("Enter the answer:  ");
        

        VBox vbox = new VBox();
 
        Scene scene = new Scene(vbox, 500, 500);
        stage.setTitle(title.getText());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
