package Multithreads;

public class Even_or_odd extends Thread{
	int num;
	
	public Even_or_odd(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" Start with ID: "+t.getId());

		if(num%2==0)
			try {
				
				Thread.sleep(2000);
				System.out.println("Even");
			}
		catch(Exception e) {
			System.out.println("Handled");
		}
		else {
			System.out.println("Odd");
		}
	}
}

