package Bank_Synchronisation;

public class main {
	public static void main(String[] args) {
		Bank b = new Bank();
		
		Customer c1 = new Customer("Tarun",500,b);
		Customer c2 = new Customer("Krishna",300,b);
		Customer c3 = new Customer("Kanithi",500,b);
		
		c1.start();
		c2.start();
		c3.start();
	}
}
