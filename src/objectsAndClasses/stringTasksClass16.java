package objectsAndClasses;

public class stringTasksClass16 {

	public static void main(String[] args) {
		
		System.out.println("\n-----------Task1-------------\n");
		String sentence="Hi my name is John Doe";
		System.out.println(sentence.replace(" ", ""));
		
		
		
		System.out.println("\n-----------Task2-------------\n");

		String combo="12345ABCDabcd!@#$%^";
		
		String alpha=combo.replaceAll("[^a-zA-Z]", "");
		System.out.println(alpha.length());
		
		System.out.println("\n-----------Task3-------------\n");
		
		String a="Is it saturday? Is it raining? Do we have a Java Class today?";
		
		String[] strArr=a.split("[?]");
		System.out.println(strArr.length);
		

		
		
		

	}

}
