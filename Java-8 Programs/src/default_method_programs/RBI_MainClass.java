package default_method_programs;

public class RBI_MainClass {
	public static void main(String[] args) {
		HDFC h = new HDFC();
		SBI s = new SBI();
		
		h.deposit();
		h.withDraw();
		h.showBal();
		h.loan();
		System.out.println("-------------");
		s.deposit();
		s.withDraw();
		s.showBal();
		s.upi();
	}
	
}