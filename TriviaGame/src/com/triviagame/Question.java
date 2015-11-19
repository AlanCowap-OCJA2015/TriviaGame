package com.triviagame;

import java.util.HashMap;

public class Question {
	private String question;
	private HashMap<String, Boolean> answers;
	//private Player questioneer;
	
	//Constructor
	public Question(String question, HashMap<String, Boolean> answers) {
		super();
		this.question = question;
		this.answers = answers;
	}
	
	//Getters and Setters
	public String getQuestion() {
		return question;
	}
	
	public void setQuestion(String question) {
		this.question = question;
	}
	
	public HashMap<String, Boolean> getAnswers() {
		return answers;
	}
	
	public void setAnswers(HashMap<String, Boolean> answers) {
		this.answers = answers;
	}
}
