package JavaHw;

import java.util.Scanner;

public class FavCountryFood {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		String country, food;
		
		System.out.println("Please enter your country");
		
		country=input.next();
		
		switch(country) {
		
		case "USA":
			food="burger";
			break;
		
		case "Afghanistan":
			food="Kebab";
			break;
			
		case "Vietnam":
			food="Pho";
			break;
		
		case "Poland":
			food="Pierogi";
			break;
		
		case "Kazakstan":
			food="horse";
			break;
			
		case "belarus":
			food="draniki";
			break;
			
		case "Tajikistan":
			food="plov";
			break;
		
		case "Mexico":
			food="tacos";
			break;
		
		default:
			food="Unknown";
			break;
		}
		
		System.out.println("Your food is "+food);
	}
}
