/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Przemek Stepien
 */
public class GameScreen{
    
    private String question = null;
    private String playerName = null;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Scene getScene() {
      
        Label title = new Label("Trivia Game is On!");
        Label questionLabel = new Label ("Question: ");
        Label questionAsked = new Label (question);
        Label playersNameLabel = new Label ("Question asked by: ");
        Label playersName = new Label (playerName);
        Label answerALabel = new Label ("A: ");
        Label answerBLabel = new Label ("B: ");
        Label answerCLabel = new Label ("C: ");
        Label answerDLabel = new Label ("D: ");
        
        playersNameLabel.setVisible(false);
        playersName.setVisible(false);
        
        Button answerAButton = new Button ("Answer A");
        Button answerBButton = new Button ("Answer B");
        Button answerCButton = new Button ("Answer C");
        Button answerDButton = new Button ("Answer D");
        
        answerAButton.setPrefSize(400, 30);
        answerBButton.setPrefSize(400, 30);
        answerCButton.setPrefSize(400, 30);
        answerDButton.setPrefSize(400, 30);
               
        HBox questionBox = new HBox();
        HBox playersNameBox = new HBox();
        HBox answerABox = new HBox();
        HBox answerBBox = new HBox();
        HBox answerCBox = new HBox();
        HBox answerDBox = new HBox();
        
        questionBox.getChildren().addAll(questionLabel, questionAsked);
        playersNameBox.getChildren().addAll(playersNameLabel, playersName);
        answerABox.getChildren().addAll(answerALabel, answerAButton);
        answerBBox.getChildren().addAll(answerBLabel, answerBButton);
        answerCBox.getChildren().addAll(answerCLabel, answerCButton);
        answerDBox.getChildren().addAll(answerDLabel, answerDButton);
        
        questionBox.setAlignment(Pos.CENTER);
        playersNameBox.setAlignment(Pos.CENTER);
        answerABox.setAlignment(Pos.CENTER);
        answerBBox.setAlignment(Pos.CENTER);
        answerCBox.setAlignment(Pos.CENTER);
        answerDBox.setAlignment(Pos.CENTER);
        
        questionBox.setSpacing(10);
        playersNameBox.setSpacing(10);
        answerABox.setSpacing(10);
        answerBBox.setSpacing(10);
        answerCBox.setSpacing(10);
        answerDBox.setSpacing(10);        
        
        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().addAll(questionBox, playersNameBox, answerABox, 
                answerBBox, answerCBox, answerDBox);
        
        Scene scene = new Scene(vbox, 500, 500);
        
        return scene;
    }
}
