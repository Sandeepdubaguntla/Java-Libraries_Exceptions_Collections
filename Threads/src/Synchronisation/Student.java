package Synchronisation;

public class Student extends Thread{
	public String name;
	public Trainer t;
	
	public Student(String name, Trainer t) {
		super();
		this.name = name;
		this.t = t;
	}

	public void run() {
		t.askQuestion(name);
	}
}
