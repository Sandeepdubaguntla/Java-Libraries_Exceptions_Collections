package wrapperclassproblems;

public class BoxingProgram {
	
	public static void main(String[] args) {
		int a=10;
		Integer in=new Integer(a); // Explicit Boxing
		System.out.println(in);
		
		long l=109876543L;
		Long lon=new Long(l); // Explicit Boxing
		System.out.println(lon);
		
		char ch='x';
		Character c= new Character(ch); // Explicit Boxing
		System.out.println(c);
		
		float f=95.2f;
		Float flo=new Float(f);  // Explicit Boxing
		System.out.println(flo);
		
		double d=2025.9;
		Double d1=d;         // Implicit Boxing
		System.out.println(d1);
		
		boolean b=false;
		Boolean bool =b;     // implicit Boxing
		System.out.println(bool);
		
		byte by=10;
		Byte byt=new Byte(by); // implicit Boxing
		System.out.println(byt);
		
		short sh=10;
		Short sho=sh; // implicit Boxing
		System.out.println(sho);
		
		
		
		
	}
}
