package lamda_Expression_Programs;

public class ExampleMain {
	public static void main(String[] args) {
		
//		Example e = (int a,int b) -> System.out.println(a+b);
//		e.add(10,20);
		
		Example e = (int a,int b) -> 
		{
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		};
		e.add(10,20);
		
//		(int a , int b) this is a Lamda arguments (must be same as arguments of method in interface)
//		-> this is a lamda operator.
	}
}
