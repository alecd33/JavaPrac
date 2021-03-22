package objectsAndClasses;

public class MoreStringClasses {

	public static void main(String[] args) {
		
		System.out.println("\n------------------String index of--------------\n");

		
		String confusionPrincess="Gulshoda";
		System.out.println(confusionPrincess.indexOf('a'));
		System.out.println(confusionPrincess.indexOf('e'));//will return -1 if char is not in string
		
		System.out.println("\n------------------String Substring--------------\n");

		String var="Syntac is best";
		
		System.out.println(var.substring(7,9));
		
		System.out.println("\n------------------String Replace--------------\n");
		
		String var1="Hello";
		var1=var1.replace('e', 'a');//we can replace letters with different characters
		System.out.println(var1);
		String var2="Syntax is best.Batch 9 is best";//we can replace the words/strings
		System.out.println(var2.replaceAll("best", "amazing"));
		
		System.out.println("\n------------------String Replaceall-------------\n");
		
		String var01="Synatax is best34343, Batch nine is great";
		System.out.println(var01.replaceAll("[0-9]", ""));//removes all numbers
		var01="973928320320 jdksldskldkndksKSKDKDKDKDKKM";
		System.out.println(var01.replaceAll("[a-zA-Z]", ""));//removes all letter lower and upper case
		var01="9939320320320jasskajskjkasBSKWKSJKJSKJKJ@#$%^&";
		System.out.println(var01.replaceAll("[^A-Z]", "")); //symbol ^ means not 
		
		System.out.println("\n------------------String Split-------------\n");///used coding interviews
		
		String var02="Today is Wednesday";
		//want each word in 
		System.out.println(var02.length());
		String [] strArr=var02.split(" ");
		for(String word:strArr) {
			System.out.println(word);
			
		}
		
		String var03="Syntax is best. batch 9 is great."; //splits array in two
		String [] strArr03=var03.split("[.]");
		for(int i=0;i<strArr03.length;i++) {
			System.out.println(strArr03[i]);
		}
		//method chaining
		
		
	}

}
