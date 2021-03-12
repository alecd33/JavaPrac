package mainPackage;

public class Tasks3 {

	public static void main(String[] args) {
		String[] cars=new String[6];
		
		cars[0]="Honda";
		cars[1]="Toyota";
		cars[2]="Ferrari";
		cars[3]="Lambo";
		cars[4]="Nissan";
		cars[5]="Infiniti";
		
		for(int i=0; i<=cars.length-1;i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("------------------------");
		
		for(int i=cars.length-1; i>=0;i--) {
			System.out.println(cars[i]);
		}
		
		System.out.println("------------------------");

		for(String allCars:cars) {
			System.out.println(allCars);
		}
		System.out.println("------------------------");
		
		String[] animals= {"Monkey","Cat","Dog","Zebra","Fish","Donkey"};

		for(String allAnimals:animals) {
			System.out.println(allAnimals);
		}
		
		System.out.println("------------------------");
		
		for(int i=0;i<=animals.length-1;i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("------------------------");

		int[] nums=new int[5];
		
		nums[0]=5;
		nums[1]=6;
		nums[2]=3;
		nums[3]=2;
		nums[4]=8;
		
		int sum=nums[0]+nums[1]+nums[2]+nums[3]+nums[4];
		
		System.out.println(sum);
	}

}
