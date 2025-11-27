package Synchronisation;

public class main {
	public static void main(String[] args) {
		Trainer t = new Trainer();
		
		Student s1 = new Student("Tarun",t);
		Student s2 = new Student("Krishna",t);
		Student s3 = new Student("Kanithi",t);
		
		s1.start();
		s2.start();
		s3.start();
		
		System.out.println(Thread.activeCount());
	}
	
}
