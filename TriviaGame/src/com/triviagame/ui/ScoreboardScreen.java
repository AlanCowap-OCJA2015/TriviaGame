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
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Przemek Stepien
 */
public class ScoreboardScreen extends Application {
    
    private int score = 0;
    
    @Override
    public void start(Stage stage) {

        Label titleLabel = new Label("Scoreboard!");
        Label winnerLabel = new Label ("Winner!: ");
        Label looserLabel = new Label ("Looser!: ");
                

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().addAll(winnerLabel, looserLabel);

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

}
