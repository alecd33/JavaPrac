package objectsAndClasses;

public class Methods {
	
	double greater(double a, double b){
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	void num(double num) {
		if(num%2==0) {
			System.out.println("Even");
		}else {
			System.out.println("odd");

		}
	}
	
	double returnArray(double[] arr) {
		
		double sum=0;
		for(double element: arr) {
			sum=sum+element;
		}
		return sum;
	}
	
	/*Write a method that returns true 
	 * if a string is a mirror of itself otherwise it returns
	 * false
	 * aba yes
	 * bbb yes
	 * bba no
	 *  */
	
	boolean mirror(String str) {
		String newStr="";
		for(int i=str.length()-1;i>=0;i--) {
			System.out.println(i+" "+str.charAt(i));
			newStr+=str.charAt(i);
		}
		
		System.out.println(newStr);
		if(str.equals(newStr)) {
			return true;
		}else {
			return false;
		}

	}
	
	
	
	
}
