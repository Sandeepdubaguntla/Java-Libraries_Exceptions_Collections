package parseMethodPrograms;

public class ParseMethodProgram {
	public static void main(String[] args) {
		String s="123";
		int num = Integer.parseInt(s);
		System.out.println(num);
		
		String sl="123854252541";
		long num2 = Long.parseLong(sl);
		System.out.println(num2);
		
		String s1="123.02";
		double num1 = Double.parseDouble(s1);
		System.out.println(num1);
		
		String s2 = "true";
		boolean b = Boolean.parseBoolean(s2);
		System.out.println(b);
		
	}
}
