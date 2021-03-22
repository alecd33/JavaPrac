package objectsAndClasses;

public class MethodsTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods methodTime=new Methods();
		
		System.out.println(methodTime.greater(10, 11));
		
		methodTime.num(10);
		
		double[] arr= {2,4,6,8};
		System.out.println(methodTime.returnArray(arr));
		
		System.out.println("----------------------");
		System.out.println(methodTime.mirror("hi"));
	}

}
