package Loops;

public class OddAndEvens {

	public static void main(String[] args) {
		int oddSum=0;
		int evenSum=0;
		
		
		for(int i=1;i<=50;i++) {
			if(i%2==0) {
			evenSum+=i;
			}
		}
		System.out.println("The sum of even numbers is "+evenSum+"\n");
		
		System.out.println("--------------------------------------------\n");
		
		for(int i=1;i<=50;i++) {
			if(i%2==1) {
			oddSum+=i;
			}
		}
		System.out.println("The sum of odd numbers is "+oddSum);
		
	
	
	}

}
