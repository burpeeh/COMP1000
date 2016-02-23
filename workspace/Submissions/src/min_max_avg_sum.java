import java.util.Scanner;

//main
public class min_max_avg_sum {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int[] numbers = new int[10];
	int i = 0;
	
	//prompts user to enter a number 10 times
	while(i<10) {
		System.out.println("Enter a number..");
		numbers[i] = scanner.nextInt();
			
		i++;
		}
		
	System.out.println(min(numbers));
	System.out.println(max(numbers));
	System.out.println(sum(numbers));
	System.out.println(avg(numbers));
		
	}
	
	//Computes the minimum value in the array of integers
	public static int min(int[] numbers){
		int themin = numbers[0];
		for (int i=0; i < numbers.length; i++) {
			themin = min(themin,numbers[i]);
		}
		return themin;
			  
	}
	//Part of method min()
	private static int min(int a, int b) {
			if (a<b) {
				return a;
		}
		return b;
	}
	
	//Computes the maximum value in the array of integers
	public static int max(int[] numbers) {
		int themax = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			themax = max(themax, numbers[i]);
		}
		return themax;
	}
	// part of method max()
	private static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	
	//Computes the sum in the array of integers
	public static int sum(int[] numbers) {
		int thesum = numbers[0];
		for (int i=0; i < numbers.length; i++) {
			thesum = thesum + numbers[i];
		}
		return thesum;
	}
	
	//Computes the average of in the array of integers using sum()
	public static double avg(int[] numbers) {
		double theavg = numbers[0];
		theavg = (sum(numbers))/10.0;
	
		return theavg;
	}
}
	

	

