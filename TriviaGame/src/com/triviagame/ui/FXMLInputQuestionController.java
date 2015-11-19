/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame.ui;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.application.Application;
import static javafx.application.ConditionalFeature.FXML;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;
import javax.swing.ButtonGroup;

/**
 * FXML Controller class
 *
 * @author User1
 */
public class FXMLInputQuestionController implements Initializable {
    @FXML
    private TextField questionTextField;
    @FXML
    private ListView questionList;
    @FXML
     private TextField answerTextField1;
    @FXML
     private TextField answerTextField2;
    @FXML
     private TextField answerTextField3;
    @FXML
     private TextField answerTextField4;
    @FXML
    private RadioButton correctAnswer1;
    @FXML
    private RadioButton correctAnswer2;
    @FXML
    private RadioButton correctAnswer3;
    @FXML
    private RadioButton correctAnswer4;
    ObservableList<String> newList = FXCollections.observableArrayList();
  
    ToggleGroup group = new ToggleGroup();
    
    HashMap<String,Boolean> answers;
   
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        correctAnswer1.setToggleGroup(group);
        correctAnswer2.setToggleGroup(group);
        correctAnswer3.setToggleGroup(group);
        correctAnswer4.setToggleGroup(group);
    }   
    
    @FXML
    void onSaveClick(){
       
        String question = questionTextField.getText();
        ArrayList<String> answersArr = new ArrayList<>();
        answersArr.add(answerTextField1.getText());
        answersArr.add(answerTextField2.getText());
        answersArr.add(answerTextField3.getText());
        answersArr.add(answerTextField4.getText());

       answers = new HashMap<>();
        for(int i = 0; i < answersArr.size();++i){
            answers.put(answersArr.get(i), Boolean.FALSE);
        }
        Toggle tog = group.getSelectedToggle();
        String choice = tog.toString().substring(tog.toString().indexOf('c'),(tog.toString().indexOf(',')));
        if(question.length()>0){
          newList.add(question);
          questionList.setItems(newList);
          System.out.println(choice);
          checkAnswer(choice);
            
        }
       
        
        
    }
    void checkAnswer(String selectedAnswer){
        switch(selectedAnswer){
            case "correctAnswer1":
                answers.put(answerTextField1.getText(),Boolean.TRUE);
                break;
            case "correctAnswer2":
                 answers.put(answerTextField2.getText(),Boolean.TRUE);
                break;
            case "correctAnswer3":
                 answers.put(answerTextField3.getText(),Boolean.TRUE);
                break;
            case "correctAnswer4":
                 answers.put(answerTextField4.getText(),Boolean.TRUE);
                break;
        }
            
                
            
    }
    
//    @FXML 
//    void onRadioButtonClick(){
//        if(correctAnswer1.isSelected()){
//         correctAnswer2.setSelected(false);
//        @ correctAnswer3.setSelected(false);
//         correctAnswer4.setSelected(false);
//        }
//    }
    
  

//   @Override
//    public void start(Stage primaryStage) throws Exception {
//         Parent home = FXMLLoader.load(getClass().getResource("FXMLInputQuestion.fxml"));
//         //tableScene = new Scene(FXMLLoader.load(getClass().getResource("FXMLTable.fxml")));
//
//        
//        Scene scene = new Scene(home);
//        Scene homeScene = scene;
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
    
    
}
