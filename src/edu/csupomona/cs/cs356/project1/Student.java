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

import java.util.Random;

public class Student {
	
	//string to hold the id
	private String id;
	//int to hold the answer
	private int answer;
	//tag to indicate if the student will submit 2 answers, initially false
	private boolean tag = false;
	//boolean to indicate the type of question, MC or TF
	private boolean qType;
	//random generators to make the ID and select the student answer
	private Random forId;
	private Random selectAns;
	
	//constructs a student object setting id, tagging as 'weird', initializing Random generators, and setting 
	//answer to 0
	public Student(){
		forId = new Random();
		selectAns = new Random();
		id = generateId(forId, "0123456789", 7);
		answer = 0;
		tag = decideWeird();
	}
	
	//tells the student what kind of question they should be answering 
	public void setQuestionType(boolean type){
		//true indicates M.C., false indicates T/F
		qType = type;
	}
	
	//returns the boolean to indicate the type of question
	public boolean getQuestionType(){
		return qType;
	}
	
	//returns the tag to indicate if the student will submit 2 responses
	public boolean getTag(){
		return tag;
	}
	
	//tags the student as one who submits multiple entries 
	public boolean decideWeird(){
		Random w = new Random();
		int weird = w.nextInt(11);
		
		if (weird % 2 == 0){
			return true;
		}else {
			return false;
		}
	}
	
	//generates the random answer for the student
	public void setAnswer(){
		int a;
		if (qType == true){
			a = selectAns.nextInt(4);
			a++;
		}else {
			a = selectAns.nextInt(2);
			a++;
		}
		answer = a;
	}
	
	//returns the answer of the student
	public int getAnswer(){
		return answer;
	}
	
	//returns the ID of each student
	public String getId(){
		return id;
	}
	
	//generates a random string of numbers to identify each student
	public static String generateId(Random rng, String characters, int length)
	{
	    char[] text = new char[length];
	    for (int i = 0; i < length; i++)
	    {
	        text[i] = characters.charAt(rng.nextInt(characters.length()));
	    }
	    return new String(text);
	}
}
