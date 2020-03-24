
public class Count {
	
//	int instanceCount;
//	static int staticCount;
//	static int sharedVar;
	static int staticBlockCounter;
	static int nonStaticBlockCounter;
	
	// Only runs when class loaded
	static {
		staticBlockCounter++;
		System.out.println("Static block counter: " + staticBlockCounter);
	}
	
	// Runs on instance created
	{
		nonStaticBlockCounter++;
		System.out.println("Non static block counter: " + nonStaticBlockCounter);
	}
	
//	public void instanceIncrement () {
//		instanceCount++;
//		System.out.println("Instance count: " + instanceCount);
//	}
//	
//	public void instanceDecrement () {
//		instanceCount--;
//		System.out.println("Instance count: " + instanceCount);
//	}
//	
//	public static void staticIncrement () {
//		staticCount++;
//		System.out.println("static count: " + staticCount);
//	}
//	
//	public static void staticDecrement () {
//		staticCount--;
//		System.out.println("static count: " + staticCount);
//	}
	
//	public void sharedIncrement () {
//		sharedVar++;
//		System.out.println("Shared count: " + sharedVar);
//	}
//	
//	public void sharedDecrement () {
//		sharedVar--;
//		System.out.println("Shared count: " + sharedVar);
//	}
}
