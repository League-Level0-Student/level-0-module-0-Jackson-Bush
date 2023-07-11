package _03_print_and_popups._2_madlibs;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		//String prompt =  "If you find yourself having to cross a piranha-infested river, here's how to do it...";
		//String input = JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it...");
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the player to enter an adjective
		String adjective = JOptionPane.showInputDialog("Add an adjective");
		JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it " +adjective);

	
		String another = JOptionPane.showInputDialog("Add another adjective");
	
		// Get the player to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("Type a liquid");
		// Get the player to enter a body part
		String bodypart = JOptionPane.showInputDialog("Type a body part");
		// Get the player to enter a verb
		String verb = JOptionPane.showInputDialog("Type a verb");
		// Get the player to enter a place
		String place = JOptionPane.showInputDialog("Type a specific place");
		// The story below has has been written as a group of Strings joined together by + signs.
		// The story contains place holders, indicated by [** **] which you need to replace with
		// the values entered by the player.
		// Hint:  You will need to add more + signs to join the variables to the other parts of the story.
		JOptionPane.showInputDialog("Piranhas are more " +another +" during the day, so cross the river at night. Piranhas are attracted to fresh " 
		+liquid +" and will most likely take a bite out of your " +bodypart +" if you " 
		+verb +" Whatever you do, if you have an open wound, try to find another way to get back to the " +place +". Good luck!");
		String story = 
		"Piranhas are more [**adjective**] during the day, so cross the river at\n"  +
		"night. Piranhas are attracted to fresh [**type of liquid**] and will most\n"  +
		"likely take a bite out of your [**body part**] if you [**verb**]. Whatever\n"  +
		"you do, if you have an open wound, try to find another way to get\n"  +
		"back to the [**place**]. Good luck!";
		
		// Make a pop-up that contains the final story. The \n escape characters add line breaks to the story. 
		// If you need to, move them around to make your story look better in the pop-up
		
		// If you want to write your own Madlib story, just change the story variable and ask the player different questions.

		
		//JOptionPane.showInputDialog("Piranhas are more 'adjective' during the day, so cross the river at night");
		//String another = JOptionPane.showInputDialog("Add another adjective");
		//JOptionPane.showInputDialog("Piranhas are more " +another +" during the day, so cross the river at night");
		// Get the player to enter a type of liquid
		//JOptionPane.showInputDialog("Piranhas are more 'adjective' during the day, so cross the river at night");
		//String liquid = JOptionPane.showInputDialog("Type a liquid");
		//JOptionPane.showInputDialog("Piranhas are more " +another +" during the day, so cross the river at night");
	}
}