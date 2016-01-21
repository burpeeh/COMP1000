import java.util.Scanner;

public class Main {
// Game of Mad Libs
	
	// getInput eliminates repetitive code usage
	 public static String getInput(String pos, Scanner scanner) {
	 System.out.format("Enter %s ", pos);
	 return scanner.nextLine();
	 
	  }
	//This can be used instead of repeating the same code to prompt someone for a word.
	//This is a created method/subroutine/function to reduce the amount of lines in your code.
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		
		String adjective, nationality, name, noun, adjective2, noun2, adjective3, adjective4, pluralnoun, noun3, number, shapes, food, food2, number2;
		
		//prompt the user if he wants to play
		System.out.println("Would you like to play a game of MadLibs? yes or no?");
		String ans = input.nextLine();
		
		//ans.equals() compares what value ans has to yes
		if(ans.equals("yes")) {
		//If yes we play..
			
		//Inputs
		adjective = getInput("an adjective..", scanner);
		nationality = getInput("a nationality..", scanner);
		name = getInput("a name..", scanner);
		noun = getInput("a noun..", scanner);
		adjective2 = getInput("a second adjective..", scanner);
		noun2 = getInput("another noun..", scanner);
		adjective3 = getInput("a third adjective..", scanner);
		adjective4 = getInput("a fourth adjective..", scanner);
		pluralnoun = getInput("a plural noun..", scanner);
		noun3 = getInput("a third noun..", scanner);
		number = getInput("any number..", scanner);
		shapes = getInput("the plural form of a shape..", scanner);
		food = getInput("a food..", scanner);
		food2 = getInput("a second food..", scanner);
		number2 = getInput("a second number..", scanner);
		
		System.out.println("\nThis story is called Pizza Pizza written by YOU!\n");
		
		//Output
		System.out.format("	Pizza was invented by a %s %s chef named %s.\n" +
		"To make pizza, you need to take a lump of %s, and make a thin, round\n" +
		"%s %s.  Then you cover it with %s sauce, %s cheese, and fresh chopped %s.\n" +
		"Next you have to bake it in a very hot %s.  When it is done, cut it into\n" +
		"%s %s.  Some kids like %s pizza the best, but my favorite is the %s\n" +
		"pizza.  If I could, I would eat pizza %s times a day!",adjective, nationality, name, 
		noun, adjective2, noun2, adjective3, adjective4, pluralnoun, noun3, number, shapes, food, food2, number2 );
		
		}
		else {
			System.out.println("Well you're really boring...");
			//If no/any other response..
		}	
	}
}
