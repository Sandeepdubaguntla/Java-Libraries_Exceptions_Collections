package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Assignment_2 {
	public static void main(String[] args) {
		List<String> str = Arrays.asList("Sandeep","Tarun","Ayyappa","Bala","Teja","Rajkumar","Manideep","Sandeep","Tarun");
		
		//Print Distinct names
		Stream<String> s1 = str.stream().distinct();
		s1.forEach((s)->System.out.println(s));
		System.out.println("--------------------------");

		//to print only first 5 elements or Print elements UpTo a limit or range
		Stream<String> s2 = str.stream().limit(5);
		s2.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
		//to Print last 3 elements or to skip the elements UpTo a range we use skip()
		Stream<String> s3 = str.stream().skip(3); //to skip 3 elements and print remaining
		s3.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
		
		
	}
}
