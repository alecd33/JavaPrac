package objectsAndClasses;

import java.util.Scanner;

public class stringTasks {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a User Name");
		String username=input.nextLine();
	
		System.out.println("Enter a Password");
		String password=input.nextLine();
		
		System.out.println("Please confirm your password");

		String confirmedPass=input.nextLine();
		Boolean created =true;
		
		if(username.isEmpty()|| password.isEmpty()) {
			System.out.println("Username and Password cannot be empty");
			created =false;
		}else if (password.length()<8) {
			System.out.println("Password is too short");
			created =false;

		}else if(password.contains(username)) {
			System.out.println("Password cannot contain username");
			created =false;

		}else if(!password.equals(confirmedPass)) {
			System.out.println("Passwords do not match");
			created =false;

		}
		
		if(created) {
			System.out.println("Your username and password has been created");
		}

	}

}
