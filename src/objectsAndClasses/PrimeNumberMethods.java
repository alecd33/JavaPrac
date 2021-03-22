package objectsAndClasses;

public class PrimeNumberMethods {
	
	void primeNum(int a) {
		
		boolean prime=true;
		
		if(a>1) {
			for(int i=2;i<a;i++) {
				if(a%i==0) {
					prime=false;
					break;
				}
			}
		}else {
			prime=false;
		}
		
		if(prime) {
			System.out.println(a+" is a prime number");
		}else {
			System.out.println(a+" is NOT a prime number");
		}
		
	}
	
}
