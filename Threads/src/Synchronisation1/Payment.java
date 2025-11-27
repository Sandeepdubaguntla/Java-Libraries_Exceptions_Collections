package Synchronisation1;

public class Payment extends Thread{
	public String name;
	public Flipcart f;
	
	public Payment(String name, Flipcart f) {
		super();
		this.name = name;
		this.f = f;
	}
	
	public void run() {
		f.pay(name);
	}
}
