package mainPackage;

public class NestedLoopNumTask {

	public static void main(String[] args) {
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println("---------------------------");
		for(int a=5;a>=1;a--) {
			for(int b=7;b>=1;b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		
	}

}
