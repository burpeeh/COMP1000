import java.util.Scanner;

public class UnitConverter {
	
	//Main -- inputs
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double temp1, F, K, C, mass, kg, g, lb, oz, dist, km, m ,mi, time, s, min, hr, day, year;
		
		//prompt user for type of conversion
		System.out.println("What converter would you like to use?\n - temperature\n" +
		" - mass\n - distance\n - time\n");
		String ans = scanner.nextLine();
		
		//temp conversion
		if (ans.equals("temperature")) {
			System.out.print("Enter a unit: celsius, fahrenheit or kelvin\n");
			String unit = scanner.nextLine();
			System.out.print("Enter a value..\n");
			temp1 = scanner.nextDouble();
			
			//celsius --> kelvin & fahrenheit
			if (unit.equals("celsius")) {
				F = (temp1 * (9.0/5)) + 32;
				K = temp1 + 273.15;	
				
				System.out.format("%f degrees celsius is equal to:\n-- %f degrees fahrenheit\n-- %f kelvin\n",temp1, F, K);
			}
			//kelvin --> fahrenheit & celsius
			else if (unit.equals("kelvin")) {
				F = (temp1 - 273.15) * (9.0/5) + 32;
				C = temp1 - 273.15;
				
				System.out.format("%f kelvin is equal to:\n-- %f degrees fahrenheit\n-- %f degrees celsius\n",temp1, F, C);
			} 
			//fahrenheit --> celsius & kelvin
			else {
				C = (temp1 - 32) * (5.0/9);
				K = (temp1 - 32) * (5.0/9) + 273.15;
				
				System.out.format("%f degrees fahrenheit is equal to:\n-- %f degrees celsius\n-- %f kelvin\n",temp1, C, K);
			}
		}
		
		//mass conversion
		else if (ans.equals("mass")) {
			System.out.print("Enter a unit:  kg, g, lb, oz\n");
			String unit = scanner.nextLine();
			System.out.print("Enter a value..\n");
			mass = scanner.nextDouble();
			
			if (unit.equals("kg")) {
				g = mass * 1000;
				lb = g * .00220462;
				oz = g * .035274;
				
				System.out.format("%f kilograms is equal to:\n-- %f grams\n-- %f pounds\n-- %f ounces",mass, g, lb, oz);
			}
			else if (unit.equals("g")) {
				kg = mass/1000;
				lb = mass * .00220462;
				oz = mass * .035274;
				
				System.out.format("%f grams is equal to:\n-- %f kilograms\n-- %f pounds\n-- %f ounces",mass, kg, lb, oz);
			}
			else if (unit.equals("lb")) {
				kg = mass * .453592;
				g = kg * 1000;
				oz = g * .035274;
				
				System.out.format("%f pounds is equal to:\n-- %f kilograms\n-- %f grams\n-- %f ounces",mass, kg, g, oz);
			}
			else {
				kg = mass * .0283495;
				g = kg * 1000;
				lb = g * .00220462;
				
				System.out.format("%f ounces is equal to:\n-- %f kilograms\n-- %f grams\n-- %f lb",mass, kg, g, lb);
			}
		}
		
		// distance conversion
		else if (ans.equals("distance")) {
			System.out.print("Enter a unit: km, m, mi\n");
			String unit = scanner.nextLine();
			System.out.print("Enter a value..\n");
			dist = scanner.nextDouble();
			
			if (unit.equals("km")) {
				m = dist * 1000;
				mi = m * .000621371;
				
				System.out.format("%f kilometers is equal to:\n-- %f meters\n-- %f miles",dist, m, mi);
			}
			else if (unit.equals("m")) {
				km = dist/1000;
				mi = dist * .000621371;
				
				System.out.format("%f meters is equal to:\n-- %f kilometers\n-- %f miles",dist, km, mi);
			}
			else {
				km = dist * 1.60934;
				m = km * 1000;
				
				System.out.format("%f miles is equal to:\n-- %f kilometers\n-- %f meters",dist, km, m);
			}
		}
		
		//time conversion
		else {
			System.out.print("Enter a unit: s, min, hr, day, year\n");
			String unit = scanner.nextLine();
			System.out.print("Enter a value..\n");
			time = scanner.nextDouble();
			
			if (unit.equals("s")) {
				min = time/60;
				hr = min/60;
				day = hr/24;
				year = day/365;
				
				System.out.format("%f seconds is equal to:\n-- %f minutes\n-- %f hours\n-- %f days\n-- %f years ",time, min, hr, day, year);
			}
			else if (unit.equals("min")) {
				s = time * 60;
				hr = time/60;
				day = hr/24;
				year = day/365;
				
				System.out.format("%f minutes is equal to:\n-- %f seconds\n-- %f hours\n-- %f days\n-- %f years ",time, s, hr, day, year);
			}
			else if (unit.equals("hr")) {
				s = time * 3600;
				min = s/60;
				day = time/24;
				year = day/365;
				
				System.out.format("%f hours is equal to:\n-- %f seconds\n-- %f minutes\n-- %f days\n-- %f years ",time, s, min, day, year);
			}
			else if (unit.equals("day")) {
				hr = time * 24;
				min = hr * 60;
				s = min * 60;
				year = time/365;
				
				System.out.format("%f days is equal to:\n-- %f seconds\n-- %f minutes\n-- %f hours\n-- %f years ",time, s, min, hr, year);
			}
			else {
				day = time * 365;
				hr = day * 24;
				min = hr * 60;
				s = min * 60;
				
				System.out.format("%f years is equal to:\n-- %f seconds\n-- %f minutes\n-- %f hours\n-- %f days ",time, s, min, hr, day);
			}
		
		}
	}
}

