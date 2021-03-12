package mainPackage;

public class AllValuesFrom2DArray {

	public static void main(String[] args) {
		
		String[][] usa= {
				{"Alexandria","Oakton","Arlington","Virgina Beach","Fairfax"},
				{"Philly","Strassburg","Pittsburgh"},
				{"Boston","Quincy","Springfield","Burlington"},
				{"LA", "Long Beach","San Fran", "Sacremento","Sanata Barbara"},
				{"Miami","Orlando","Tampa","Tallahasee"}
		};
		
		System.out.println(usa.length);// 5 single arrays/ 5 rows total
		System.out.println(usa[0].length);//5 elements inside 1 array/ 5 columns in 1 row
		System.out.println(usa[1].length);//3 elements inside 2 array/ 3 columns in 2 row
		System.out.println(usa[2].length);//4 elements inside 3 array/ 4 columns in 3 row
		
		for (int r=0;r<usa.length; r++) { //iterates over rows
			for(int c=0;c<usa[r].length; c++) {
				System.out.println(usa[r][c]);
			}
		}
		
		System.out.println("-----------------------");
		
		for(String[] cities:usa) {
			for(String c:cities) {
				System.out.print(c+" ");
			}
			System.out.println();
		}

		
	}

}
