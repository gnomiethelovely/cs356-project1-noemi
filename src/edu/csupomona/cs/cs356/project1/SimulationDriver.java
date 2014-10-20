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

public class SimulationDriver {

	public static void main(String[] args) {
		System.out.println("Welcome to IClicker!");
		
		//instantiates iClicker service
		IClickerService ics = new IClickerService();
		//instantiates both questions types
		QuestionT1 t1 = new QuestionT1();
		QuestionT2 t2 = new QuestionT2();
		//initializes an array of students 
		Student[] students = new Student[20]; 
		
		//instantiates the individual student objects
		for (int n = 0; n < students.length; n++){
			students[n] = new Student();
		}
		
		//does 6 rounds of question and answer
		for (int i = 0; i < 6; i++){
			ics.chooseQuestion(t1, t2, i);
			try { 
				System.out.println("Waiting for student responses...");
				Thread.sleep(4000); 
			} catch(InterruptedException e) { 
				System.out.println("Something broke, sorry.");
			} 
			
			//receiving answers for class of students 
			for (int j = 0; j < students.length; j++){
				ics.receiveAnswers(students[j]);
			}
			
			//displays the results from each question
			ics.displayResults();
			
			//displays proper label 
			if (i == 5){
				System.out.println("\nDone! Thanks for using IClicker!");
			}else {
				System.out.println("-----------------------------------------");
				System.out.println("\nNext question!");
			}
		}			
	}

}
