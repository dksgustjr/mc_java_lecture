package Condition;

public class ConditionMain {

	public static void main(String[] args) {
		// 제어문
		// if문
//		int a = 5;
		
		// if문의 조건식의 값이 true일 때 if문의 블럭 실행
		//else 문은 if문의 값이 false일 때 else문의 블럭 실행
//		if(a < 5) {
//			System.out.println("작다");
//		}
//		else if(a == 5){
//			System.out.println("같다");
//		}
//		else {
//			System.out.println("크다");		}
//	}
		int a = 5;
		switch (a) {
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3:
			System.out.println("3");
		case 4:
			System.out.println("4");
		case 5:
			System.out.println("5");
		default:
			System.out.println("I don't know...");
		}
	}
}
