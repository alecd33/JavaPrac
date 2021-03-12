package mainPackage;

public class MoreTwoD {

	public static void main(String[] args) {
		String[][] cars= {
				{"Tesla", "Jeep", "Corvette"},
				{"Volkswagon","BMW","Audi","Porsche"},
				{"Kia", "Hyundai","Kia"},
				{"lambo","Maserati","Alfa Romeo","Fiat"}
		};
		
		for(int rows=0;rows<cars.length;rows++) {
			for(int columns=0;columns<cars[rows].length;columns++) {
				System.out.print(cars[rows][columns]+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------2nd way-------------------");
		
		for(String[] car:cars) {
			for(String vroom:car) {
				System.out.print(vroom+" ");
			}
			System.out.println();
			
			
			
		}
		
	}

}
