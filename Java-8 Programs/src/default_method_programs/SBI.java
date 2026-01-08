package default_method_programs;

public class SBI implements RBI_bank{

	@Override
	public void deposit() {
		System.out.println("Deposited....");
		
	}

	@Override
	public void showBal() {
		System.out.println("100000");
		
	}

	@Override
	public void withDraw() {
		System.out.println("Withdrawn....");
	}
	
	public void upi(){
		System.out.println("Upi done successfully....");
	}
	
}