/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.triviagame;

/**
 *
 * @author User1
 */
public class Player {
    private String name ;
    private int score;
    private int questionsAnswered;
    
    Player(String name , int score , int questionsAnswered ){
        this.name = name;
        this.score = score;
        this.questionsAnswered = questionsAnswered;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    public void setQuestionsAnswered(int questionsAnswered) {
        this.questionsAnswered = questionsAnswered;
    }
    
    
}
