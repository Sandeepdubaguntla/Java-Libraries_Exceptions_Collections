package default_method_programs;

public class HDFC implements RBI_bank{

	@Override
	public void deposit() {
		System.out.println("Deposited...");
		
	}

	@Override
	public void showBal() {
		System.out.println("200000");
		
	}

	@Override
	public void withDraw() {
		System.out.println("Withdrawn...");
		
	}

	public void loan() {
		System.out.println("Loan in progress...");
	}
}