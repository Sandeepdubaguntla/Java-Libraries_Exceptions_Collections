package consumerInterface_problems;

import java.util.function.Consumer;

public class ExampleWithoutLamda implements Consumer<String>
{

	@Override
	public void accept(String s) {
		System.out.println(s);
		System.out.println(s.charAt(0));
		System.out.println(s.length());
		System.out.println(s.concat("Developer"));
	}
	public static void main(String[] args) {
		ExampleWithoutLamda e=new ExampleWithoutLamda();
		e.accept("Java");
	}
	
}
