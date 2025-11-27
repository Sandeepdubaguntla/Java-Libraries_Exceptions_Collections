package arrayList;

import java.util.ArrayList;

public class ArrayList_StringLength {
	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("jsp");
		a.add("Tarun");
		a.add("Sandeep");
		a.add("Ayyappa");
		a.add("Bhaskar");
//		for(int i=0;i<a.size();i++) {
//			String i1=(String)a.get(i);
//				System.out.println(i1.length());
		
		a.forEach((s)->System.out.println(s.length()));

		}
	}
