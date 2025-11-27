package arrayList;

import java.util.ArrayList;

public class LargestWord_Arraylist {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("Tarun");
		al.add("ABC");
		al.add("Microservices");
		al.add("Sandeep");
		al.add("Krishna");
		String s=(String)al.get(0);
		int length=s.length();
		String str = "";
//		for(int i=0;i<al.size()-1;i++) {
//			String s1 = (String)al.get(i);
//			if(s1.length()>s.length()) {
//				length=s1.length();
//				str=s1;
//			}
//		}
//		System.out.println("Longest word: "+str+" Its length: "+length);
	}
}
