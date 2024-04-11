package loop;

import java.util.Scanner;

public class loopMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i <= b; i++) {
			System.out.printf("%d * %d = %d%n", a, i, a * i);
		}
		// while ¹®
//		int count = 0;
		
//		while(count < 10) {
//			System.out.println(count);
//			count++;
//		}
		
//		while(true) {
//			if(count >= 10) break;
//			System.out.println(count++);
//		}
		
		// for¹®
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
		
		
	}

}
