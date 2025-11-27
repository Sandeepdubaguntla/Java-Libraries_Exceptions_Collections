package Synchronisation;

import Threads.thread_priorities;

public class Trainer {
	
	public synchronized void askQuestion(String name) {
		System.out.println(name+" ask a question...?");
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println(name+" is get the answer/...");
		System.out.println("---------------------------------");
	}
}
