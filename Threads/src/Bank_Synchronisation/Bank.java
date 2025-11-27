package Bank_Synchronisation;

public class Bank {
	int currentamount=1000;
	public synchronized void withdraw(String name,int amount) {
		System.out.println(amount+" is withdrawing.....");
		if(currentamount>=amount) {
			currentamount=currentamount-amount;
			try {
				Thread.sleep(2000);
				System.out.println(name+" your Withdrawn successfully....");
			}
			catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else {
			System.out.println(name+" you have Insufficient funds....");
		}
		System.out.println("------------------------------------");
	}
		
}


