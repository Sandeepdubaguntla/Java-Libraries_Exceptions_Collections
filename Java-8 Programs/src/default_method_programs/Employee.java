package default_method_programs;

public interface Employee {
	
	public void login();
	public void work();
	public void sal();
	public void logout();
	default public void bonus() {
		System.out.println("Bonus method......");
	}
}