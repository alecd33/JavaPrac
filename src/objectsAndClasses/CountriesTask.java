package objectsAndClasses;

public class CountriesTask {
	/*Create a method that will
	 *  say Hello in different 
	 *  language based on the 
	 *  country that will 
	 *  passed when method is 
	 *  oiexecuted.*/
	
	void hello(String country) {
		if(country.equals("America")) {
			System.out.println("Hello");
		}else if(country.equals("France")) {
			System.out.println("Bonjour");
		}else if(country.equals("Spain")) {
			System.out.println("Hola");
		}else if(country.equals("Russia")) {
			System.out.println("Zdravstvuyte");
		}else if(country.equals("China")) {
			System.out.println("Nin Hao");
		}else if(country.equals("Germany")) {
			System.out.println("Guten Tag");
		}else if(country.equals("Japan")) {
			System.out.println("Konnichiwa");
		}


	}
}
