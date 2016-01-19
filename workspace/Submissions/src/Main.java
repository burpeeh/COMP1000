import java.util.Scanner;

public class Main {
// Game of Mad Libs
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String adjective, nationality, name, noun, adjective2, noun2, adjective3, adjective4, pluralnoun, noun3, number, shapes, food, food2, number2;
		
		//prompt the user if he wants to play
		System.out.println("Would you like to play a game of MadLibs?");
		String ans = scanner.nextLine();
		
		
		if(ans == "yes") {
		//If yes we play..
			
		System.out.print("Enter an adjective.. ");
		adjective = scanner.nextLine();
		
		System.out.print("Give me a nationality.. ");
		nationality = scanner.nextLine();
		
		System.out.print("Enter a person's name.. ");
		name = scanner.nextLine();
		
		System.out.print("Enter a noun.. ");
		noun = scanner.nextLine();
		
		System.out.print("Give me a second adjective.. ");
		adjective2 = scanner.nextLine();
		
		System.out.print("Give me a second noun.. ");
		noun2 = scanner.nextLine();
		
		System.out.print("Enter a third adjective.. ");
		adjective3 = scanner.nextLine();
		
		System.out.print("..And a fourth adjective.. ");
		adjective4 = scanner.nextLine();
		
		System.out.print("Enter a plural noun, something like men, women, children, etc.. ");
		pluralnoun = scanner.nextLine();
		
		System.out.print("Give me a third noun.. ");
		noun3 = scanner.nextLine();
		
		System.out.print("Enter a number.. ");
		number = scanner.nextLine();
		
		System.out.print("Enter the plural word for a shape.. ");
		shapes = scanner.nextLine();
		
		System.out.print("Name any type of food.. ");
		food = scanner.nextLine();
		
		System.out.print("Name a second food.. ");
		food2 = scanner.nextLine();
		
		System.out.print("Finally enter another number.. ");
		number2 = scanner.nextLine();
		
		System.out.println(""
				+ ""
				+ "This story is called Pizza Pizza written by YOU!"
				+ ""
				+ "");
		
		System.out.println("	Pizza was invented by a " + adjective + " " + nationality);
		System.out.println("chef named " + name + ".  To make a pizza, you need");
		System.out.println("to take a lump of " + noun + ", and make a thin, round");
		System.out.println(adjective2 + " " + noun2 + ".  Then you cover it with " + adjective3);
		System.out.println("sauce, " + adjective4 + " cheese, and fresh chopped " + pluralnoun + ".");
		System.out.println("Next you have to bake it in a very hot " + noun3 + ".  When it is done,");
		System.out.println("cut it into " + number + " " +  shapes + ".  Some kids");
		System.out.println("like " + food + " pizza the best, but my favorite is the");
		System.out.println(food2 + " pizza.  If I could, I would eat pizza " + number2 + " times a day!");
		
		
		}
		else {
			System.out.println("Well you're really boring...");
			//If no/any other response..
		}
		
	}
}
