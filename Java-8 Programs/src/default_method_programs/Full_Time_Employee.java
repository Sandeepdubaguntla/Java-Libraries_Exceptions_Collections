package default_method_programs;

public class Full_Time_Employee implements Employee{

	@Override
	public void login() {
		System.out.println("Login Successfully......");
	}

	@Override
	public void work() {
		System.out.println("Given task is completed....");
	}

	@Override
	public void sal() {
		System.out.println("Salary is credited......");
	}

	@Override
	public void logout() {
		System.out.println("Logout Successfully....");
	}
	
	@Override
	public void bonus() {
		System.out.println("10000 is credited successfully.....");
	}
}