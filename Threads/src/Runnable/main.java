package Runnable;

public class main {
	public static void main(String[] args) {
		Runnable r = new demo();
		Thread t = new Thread(r);
		t.start();
	}
}
