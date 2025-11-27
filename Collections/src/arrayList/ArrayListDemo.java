package arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(99);
		a.add(98);
		a.add(97);
		a.add(96);
		a.add(95);
//		for(int i=0;i<a.size()-1;i++) {
//			Object obj=a.get(i);
//			Integer i1=(Integer)obj;
//			if(i1%2==0) {
//				System.out.println(i1);
//			}
//		}
		
		List<Integer> l =a.stream().filter((n)->n%2==0).collect(Collectors.toList());
		l.forEach((n)->System.out.println(n));
	}
}
