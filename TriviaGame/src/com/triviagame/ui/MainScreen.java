/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
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
    private static Stage defaultStage;
    @Override
    public void start(Stage stage) {
       defaultStage = stage;
        Label titleLabel = new Label("Trivia Game");
        titleLabel.setStyle("-fx-font-size: 50");
        Label numPlayersText = new Label ("Select the number of players:   ");
        ComboBox numPlayersOptions = new ComboBox();
        ObservableList<String> numPlayer = 
                FXCollections.observableArrayList("1", "2", "3", "4");
        numPlayersOptions.setItems(numPlayer);
        Button btn = new Button();
        btn.setText("New Game");
        
        btn.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
              stage.setScene(new PlayerSetupScreen().getScene());
              
            }
            
        });
        
        HBox hbox = new HBox();
        hbox.getChildren().addAll(numPlayersText, numPlayersOptions);
        hbox.setAlignment(Pos.CENTER);
        VBox vbox = new VBox();
        vbox.getChildren().addAll(titleLabel, hbox, btn);
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        
        Scene scene = new Scene(vbox, 500, 500);
        
        stage.setTitle(titleLabel.getText());
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static Stage getDefaultStage() {
        return defaultStage;
    }
    
    
}
