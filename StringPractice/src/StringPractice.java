
public class StringPractice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Hello Mr. Pib");
		String str1 = "This is Exercise 1";
	    String str2 = "This is Exercise 2";
	    
//	    Write a java program to compare two strings lexicographically.
	    System.out.println(str1.compareTo(str2));
	    if (str1.compareTo(str2) == 0) {
	    	System.out.println("The strings are the same");
	    } else {
	    	System.out.println("The strings are not the same");
	    }
	    
//	    Write a Java program to test if a given string contains the specified sequence of char values.
	    String str3 = "PHP Exercises and Python Exercises";
	    String str4 = "and";
	    
	    System.out.println(str3.contains(str4));
	    if (str3.contains(str4) == true) {
	    	System.out.println(str3 + " contains the string: \"" + str4 + "\"");
	    } else {
	    	System.out.println(str3 + " does not contain the string: \"" + str4 + "\"");
	    }
	    
	}

}
