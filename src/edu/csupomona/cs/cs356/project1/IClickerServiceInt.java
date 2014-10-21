package edu.csupomona.cs.cs356.project1;

public interface IClickerServiceInt {
	public void chooseQuestion(QuestionT1 q1, QuestionT2 q2, int i);
	public void recieveAnswer(Student s);
	public void displayResult();
}
