package edu.csupomona.cs.cs356.project1;

public class Question implements QuestionInt{
	
	private int a, b, c, d;
	private boolean right, wrong;
	private int type1 = 4;
	private static boolean isType1 = false;
	private char result;
	private boolean tfresult;
	private int correct;
	
	public Question(int type1){
		//maps the answers to numbers
		mapAnswer(type1);
		createQuestion();
		createAnswers();
		correct = selectCorrectAnswer();
		decodeAnswer(correct);
	}
	
	@Override
	public void createQuestion() {
		if (isType1 == true){
			System.out.println("Which word is a palindrome?");
		}else {
			System.out.println("It is winter.");
		}
	}

	@Override
	public void createAnswers() {
		if (isType1 == true){
			System.out.println("A. palindrome");
			System.out.println("B. shoe");
			System.out.println("C. tuna");
			System.out.println("D. racecar");
		}else {
			System.out.println("1. Right");
			System.out.println("2. Wrong");
		}
	}

	@Override
	public int selectCorrectAnswer() {
		int answ;
		if (isType1 == true){
			answ = 4;
		}else {
			answ = 2;
		}
		return answ;
	}

	@Override
	public void mapAnswer(int answer) {
		//maps answers according to the value passed from the constructor
		if (answer == type1){
			a = 1;
			b = 2;
			c = 3;
			d = 4;
			isType1 = true;
		}else {
			right = true;
			wrong = false;
		}
	}

	@Override
	public void decodeAnswer(int answer) {
		if (isType1 == true){
			switch (answer){
			case 1:
				result = 'a';
				break;
			case 2:
				result = 'b';
				break;
			case 3:
				result = 'c';
				break;
			case 4:
				result = 'd';
				break;
			}
		}else {
			switch (answer){
			case 1:
				tfresult = right;
				break;
			case 2:
				tfresult = wrong;
				break;
			}
		}
	}
	
	public void printAnswer(){
		if (isType1 == true){
			System.out.println("Answer is " + result);
		}else {
			System.out.println("Answer is " + tfresult);
		}
	}

}
