package functionInterface_programs;

import java.util.function.Function;

public class FunctionExample_WithoutLamda implements Function<String, Integer>{

	@Override
	public Integer apply(String s) {
		
		return s.length();
	}
	
	public static void main(String[] args) {
		FunctionExample_WithoutLamda fwl = new FunctionExample_WithoutLamda();
		int a = fwl.apply("Tarun");
		System.out.println(a);
	}
}