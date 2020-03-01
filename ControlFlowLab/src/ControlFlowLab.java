
public class ControlFlowLab {
	
	public static void main(String[] args) {
		
		// Uncomment the following to see the methods live!
		
//		checkRandomNumberIf ();
//		checkRandomNumberIfElse ();
//		checkRandomNumberComplex ();
//		printNumbers (); 
//		printEvenNumbers ();
//		printDown ();
//		multipleLoop ();
//		enhancedFor ();
//		enhancedForVowelsCapIf ();
//		enhancedForVowelsCapSwitch ();
//		whileNumberGenerator ();
//		doWhileNumberGenerator ();
//		printEvenNumbersModulo ();
		nestLoops ();
//		System.out.println(maxBoundRandom(50));
//		for20RandomNumber ();
//		for20RandomNumber50to100 ();
		
		
	}
	
	// Using if statements
	public static void checkRandomNumberIf () {
		int randOne = (int)(Math.random() * 100);
		
		System.out.println(randOne);
		
		if (randOne > 70) {
			System.out.println("Big Number");
		}
		if (randOne >= 40) {
			if (randOne <= 70) {
				System.out.println("Medium Number");
			}
		}
		if (randOne < 40) {
			System.out.println("Small Number");
		}
		
	}
	
	// Using if else statements
	public static void checkRandomNumberIfElse () {
		int randOne = (int)(Math.random() * 100);
		
		System.out.println(randOne);
		
		if (randOne > 70) {
			System.out.println("Big Number");
		} else if (randOne >= 40) {
			if (randOne <= 70) {
				System.out.println("Medium Number");
			}
		} else {
			System.out.println("Small Number");
		}
	}
	
	// Using complex conditionals
	public static void checkRandomNumberComplex () {
		int randOne = (int)(Math.random() * 100);
			
		System.out.println(randOne);
			
		if (randOne > 90) {
			System.out.println("Really Big Number");
		} else if (randOne >= 40 && randOne <= 70) {
			System.out.println("Really Average Number");
		} else {
			System.out.println("Really Small Number");
		}
	}

	
	// for loop 1 to 30
	public static void printNumbers () {
		for (int i = 0; i < 30; i++) {
			System.out.println(i + 1);
		}
	}
	
	// for loop even numbers 1 to 30
	public static void printEvenNumbers () {
		for (int i = 1; i < 30; i += 2) {
			System.out.println(i + 1);
		}
	}
		
	// loop counting down from 20 to 0
	public static void printDown () {
		for (int i = 20; i > -1; i--) {
			System.out.println(i);
		}
	}
	
	// multiple statement loop test
	public static void multipleLoop () {
		for (int x = 1, y = 1; x < 20 && y < 50; x++, y += 4) {
		System.out.println("X is: " + x + ", y is: " + y); }
	}
	
	// Enhanced for loop
	public static void enhancedFor () {
		 String str = "This is a very long and completely meaningless string that serves no purpose.";
		 String[] arrStr = str.split(" ");
		 for (String word: arrStr) {
			 System.out.println(word);
		 }
	}
	
	// Printing capitals for vowels
	public static void enhancedForVowelsCapIf () {
		 String str = "This is a very long and completely meaningless string that serves no purpose.";
		 char[] charArr = str.toCharArray();
		 String strDone = "";
		 for (char letter: charArr) {
			 String strLetter = Character.toString(letter);
			 if (strLetter.equals("a")) {
				 String capLetter = strLetter.toUpperCase();
				 strDone += capLetter;
			 } else if (strLetter.equals("e")) {
				 String capLetter = strLetter.toUpperCase();
				 strDone += capLetter;
			 } else if (strLetter.equals("i")) {
				 String capLetter = strLetter.toUpperCase();
				 strDone += capLetter;
			 } else if (strLetter.equals("o")) {
				 String capLetter = strLetter.toUpperCase();
				 strDone += capLetter;
			 } else if (strLetter.equals("u")) {
				 String capLetter = strLetter.toUpperCase();
				 strDone += capLetter;
			 } else {
				 strDone += strLetter;
			 }
		 }
		 System.out.println(strDone);
	}
	
