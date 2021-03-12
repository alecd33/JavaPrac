package JavaClassNestedLoops;

public class NestedLoops {

	public static void main(String[] args) {
		for (int h=0; h<=24;h++) {
			for(int m=0; m<=59;m++) {
				if(h<=9) {
					if(m<=9) {
						System.out.println("0"+h+":0"+m);
					}else {
						System.out.println("0"+h+":"+m);
					}
				} else {
					if(m<=9) {
						System.out.println(h+":0"+m);
					}else {
						System.out.println(h+":"+m);

					}
				}
				
				
			}
		}
		System.out.println("---------------------------------------");
		
		int result;
	
		for(int i=1; i<=10;i++) {
			
			for(int j=1;j<=10;j++) {
				result=i*j;
				System.out.println(i+"x"+j+"="+result);
			}

		}
		
		
		System.out.println("---------------------------------------");

		for(int a=1; a<=5;a++) {
			for(int b=0; b<a;b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		

		for(int c=1; c<=5;c++) {
			for(int d=5; d>c;d--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
