import java.util.*;
public class HashMapPractice {

	public static void main(String[] args) {

		HashMap<String, String> person = new HashMap<>();
		person.put("name", "Tom");
		person.put("age", "52");
		person.put("hometown", "North Haven");
		person.put("food", "Pizza");
		
		System.out.println("This is " + person.get("name") + ",");
		System.out.println("They are " + person.get("age") + " years old,");
		System.out.println("from " + person.get("hometown") + ",");
		System.out.println("and their favorite food is " + person.get("food") + ".");
	}
	
	
}
