package mainPackage;

public class ArraysTwoD {

	public static void main(String[] args) {
		
		int[][] num=new int[3][4]; // fixed array 3 rows 4 cols
		int[] numbers ={ 100, 50, 75, 1000,55,67,1005 };

		
		//1 array or 1 row
		num[0][0]=1;
		num[0][1]=2;
		num[0][2]=3;
		num[0][3]=4;
		
		//2 array or 2 row
		num[1][0]=10;
		num[1][1]=20;
		num[1][2]=30;
		num[1][3]=40;
		
		//3 array or 3 row
		num[2][0]=100;
		num[2][1]=200;
		num[2][2]=300;
		num[2][3]=400;

		System.out.println(num[1][3]);
		System.out.println(num[2][2]);
		
		System.out.println("--------Another Way of 2D array--------");
		
		int[][] nums= {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300}
		
		};
		
		System.out.println(nums[0][2]);
		System.out.println(nums[1][1]);
		System.out.println(nums[0][2]);
		
		int sum=nums[1][2]+nums[0][3];
				
		System.out.println(sum);
		
		//numbers[0][4] error! Out of bounds!
		
		nums[2][2]=500;
		
		System.out.println(nums[2][2]);
		
		
	}

}
