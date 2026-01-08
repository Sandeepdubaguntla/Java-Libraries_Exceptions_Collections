package functionInterface_programs;

import java.util.function.Function;

public class FunctionExample_WithLamda {
	public static void main(String[] args) {
		//Function has apply() method which is the only method with accepts input and output as an arguments.
		Function<String, Integer> f = (s)->{return s.length();};
		System.out.println(f.apply("java"));
		
		
	}
}