package JavaBook;

import java.util.Scanner;

public class JavaBookPrac {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Welcome to the Gallon to liter Calculator\n");
		
		System.out.println( "How many gallons do you have?\n");
		double gallons=input.nextDouble();
		
		double liters=gallons*3.7854;
		System.out.println("With "+gallons+" gallons you have a total of "+liters+" liters!");
		
	
		
		
	}

}
