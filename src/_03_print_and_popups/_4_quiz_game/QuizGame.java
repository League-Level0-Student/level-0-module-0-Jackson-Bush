package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {
		
		// Create a variable to hold the user's score. Set it equal to zero. 
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER
		String QuestionI = JOptionPane.showInputDialog("What is the smallest size of Chicken McNugget availaible at McDonalds?");	
				// 2.  Ask the user a question 
		if (QuestionI.equals("4"))	{
			score+=1;
			JOptionPane.showInputDialog("Correct! Score = " +score);	
		}
		else {
			score-=1;
			JOptionPane.showInputDialog("Incorrect. Score = " +score);
		}
		String QuestionII = JOptionPane.showInputDialog("What is the largest size of Chicken McNugget availaible at McDonalds?");		
		if (QuestionII.equals("50"))	{
			score+=1;
			JOptionPane.showInputDialog("Correct! Score = " +score);	
		}
		else {
			score-=1;
			JOptionPane.showInputDialog("Incorrect. Score = " +score);
		}
		String QuestionIII = JOptionPane.showInputDialog("Can penguins fly?");		
		if (QuestionIII.equals("No"))	{
			score+=1;
			JOptionPane.showInputDialog("Correct! Score = " +score);	
		}
		else {
			score-=1;
			JOptionPane.showInputDialog("Incorrect. Score = " +score);
		}
		String QuestionIIII = JOptionPane.showInputDialog("What is the default font on Google Docs?");		
		if (QuestionIIII.equals("Arial"))	{
			score+=1;
			JOptionPane.showInputDialog("Correct! Score = " +score);	
		}
		else {
			score-=1;
			JOptionPane.showInputDialog("Incorrect. Score = " +score);
		}
		String QuestionV = JOptionPane.showInputDialog("Is coding fun?");		
		if (QuestionV.equals("Yes"))	{
			score+=1;
			JOptionPane.showInputDialog("Correct! Score = " +score);	
		}
		else {
			score-=1;
			JOptionPane.showInputDialog("Incorrect. Score = " +score);
		}
		JOptionPane.showInputDialog("You scored " +score +"points");
		// 3.  Use an if statement to check if their answer is correct
				
				// 4.  if the user's answer was correct, add one to their score 
		
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above 
				// Option: Subtract a point from their score for a wrong answer
		
		
		// After all the questions have been asked, tell the user their final score 
		
	}
}
