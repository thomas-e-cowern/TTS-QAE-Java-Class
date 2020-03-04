
public class Greeter {

	public void greet (Greeting greeting) {
		// TODO Auto-generated constructor stub
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter greeter = new Greeter();
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		greeter.greet (helloWorldGreeting);
		
		Greeting myLambdaFunction = () -> System.out.println("Hello World");
		MyAdd addFunctoin = (int a, int b) -> a + b;
	}

}

interface MyLambda {
	void foo ();
}

interface MyAdd {
	int add(int a, int b);
}