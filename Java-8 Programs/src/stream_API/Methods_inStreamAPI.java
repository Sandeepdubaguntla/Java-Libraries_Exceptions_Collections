package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Methods_inStreamAPI {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,22,3,7,44,9,88,9,44);
		
	//to Print Distinct elements or To remove Duplicates 
		Stream<Integer> s1 = nums.stream().distinct();
		s1.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
	//to print only first 5 elements or Print elements UpTo a limit or range
		Stream<Integer> s2 = nums.stream().limit(5);
		s2.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
	//to Print last 3 elements or to skip the elements UpTo a range we use skip()
		Stream<Integer> s3 = nums.stream().skip(3); //to skip 3 elements and print remaining
		s3.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
		Stream<Integer> s4 = nums.stream().skip(nums.size()-3);//to print last 3 elements.
		s4.forEach((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
	//to Find or Print the MAX Element.
		Optional<Integer> op = nums.stream().max((x,y)->x.compareTo(y));
		op.ifPresent((s)->System.out.println(s));
		//Only MAX, MIN methods will have Optional Class as returnType.
		//And Optional class doesn't have for-each method, rather we use ifPresent Method. 
		System.out.println("-------------------------------");
		
	//to Find or Print MIN Element.
		Optional<Integer> op1 = nums.stream().min((x,y)->x.compareTo(y));
		op1.ifPresent((s)->System.out.println(s));
		System.out.println("-------------------------------");
		
	//to Sort the Elements in Ascending Order.
		Stream<Integer> nums1 = nums.stream().sorted();
		nums1.forEach((s)->System.out.print(s+" "));
		System.out.println();
		System.out.println("-------------------------------");
		
	//to Sort the elements in Descending Order.
		Stream<Integer> nums2 = nums.stream().sorted((x,y)->y.compareTo(x));
		nums2.forEach((s)->System.out.print(s+" "));
		System.out.println();
		System.out.println("-------------------------------");
		
		
		
	}
}
