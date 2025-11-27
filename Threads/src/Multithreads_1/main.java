package Multithreads_1;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String java = sc.next();
		String python = sc.next();
		
		java j = new java(java);
		python p = new python(python);
		j.start();
		p.start();
	}
}
