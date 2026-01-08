package predicateInterface_problems;

import java.util.function.Predicate;

public class ExampleWithOutLamda implements Predicate<Integer> 
{

	@Override
	public boolean test(Integer num) {
		if(num % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		ExampleWithOutLamda e = new ExampleWithOutLamda();
		
		boolean res= e.test(null);
		System.out.println(res);
	}

}
