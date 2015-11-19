/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Przemek Stepien
 */
public class MainScreen extends Application {
    
    @Override
    public void start(Stage stage) {
       
        Label title = new Label("Trivia Game");
        title.setStyle("-fx-font-size: 50");
        Label numPlayersText = new Label ("Select the number of players:   ");
        ComboBox numPlayersOptions = new ComboBox();
        ObservableList<String> numPlayer = 
                FXCollections.observableArrayList("1", "2", "3", "4");
        numPlayersOptions.setItems(numPlayer);
        Button btn = new Button();
        btn.setText("New Game");
        
        
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(numPlayersText, numPlayersOptions);
        hbox.setAlignment(Pos.CENTER);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(title, hbox, btn);
        vbox.setAlignment(Pos.CENTER);
        
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
