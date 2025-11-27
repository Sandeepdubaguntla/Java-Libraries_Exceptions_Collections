package Multithreads_1;

public class python extends Thread{
	String name;

	public python(String name) {
		super();
		this.name = name;
	}

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" is start with id: "+t.getName());
		char ch;
		try {
			for(int i=name.length()-1;i>=0;i--) {
				ch=name.charAt(i);
				System.out.println("Python: "+ch);
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}
}
