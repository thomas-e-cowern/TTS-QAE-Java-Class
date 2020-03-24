
public class InterfaceReview {
//	static {
//		int count = 0;
//	}
	
	public static void main(String[] args) {
		funMethod(false);
	}
	
	public static void funMethod (boolean isFun) {
		if (isFun) {
			System.out.println("Fun Times!");
		}
	}
	
	public static String funMethod (String isFun) {
		if (isFun.equals("Yes")) {
			return "This is fun!";
		}
		return "This isn't fun!";
	}
	
//	public static void increment () {
//		count++;
//	}
	
}
