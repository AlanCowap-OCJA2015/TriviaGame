/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Przemek Stepien
 */
public class PlayerSetupScreen {

    public Scene getScene() {
        Button confirmButton = new Button("Confirm Players");
        Button addButton = new Button("add Player");
        Button cancelButton = new Button("Cancel");
        Label titleLabel = new Label("Players Setup!");
        Label playerNameLabel = new Label("Enter Player's name: ");
        Label numQuestionsLabel = new Label("Pick the amount of questions per player: ");
        ComboBox numQuestionsOptions = new ComboBox();
        ObservableList<String> numQuestions
                = FXCollections.observableArrayList("1", "2", "3", "4");
        numQuestionsOptions.setItems(numQuestions);
        TextField playerName = new TextField();
        ListView playersList = new ListView();

        confirmButton.setOnAction(null);
        addButton.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event) {
                
            }
            
        });

        HBox buttonsBox = new HBox();
        buttonsBox.getChildren().addAll(addButton, confirmButton, cancelButton);
        buttonsBox.setSpacing(10);
        buttonsBox.setAlignment(Pos.CENTER);

        HBox playerNameInputBox = new HBox();
        playerNameInputBox.getChildren().addAll(playerNameLabel, playerName);
        playerNameInputBox.setAlignment(Pos.CENTER);

        HBox numQuestionsBox = new HBox();
        numQuestionsBox.getChildren().addAll(numQuestionsLabel, numQuestionsOptions);
        numQuestionsBox.setAlignment(Pos.CENTER);
        numQuestionsBox.setSpacing(10);

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().addAll(titleLabel, playerNameInputBox, playersList,
                numQuestionsBox, buttonsBox);

        Scene scene = new Scene(vbox, 500, 500);
        return scene;

    }

}
