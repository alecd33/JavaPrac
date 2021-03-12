package mainPackage;

public class taskeight {

	public static void main(String[] args) {
		
		int[] numbers ={ 100, 50, 75, 1000,55,67,1005 };
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
		System.out.println("The second largest number within the array is "+secondLargest);	
		
		
	
		
	}
}
