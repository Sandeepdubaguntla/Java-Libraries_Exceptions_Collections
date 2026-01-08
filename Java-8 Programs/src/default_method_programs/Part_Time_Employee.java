package default_method_programs;

public class Part_Time_Employee implements Employee{
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
}