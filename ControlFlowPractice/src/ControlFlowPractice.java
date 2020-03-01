
public class ControlFlowPractice {

	public static void main(String[] args) {
		
//		checkNumber (0);
//		checkNumber (-9);
//		checkNumber (7);
		
		dayOfWeek (5);
		
	}
	
	public static void checkNumber (int num) {
		if (num > 0) {
			System.out.println("Number is positive");
		} else if (num == 0) {
			System.out.println("Number is zero");
		} else {
			System.out.println("Number is negative");
		}
	}
	
	public static void dayOfWeek (int num) {
		switch (num) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		}
		
	}
	
}


