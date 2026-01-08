package stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
write a program to count no of even elements present in list using stream API.
write a program to count no of words which ends with 'a' in list using stream API.
write a program to multiply into 2 of odd elements which are present in list using stream API.
*/
public class Assignment_1 {
public static void main(String[] args) {
	List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
	List<String> l1=Arrays.asList("Tarun","Sandeep","Bala","Teja","Ayyappa","Rajkumar");
	//write a program to count no of even elements present in 
    //list using stream API.
	long oddEle=l.stream().filter((s)->s%2==0).count();
	System.out.println(oddEle);
	System.out.println("-----------------------------------------");
//	write a program to count no of words which ends with 'a' in list using stream API.

	long wordCount=l1.stream().filter((s)->s.charAt(s.length()-1)=='a').count();
	System.out.println(wordCount);
	System.out.println("------------------------------------------");
//	write a program to multiply into 2 of odd elements which are present in list using stream API.
	
	List<Integer> res =l.stream().filter((n)->n%2 == 1).map((n)->n*2).collect(Collectors.toList());
	res.forEach((n)->System.out.println(n));
	

	
}
}
