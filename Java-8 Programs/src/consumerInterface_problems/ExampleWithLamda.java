package consumerInterface_problems;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ExampleWithLamda {
	public static void main(String[] args) {
		Consumer<String> c = (s)->
		{
			System.out.println(s);
			System.out.println(s.charAt(0));
			System.out.println(s.length());
			System.out.println(s.concat("Developer"));
		};
		c.accept("Java");
		
		BiConsumer<String, String> bc= (s1,s2)->
		{
			System.out.println(s1.charAt(0)+" "+s2.charAt(s2.length()-1));
			System.out.println(s1.concat(s2));
		};
		bc.accept("Java", "Developer");
	}
}
