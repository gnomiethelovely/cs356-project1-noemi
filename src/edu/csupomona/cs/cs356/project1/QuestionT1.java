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
import java.util.Random;

public class QuestionT1 implements QuestionInt{

	//hashtable to associate the MC question number to the question/response string
	private Hashtable<Integer, String> mc = new Hashtable<>();
	//random generator to decide which question is displayed 
	private Random r = new Random();
	//string to hold the question/response
	private String q1, q2, q3;
	//number to indicate the question to be chosen
	private int qnum;
	
	//questionT1 constructor that set the questions and choose them
	public QuestionT1() {
		questions();
		setQuestion();
		pickQuestion();
	}

	//displays the question stored as a value in the hashtable
	@Override
	public void displayQuestion() {
		String disp = mc.get(qnum);
		
		System.out.println(disp);
	}

	//true denotes that this is an M.C. question
	@Override
	public boolean getQuestionType() {
		return true;
	}

	//adds the question to the hashtable with its number
	@Override
	public void setQuestion() {
		mc.put(1, q1);
		mc.put(2, q2);
		mc.put(3, q3);
	}

	//assigns the strings with question/response content
	@Override
	public void questions() {
		q1 = "Which is a palindrome?\n"
				+ "A. palindrome\n"
				+ "B. fox\n"
				+ "C. anchor\n"
				+ "D. racecar\n";
		
		q2 = "How many months are in a year?\n"
				+ "A. 13\n"
				+ "B. 12\n"
				+ "C. 11\n"
				+ "D. 15\n";
		
		q3 = "What is 2+2?\n"
				+ "A. fish\n"
				+ "B. 3.14\n"
				+ "C. 4\n"
				+ "D. 8\n";
	}

	//decides the question that will be displayed based on the random number generator result
	@Override
	public void pickQuestion() {
		qnum = r.nextInt(3);
		qnum++;
	}
}
