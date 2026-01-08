package default_method_programs;

public interface RBI_bank {
	public void deposit();
	public void showBal();
	public void withDraw();
	default public void upi() {
		System.out.println(" ");
	}
	default public void loan() {
		System.out.println(" ");
	}
}