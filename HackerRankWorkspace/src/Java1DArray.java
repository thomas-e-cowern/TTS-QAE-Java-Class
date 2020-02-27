import java.util.*;
public class Java1DArray {

	static int n = 7;
	
	int totalInt = n;
	
	static int[] myArray = new int[n];
	
	public static void main(String[] args) {
		for (int i = 0; i < n; i++) {
//			  System.out.println(i);
			  myArray[i] = i;
			  System.out.println(myArray[i]);
			}
		
		
	}
}
