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

//interface for the question classes to implement
public interface QuestionInt {
	public void setQuestion();
	public boolean getQuestionType();
	public void displayQuestion();
	public void questions();
	public void pickQuestion();
}
