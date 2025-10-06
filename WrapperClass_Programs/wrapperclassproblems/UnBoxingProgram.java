package wrapperclassproblems;

public class UnBoxingProgram {
	public static void main(String[] args) {
		int x=10;
		Integer i = new Integer(x);
		int i1=i.intValue(); // Explicit UnBoxing
		System.out.println(i1);
		
		double d = 9.53;
		Double d1= new Double(d);
		double d2=d1.doubleValue(); // Explicit UnBoxing
		System.out.println(d2);
		
		char ch = 'a';
		Character ch1 = new Character(ch);
		char ch2 = ch1;  // Implicit UnBoxing
		System.out.println(ch2);
		
		boolean b=true;
		Boolean b1 = new Boolean(b);
		boolean b2 = b1;  // Implicit UnBoxing
		System.out.println(b2);
	}
}
