package default_method_programs;

public class Employee_MainClass {
	public static void main(String[] args) {
		Full_Time_Employee ft = new Full_Time_Employee();
		ft.login();
		ft.work();
		ft.sal();
		ft.bonus();
		ft.logout();
		System.out.println("--------------------------");
		Part_Time_Employee pt = new Part_Time_Employee();
		pt.login();
		pt.work();
		pt.sal();
		pt.logout();
		pt.bonus();
	}
}