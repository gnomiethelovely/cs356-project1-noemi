/**
 * 
 */
package edu.csupomona.cs.cs356.project1;

/**
 * @author Noemi
 *
 */
public interface QuestionInt {
	public void createQuestion();
	public void createAnswers();
	public int selectCorrectAnswer();
	public void mapAnswer(int answer);
	public void decodeAnswer(int answer);
}