	// Printing capitals for vowels switch
		public static void enhancedForVowelsCapSwitch () {
			 String str = "This is a very long and completely meaningless string that serves no purpose.";
			 char[] charArr = str.toCharArray();
			 String strDone = "";
			 for (char letter: charArr) {
				 String strLetter = Character.toString(letter);
				 String capLetter = "";
				 switch (strLetter) {
				 case "a":
					 capLetter = strLetter.toUpperCase();
					 strDone += capLetter;
					 break;
				 case "e":
					 capLetter = strLetter.toUpperCase();
					 strDone += capLetter;
					 break;
				 case "i":
					 capLetter = strLetter.toUpperCase();
					 strDone += capLetter;
					 break;
				 case "o":
					 capLetter = strLetter.toUpperCase();
					 strDone += capLetter;
					 break;
				 case "u":
					 capLetter = strLetter.toUpperCase();
					 strDone += capLetter;
					 break;
				default:
					strDone += strLetter;	
				 }
			 }
			 System.out.println(strDone);
		}
		
		// Helper function for generating numbers
		public static int numberGenerator () {
			int randOne = (int)(Math.random() * 100);
			return randOne;
		}
		
		// While loop number generator
		public static void whileNumberGenerator () {
			
			int randomNumber = 0;
			int count = 0;
			
			while (count < 20) {
				randomNumber = numberGenerator ();
				System.out.println(randomNumber);
				count++;
				if (randomNumber > 85) {
					break;
				}
			}
		}
		
		// Do while number generator
		public static void doWhileNumberGenerator () {
			
			int randomNumberOne = 0;
			int randomNumberTwo = 0;
			int count = 0;
			int oneTimesTwo = 0;
			
			do {
				randomNumberOne = numberGenerator ();
				randomNumberTwo = numberGenerator ();
				oneTimesTwo = (randomNumberOne * randomNumberTwo);
				System.out.println(oneTimesTwo);
				if (oneTimesTwo > 1000) {
					break;
				}
				
			} 
			while (count < 30);
		}
		
		// Even numbers using modulo
		public static void printEvenNumbersModulo () {
			for (int i = 1; i < 31; i ++) {
				if (i % 2 != 0) {
					continue;
				}
				System.out.println(i);
			}
		}
		
		// Write nested for loops that will print out the sum of the inner loop up to the index of the outer loop
		public static void nestLoops () {
			int x = 1;
			for (int i = 1; i < 31; i ++) {
				System.out.println("outer: " + i);
				for (int j = 0; j < 31;) {
					if (x > 350) {
						System.out.println(("inner sum: " + (x)));
						System.out.println(" > 350 reached at: " + i);
						return;
					}
					System.out.println(("inner sum: " + (x)));
					x = (x + i) + 1;
					break;
				}
			}
		}
		
		/*Earlier there was a scheme to generate a random number between 1 and 100. 
		To generalize this create a function called makeBoundedRandom that takes a single 
		integer input and returns an integer.*/
		public static int maxBoundRandom (int number) {
					
			int result = 0;
					
			if (number < 10) {
				return -1;
			} else {
				result = (int)(Math.random() * number);
			}
					
			return result;
		}
		
		// Next write a for loop to generate 20 random numbers with a limit of 1000 and print each one.
		public static void for20RandomNumber () {
			int count = 0;
			while (count < 20) {
				System.out.println((int)(Math.random() * 1000));
				count++;
			}
		}
		
		// Write a loop that generates random numbers, each with a different range of 50 up to 100 and print out each one.
		public static void for20RandomNumber50to100 () {
			for (int i = 0; i < 100; i++) {
				int random = (int)(Math.random() * 100);
				if (random < 50) {
					continue;
				}
				System.out.println(random);
			}
		}
}




