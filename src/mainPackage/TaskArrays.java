package mainPackage;

import java.util.Scanner;

public class TaskArrays {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		double nums, sum=0;
		
		System.out.println("How many enter size of array?");
		int size=input.nextInt();
		
		double[] array=new double[size];
		
		for(int i=0; i<size;i++) {
			System.out.println("Enter a double");
			array[i]=input.nextDouble();
			sum+=array[i];
			
		}
		
		System.out.println("The sum of "+size+" elements from an array ="+sum);
		System.out.println("--------------other way for each loop----------------");
		
		sum=0;
		
		for(double a:array) {
			sum+=a;
		}
		
		System.out.println("The sum of "+size+" elements from an array ="+sum);
	}

}
