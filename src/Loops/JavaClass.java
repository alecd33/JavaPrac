package Loops;

import java.util.Scanner;

public class JavaClass {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		/*
		 * for(int i=1;i<=50;i++) { if(i%3==0) { continue; }
		 * 
		 * System.out.print(i+" "); }
		 * 
		 * System.out.println(); System.out.
		 * println("-------------------------------Task 2-----------------------------------"
		 * ); System.out.println();
		 * 
		 * 
		 * String creditCard;
		 * 
		 * do {
		 * 
		 * System.out.println("Apply for a credit credit card");
		 * creditCard=input.next();
		 * 
		 * }while (!creditCard.equalsIgnoreCase("Yes"));
		 * 
		 * System.out.println("Thank you applying");
		 * 
		 * 
		 * System.out.println(); System.out.
		 * println("-------------------------------Task 3-----------------------------------"
		 * ); System.out.println();
		 * 
		 * System.out.println("Please enter start number"); int start=input.nextInt();
		 * 
		 * System.out.println("Please enter end number"); int end=input.nextInt();
		 * 
		 * int sumOdd=0; int sumEven=0;
		 * 
		 * if(start!=end && start<end) {
		 * 
		 * System.out.print("Even ");
		 * 
		 * for(int i=start;i<=end;i++) { if(i%2!=0) { sumOdd+=i; }else { sumEven+=i; }
		 * 
		 * }
		 * 
		 * System.out.println("Sum of odd number "+start+" to "+end+" is equal to "
		 * +sumOdd);
		 * System.out.println("Sum of even number "+start+" to "+end+" is equal to "
		 * +sumEven);
		 * 
		 * }
		 */
		

		System.out.println();
		System.out.println("-------------------------------Task 3-----------------------------------");
		System.out.println();
		
		String item;
		int price;
		int money;
		int remainder;
		int sum=0;
		
		System.out.println("Please enter item");
		item=input.nextLine();
		
		System.out.println("Please enter price of "+item);
		price=input.nextInt();
		System.out.println("Please pay for "+item);
		
		do {
			money=input.nextInt();
			sum+=money;
			
			if(sum<price) {
				
				remainder=price-sum;
				System.out.println("Please give "+remainder);
			}else if(sum>price) {
				remainder=sum-price;
				System.out.println("Here is your change "+remainder);	
				break;
			}else {
				System.out.println("You got the right amount");
			}
			
		}while(price!=sum); 
		
		System.out.println("Thank you for your purchase");
		
		
		
	
	}

}
