package objectsAndClasses;

public class StringDemo1 {

	public static void main(String[] args) {
		
		String name="Azizi";
		String name1=new String("Azizi");
		
		System.out.println(name);
		
		//Length=> number of characters in a String Object
		
		System.out.println("------------------String .Length--------------");
		
		System.out.println(name.length());
		
		name="     Azizi";
		int len=name.length(); //returns in value of the length of the string storing in len
		System.out.println(len);
		
		//Upper Case 
		System.out.println("\n------------------String Lower/Upper Case--------------\n");
		String var1="Hello";
		System.out.println(var1.toLowerCase());
		System.out.println(var1.toUpperCase());
		var1="Hello 123!"; //method does not touch numbers or special chars
		System.out.println(var1.toLowerCase());//hello 123!
		System.out.println(var1);//Hello 123! Strings are immutable
		var1=var1.toUpperCase();
		System.out.println(var1);

		System.out.println("\n------------------String ConCat--------------\n");
		
		String firstName="Steven";
		String lastName="Marquez";
		String fullName=(firstName+lastName); //Used Widely
		System.out.println(fullName);
		
		fullName=firstName.concat(lastName); //not common
		System.out.println(fullName);
		
		String var0="Hello";
		int var2=14;
		System.out.println(var0+var2);
		//System.out.println(var1.concat(var2)); CE(compiler error) can only use .concat with Strings
		
		
		System.out.println("\n------------------String Empty--------------\n");
		
		String emptyNot="";
		System.out.println(emptyNot.isEmpty());//true if empty 

		System.out.println("\n------------------String trim--------------\n");
		
		String trimName="            Asghar   ";
		System.out.println(trimName.trim());//only spaces before and after are moved
		String trimName2="    *        Asghar *  ";
		System.out.println(trimName2.trim());
		
		
		System.out.println("\n------------------String Contains--------------\n");
		
		String containsNot="This is a demo of contain #";
		System.out.println(containsNot.contains("#"));
		if(containsNot.contains("#")) {
			System.out.println("# are not allowed"); //how create accs check for special characters
		}
		
		System.out.println(containsNot.contains("demo"));
		
		System.out.println("\n------------------String Starts with--------------\n");

		System.out.println(containsNot.startsWith("This")); //only starting part
		System.out.println(containsNot.startsWith("demo"));//not starting part
		
		System.out.println("\n------------------String Ends with--------------\n");

		System.out.println(containsNot.endsWith("#")); //Ending Part
		
		
		System.out.println("\n------------------String Ends with--------------\n");
			
		String eqTo="Hi";
		System.out.println(eqTo.equals("Hi"));

		
		System.out.println("\n------------------String CharAt--------------\n");
		
		String name3="Roheen";
		
		System.out.println(name3.charAt(3));
		int sum=0;
		for (int i=0;i<name3.length();i++) {
			if(name.charAt(i)=='e') {
				sum++;
			}
		}
		System.out.println(sum+" es are found");
		
		
		

	}

}
