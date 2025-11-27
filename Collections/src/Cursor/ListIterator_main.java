package Cursor;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_main {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		ListIterator<Integer> ltr = al.listIterator();
		
		System.out.println("Farward direction");
		while(ltr.hasNext()) {
			int index = ltr.nextIndex();
			Integer i = ltr.next();
			System.out.println(index+" ---> "+i);
		}
		
		System.out.println();
		
		System.out.println("Backward direction");
		while(ltr.hasPrevious()) {
			int index = ltr.previousIndex();
			Integer i = ltr.previous();
			System.out.println(index+" ---> "+i);
		}
	}
}
