package Threads;

public class thread_priorities {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.getId());//21.
		System.out.println(t.getName());//Thread-0.
		t.setName("Tarun");
		System.out.println(t.getName());//Tarun  which is modified.
		System.out.println(t.getPriority());//5 default priority.
		t.setPriority(8);
		System.out.println(t.getPriority());//8 modified priority.
	}
}
