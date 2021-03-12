package mainPackage;

public class Duplicate8 {

	public static void main(String[] args) {
		int[] numbers ={ 100, 50, 65, 100,100,67,100 };
		int largest=0;
		int secondLargest=0;
	
		for(int i=0;i<numbers.length;i++) {
			
				if(numbers[i]>largest) {
					largest=numbers[i];
				} 
				
				
				
			
		}
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>secondLargest) {
				if(numbers[i]==largest) {
					continue;
				}
				
				secondLargest=numbers[i];
				
			} 
			
		}
		System.out.println(largest);
		System.out.println("The second largest number within the array is "+secondLargest);	
		
	

	}

}
