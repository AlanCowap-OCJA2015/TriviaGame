/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author User1
 */
public class PlayerSetupScreen extends Application{
    
    @Override
    public void start(Stage stage) {
        Button confirmButton = new Button ("Confirm Player");
        Button cancelButton = new Button ("Cancel");
        Label instructions = new Label("Players Setup!");
        Label title = new Label("Players setup");
        Label playerNamePrompt = new Label ("Enter Player's name: ");
        TextField playerName = new TextField();
        ListView playersList = new ListView();
        
        HBox buttonsBox = new HBox();
        buttonsBox.getChildren().addAll(confirmButton, cancelButton);
        buttonsBox.setSpacing(10);
        buttonsBox.setAlignment(Pos.CENTER);
        
        HBox playerNameInputBox = new HBox();
        playerNameInputBox.getChildren().addAll(playerNamePrompt, playerName);
        playerNameInputBox.setAlignment(Pos.CENTER);
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().addAll(instructions, playerNameInputBox, playersList,
                buttonsBox);
        
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
