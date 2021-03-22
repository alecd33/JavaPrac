package objectsAndClasses;

import java.util.Scanner;

public class MethodTasksMain {

	public static void main(String[] args) {
		MethodTaskOne grade=new MethodTaskOne();
		
		
		
		
		
		
		
		
		/* Grade Task*/
		
		Scanner input=new Scanner(System.in);
		
		int score=input.nextInt();
		
		grade.getGrade(score);
		
		System.out.println(grade.getGrade(score));

	}

}
