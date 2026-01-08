package lamda_Expression_Programs;

public class CreateThread_UsingLamda {
	// Here no need to create Runnable interface because its already a predefined Inteface

	public static void main(String[] args) {
		
		
		Runnable r = () ->
		{
			System.out.println("Thread Name :"+Thread.currentThread().getName());
			System.out.println("Thread ID :"+Thread.currentThread().getId());
			System.out.println("This is Implementing or Creating Thread using Lamda");
		};
		new Thread(r).start();
	}
}
