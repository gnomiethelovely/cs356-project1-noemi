/*
 * Noemi Zamarripa 
 * 
 * CS356: Object Oriented Design 
 * Prof. Sun
 * 10-22-2014
 * 
 * Project 1: IClicker Simulator
 */
package edu.csupomona.cs.cs356.project1;

import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class QuestionT2 implements QuestionInt{

	//hashtable to associate the MC question number to the question/response string
	private Map<Integer, String> tf = new Hashtable<>();
	//random generator to decide which question is displayed 
	private Random r = new Random();
	//string to hold the question/response
	private String q1, q2, q3;
	//number to indicate the question to be chosen
	private int qnum;
	
	//questionT1 constructor that set the questions and choose them
	public QuestionT2(){
		questions();
		setQuestion();
		pickQuestion();	
	}
	
	//adds the question to the hashtable with its number
	@Override
	public void setQuestion() {
		tf.put(1, q1);
		tf.put(2, q2);
		tf.put(3, q3);
	}

	//false denotes that it is a T/F question
	@Override
	public boolean getQuestionType() {
		return false;
	}

	//displays the question stored as a value in the hashtable
	@Override
	public void displayQuestion() {
		String disp = tf.get(qnum);
		
		System.out.println(disp);		
	}

	//assigns the strings with question/response content
	@Override
	public void questions() {
		q1 = "Is it winter?\n"
				+ "A. Right\n"
				+ "B. Wrong\n";
		
		q2 = "There are 20 suns.\n"
				+ "A. Right\n"
				+ "B. Wrong\n";
		
		q3 = "Peanut butter and jelly sandwiches are\n"
				+ "the only sandwiches in existence.\n"
				+ "A. Right\n"
				+ "B. Wrong\n";
	}

	//decides the question that will be displayed based on the random number generator result
	@Override
	public void pickQuestion() {
		qnum = r.nextInt(3);
		qnum++;		
	}

}
