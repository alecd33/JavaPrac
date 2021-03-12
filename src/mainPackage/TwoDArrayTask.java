package mainPackage;

public class TwoDArrayTask {

	public static void main(String[] args) {
		String[][] first= {
				{"Mr ", "Mrs ", "Ms ", "Miss " },
				{ "Smith", "Jordan", "Jackson", "Obama"}
						
		};
	

		System.out.println(first[0][1]+first[1][0]);
		System.out.println(first[0][0]+first[1][3]);
		System.out.println(first[0][2]+first[1][2]);
		System.out.println(first[0][3]+first[1][1]);

		System.out.println("----------------------------------------");

		String[][] namesGrades= {
				{"Eliaz","Jalen","Sarah","Money"},
				{"A","B","C","D" }
		};
		
		System.out.println(namesGrades[0][0]+" "+namesGrades[1][0]);
		System.out.println(namesGrades[0][1]+" "+namesGrades[1][1]);
	}

}
