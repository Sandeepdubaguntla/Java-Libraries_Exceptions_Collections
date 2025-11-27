package Multithreads;

public class pallindrome extends Thread{
	int num;
	
	public pallindrome(int num) {
		super();
		this.num = num;
	}
	

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		int temp=num;
		int sum=0;
		System.out.println(t.getName()+" Start with ID: "+t.getId());
		while(temp>0) {
			int ld=temp%10;
			sum=(sum*10)+ld;
			temp=temp/10;
		}
		if(sum==num) {
			try {
				Thread.sleep(2000);
				System.out.println("Palindrome");
			}
			catch(Exception e) {
				System.out.println("Handled");
			}
		}
		else {
			System.out.println("Not a palindrome");
		}
	}
}
