import java.io.BufferedReader;
import java.util.ArrayList;

public class ArrayObjectTester {

	public static void main(String[] args) {
		
		ArrayList<Object> test = new ArrayList<Object>();
		test.add(new String("Hello"));
		test.add(new Integer(5));
	
		System.out.println(((String) test.get(0)).substring(1));
		//on AP exam
}

}
