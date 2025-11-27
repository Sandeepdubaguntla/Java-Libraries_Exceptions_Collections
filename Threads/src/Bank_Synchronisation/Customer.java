package Bank_Synchronisation;

public class Customer extends Thread{
	public int amount;
	public String name;
	public Bank b;
	public Customer(String name,int amount, Bank b) {
		super();
		this.name=name;
		this.amount = amount;
		this.b = b;
	}
	
	public void run() {
		b.withdraw(name,amount);
	}
}
