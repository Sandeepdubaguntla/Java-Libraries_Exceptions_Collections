package functionInterface_programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class function_with_stream_API {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("Tarun","Sandeep","Ayyappa","Bala","Kasi","Teja","Vasu");
		
		//count no.of strings whose length greater than 5.
		long res = l.stream().filter((s)->s.length()>5).count();
		System.out.println(res);
		System.out.println("-----------------------------");
		
		//count no.of strings whose char is starts with T.
		long res1 = l.stream().filter((s)->s.charAt(0)=='T').count();
		System.out.println(res1);
		System.out.println("-----------------------------");
		
		//print string equals to Tarun.
		List<String> res2 = l.stream().filter((s)->s.equals("Tarun")).collect(Collectors.toList());
		res2.forEach((s)->System.out.println(s));
		System.out.println("-----------------------------");
		
		//convert all the string whose length is greater than 4 from lower to upper.
		List<String> res3 = l.stream().filter((s)->s.length()>4).map((s)->s.toUpperCase()).collect(Collectors.toList());
		res3.forEach((s)->System.out.println(s));
		System.out.println("-----------------------------");
		
		//print Strings which are ends with A.
		List<String> res4 = l.stream().filter((s)->s.charAt(s.length()-1)=='a').map((s)->s.toUpperCase()).collect(Collectors.toList());
		res4.forEach((s)->System.out.println(s));
		System.out.println("-----------------------------");
		
		//print last character whose length is having less than 5.
		List<Character> res5=l.stream().filter((s)->s.length()<5).map((s)->s.charAt(s.length()-1)).collect(Collectors.toList());
		res5.forEach((s)->System.out.println(s));
	}
}