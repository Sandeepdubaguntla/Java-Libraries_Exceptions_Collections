package Synchronisation1;

public class main {
	public static void main(String[] args) {
		Flipcart f = new Flipcart();
		
		Payment p1 = new Payment("Phonepe",f);
		Payment p2 = new Payment("Googlepe",f);
		Payment p3 = new Payment("Paytm",f);
		
		p1.start();
		p2.start();
		p3.start();
	}
	
}
