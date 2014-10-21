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

public class IClickerService implements IClickerServiceInt{
	
	//instantiates hashtable to store student IDs and answers
	private Hashtable<String, Integer> answers = new Hashtable<>();
	//used to determine what output formats should be used
	private int num;
	//initialized counters for the number of a kind of response given
	private int a = 0, b = 0, c = 0, d = 0;
	
	//decides which question should be given 
	public void chooseQuestion(QuestionT1 t1, QuestionT2 t2, int n){
		//number passed from the driver decides which question type to show, 0 for MC and 1 for TF
		if ((n % 2) == 0){
			t1 = new QuestionT1();
			t1.displayQuestion();
		}else {
			t2 = new QuestionT2();
			t2.displayQuestion();
		}
		//sets the internal value num to equal n to pass question type to the student class
		num = n;
	}
	
	//prompts the student to answer the question given 
	public void receiveAnswers(Student student){
		//sets the question type in the student class to give appropriate answers
		if ((num % 2) == 0){
			student.setQuestionType(true);
		}else {
			student.setQuestionType(false);
		}
		
		//prompts student to answer question
		student.setAnswer();
		
		//prompts the student to answer again if they are tagged as 'weird'
		if (student.getTag() == true){
			student.setAnswer();
			answers.put(student.getId(), student.getAnswer());
		}else {
			answers.put(student.getId(), student.getAnswer());
		}
		
	}
	
	//displays results of answer responses for students 
	public void displayResults(){	
		//takes the values in the hashtable, and turns it into an array for easy tally 
		Object[] res = answers.values().toArray();
		System.out.println("\nAnswer Statistics:");
		
		//increases counter for each answer for total
		for (int i = 0; i < res.length; i++){
			switch ((Integer)res[i]) {
			case 1:
				a++;
				break;
			case 2:
				b++;
				break;
			case 3: 
				c++;
				break;
			case 4: 
				d++;
				break;
			default:
				break;
			}
		}	
		
		//prints out the appropriate format of responses, evens are for MC, odds are for TF
		if ((num % 2) == 0){
			System.out.println("A: " + a + " B: " + b + " C: " + c + " D: " + d);
		}else {
			System.out.println("Right: " + a + " Wrong: " + b);
		}
		
		//reset counter values 
		a = 0; 
		b = 0; 
		c = 0; 
		d = 0;		 
	}

	@Override
	public void recieveAnswer(Student s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayResult() {
		// TODO Auto-generated method stub
		
	}
}
