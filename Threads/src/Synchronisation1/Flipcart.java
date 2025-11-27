package Synchronisation1;

public class Flipcart {
	public synchronized void pay(String name) {
		System.out.println("Paying through "+name+".....");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(name+" payment is done...");
		System.out.println("-----------------------------");
	}
}
