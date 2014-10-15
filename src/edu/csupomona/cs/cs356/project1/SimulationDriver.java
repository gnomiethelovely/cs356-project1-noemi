package edu.csupomona.cs.cs356.project1;

import java.util.*;

public class SimulationDriver {

	public static void main(String[] args) {
		Question quest = new Question(4);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter response: ");
		String ans = sc.nextLine();
		
		quest.printAnswer();
	}

}
