package Multithreads_1;

import Threads.thread_priorities;

public class java extends Thread{
	String name;
	
	public java(String name) {
		super();
		this.name = name;
	}

	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName()+" is start with id: "+t.getName());
		char ch;
		try {
			for(int i=0;i<name.length();i++) {
				ch=name.charAt(i);
				System.out.println("Java: "+ch);
				Thread.sleep(2000);
			}
		}
		catch(Exception e) {
			System.out.println("Handled");
		}
	}
}
