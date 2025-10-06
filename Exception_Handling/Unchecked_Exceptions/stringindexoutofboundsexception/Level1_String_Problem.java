package stringindexoutofboundsexception;

//Level 1 Program is a general clean program without dangerous statements or without statements with exception.

public class Level1_String_Problem {
	public static void main(String[] args) {
		
		String s=new String("Java");
		//J a v a
		//0 1 2 3
		System.out.println(s.charAt(0)); //J
		System.out.println(s.charAt(2)); //v
		System.out.println(s.charAt(3)); //a
		
	}
}
