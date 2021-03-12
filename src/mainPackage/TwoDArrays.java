package mainPackage;

import java.util.Scanner;

public class TwoDArrays {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int items,userNums;
		
		System.out.println("How many numbers you want would you like to ask?");
		items=input.nextInt();
		
		int[] nums=new int[items];
		
		
		
		for(int i=0; i<items;i++) {
			
			System.out.println("Enter numbers");
			nums[i]=input.nextInt();
			
		}
		
		for(int j=0;j<nums.length;j++) {
			System.out.print(nums[j]+" ");
		}
		System.out.println();
		for(int allNums:nums) {
			System.out.print(allNums+" ");
		}
				
		
		

	}

}
