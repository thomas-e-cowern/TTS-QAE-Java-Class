
public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringLengthLambda myLambda = s -> s.length();
		System.out.println(myLambda.getLength("Hello Ticklehead"));
	}
	
	interface stringLengthLambda {
		int getLength(String s);
	}

}
