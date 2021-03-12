package JavaHw;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		/*
		 * We need to calculate final price after the discount
		 * 
		 * We check if there is a sale if no sale ---->i am not going for shopping if
		 * there is sale We will ask the item we will ask price
		 * 
		 * if price is less than 10 ---> 5% 10 and 100 --> 10% discount 100 and 500 -->
		 * 20% discount 500 + --> apply 30%
		 * 
		 * which item you purchased, what was the original price, what discount is
		 * applied and final sale
		 */
		double discountPrice = 0;

		System.out.println("Is there a sale? True or False");
		boolean sale = input.nextBoolean();

		if (!sale) {
			System.out.println("I am not going for shopping!");
		} else {
			System.out.println("What item would you like to purchase? ");
			String item = input.next();
			System.out.println("How much is that item? ");
			double originalPrice = input.nextDouble();
			double markDown=0;

			if (originalPrice < 10) {
				discountPrice = originalPrice * .95;
				markDown=.05*100;
			} else if (originalPrice >= 10 && originalPrice < 100) {
				discountPrice = originalPrice * .90;
				markDown=.10*100;
			} else if (originalPrice >= 100 && originalPrice < 500) {
				discountPrice = originalPrice * .80;
				markDown=.20*100;
			} else if (originalPrice >= 500) {
				discountPrice = originalPrice * .70;
				markDown=.30*100;
			}

			System.out.println("You bought a " + item + ". The original price was $" + originalPrice + 
					". There was a mark down of "+markDown+"% !"+" your final price is $" + discountPrice);

		}

		/*
		 * int time; String timeOfTheDay=null;
		 * 
		 * System.out.println("Please enter time in 24 hour format ");
		 * time=input.nextInt();
		 * 
		 * if(time>=1 && time<=11) { timeOfTheDay="Morning"; }else if(time>=12 &&
		 * time<=13) { timeOfTheDay="Noon"; }else if(time>=14 && time<=17) {
		 * timeOfTheDay="AfterNoon"; }else if(time>=18 && time<=21) {
		 * timeOfTheDay="Evening"; }else if(time>=22 && time<=24) {
		 * timeOfTheDay="Night"; } System.out.println();
		 */

	}

}
