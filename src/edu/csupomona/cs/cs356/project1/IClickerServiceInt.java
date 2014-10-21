package edu.csupomona.cs.cs356.project1;

import java.util.Hashtable;
import java.util.Map;

public interface IClickerServiceInt {
	public Map<String, Integer> answers = new Hashtable<>();
	public void chooseQuestion(QuestionT1 q1, QuestionT2 q2, int i);
	public void recieveAnswer(Student s);
	public void displayResult();
}
