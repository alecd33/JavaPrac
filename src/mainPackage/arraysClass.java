package mainPackage;

public class arraysClass {

	public static void main(String[] args) {
			
		int[] array=new int[5];
		
		int a=(int)10.99;
		
		System.out.println(a);
		
		array[0]= 10;
		array[1]= 12;
		array[2]= 15;
		array[3]= 9;
		array[4]= 13;
		
		System.out.println(array[0]+array[3]);
		
		
		double[] number=new double[5];
		
		number[0]=10.99;
		number[1]=10.99;
		
		System.out.println(number[1]);
		
		String[] names=new String[5];
		names[0]="Jahan";
		names[1]="Ozoda";
		names[2]="Alec";
		
		System.out.println(names[2]);
		
		boolean b[]=new boolean[4];
		
		b[0]=true;
		b[1]=true;
		b[2]=true;
		
		System.out.println(b[0]);
		
		int size=b.length;
		
		System.out.println("Size of my array is "+size);
		
		
		
		char[] grades=new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		System.out.println("Number of elements in 2 array "+grades.length);
		
		System.out.println("--------------------task------------------------");
		
		String[] group=new String[5];
		
		group[0]="Jordan";
		group[1]="Jalen";
		group[2]="Sarah";
		group[3]="Eliaz";
		group[4]="Carlos";
		
		for(int i=group.length-1;i>=0;i--) {
			
			System.out.println(group[i]);
		
		}
		
		
		System.out.println(group[1]);
		
		
		String[] groupName= {"Jordan", "Jalen","Sarah","Eliaz","Eliaz"};		
		
		System.out.println(groupName[3]);
		
		System.out.println("--------------------task2------------------------");
		
		String[] words;
		
		words=new String[5];
		
		words[0]="Java";
		words[1]="Saturday";
		words[2]="day";
		words[3]="coding";
		words[4]="is";
		
		System.out.println(words[1]+" "+words[4]+" "+words[3]+" "+words[2]);
		
		for(int i=0;i<words.length;i++) {
			System.out.println(words[i]);
		}
		
		

		
		
		
	}

}
