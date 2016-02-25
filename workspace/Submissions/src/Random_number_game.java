import java.util.Random;
import java.util.Scanner;

public class Random_number_game {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//generating a random number
		Random random = new Random();
		int rand = (random.nextInt(99)+1);
		
		//initializing guess to be -1 just so the program will enter the loop
		int guess = -1;
		
		System.out.println("Try to guess the random number I am thinking of...");
		
		//This is the loop that the gamer goes through
		 while (guess != rand) {
			 
			 System.out.println("Enter your guess (between 1 and 100)");
				guess = scanner.nextInt();
			
			if (rand == guess) {
				System.out.println("\nYOU WIN!");
				}
			else if (guess < 1 || guess > 100) {
				System.out.println("Invalid Guess");
				}
			else if (guess > rand){
				System.out.println("Your guess is too high!!");
				}
			else {
				System.out.println("Your guess is too low!");
				}
			}
		
		}
	}


