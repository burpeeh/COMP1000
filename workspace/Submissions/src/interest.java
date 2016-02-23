import java.util.Scanner;

public class interest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double value, rate;
		int years;
				
		System.out.println("Enter the current price of the item..");
		value = scanner.nextDouble();
		
		System.out.println("Enter the number of years..");
		years = scanner.nextInt();
		
		System.out.println("Enter the inflation rate as a percentage..");
		rate = scanner.nextDouble();
		rate = rate/100;
		
		int i = 0;
		while (i < years) {
			value = value*(1+0.1);
			i++;
		}
		
		
		System.out.println(String.format("After %d years, the price will be $%.2f", years, value));
	}

}
