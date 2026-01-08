package predicateInterface_problems;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class ExampleWithLamda {
	public static void main(String[] args) {
		
		Predicate<Integer> p = (num)-> num%2 == 0;
		System.out.println(p.test(10));
		
		Predicate<String> p1 = (s) -> s.length()%2==0;
		System.out.println(p1.test("Developer"));
		
		Predicate<Integer> p2 = (num)-> num == 2025;
		System.out.println(p2.test(2025));
		
		BiPredicate<Integer,Integer> p3 = (num1,num2)-> (num1+num2)%2 == 0;
		System.out.println(p3.test(10,10));
	}
}
