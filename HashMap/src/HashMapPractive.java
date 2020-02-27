import java.util.*;

public class HashMapPractive {

	HashMap<String, Integer> person = new HashMap<>();
	person.put("Joan", 22);
	person.put("Daniel", 42);
	person.put("Anna", 34);

//person = {Joan=22, Daniel=42, Anna=34}

	//loop through the hash map and return each key/value pair
	for (Map.Entry<String, Integer> entry : person.entrySet()){
	  String key = entry.getKey();
	  Integer value = entry.getValue();
	  System.out.println(key + ": " + value);
	}
}
}
