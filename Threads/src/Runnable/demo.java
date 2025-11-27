package Runnable;

import Threads.thread_priorities;

public class demo implements Runnable{
	public void run() {
		Thread t=Thread.currentThread();
		System.out.println(t.getId()+" with name: "+t.getName());
	}
}
