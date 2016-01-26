import java.util.Scanner;


public class UnitConverter {
	
	//Function for Temperature calculations
	public static double Temp(double F, Scanner scanner) {
		System.out.print("Enter a value in degrees Farenheit..\n");
		F = scanner.nextDouble();
		
		double C = (F-32)*(5.0/9);
		double K = (F-32)*(5.0/9)+273.15;
		
		return C;
		
		
		
	}
	
	//Main -- inputs
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double temp1, temp2;
		
		System.out.println("What converter would you like to use?\n - temperature\n" +
		" - mass\n - distance\n - time\n");
		String ans = scanner.nextLine();
		
		if (ans.equals("temperature")) {
			System.out.format("Enter a val");
			
			
		}
		
	}
} 
