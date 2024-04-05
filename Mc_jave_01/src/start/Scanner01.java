package start;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력해주세요");
		int age = sc.nextInt();
		
		System.out.println("저의 나이는" + age + "살입니다");
	}

}
