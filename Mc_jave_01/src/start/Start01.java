package start;

public class Start01 {

	public static void main(String[] args) {
		//나이, 이름, 키(실수), 남자는 false 여자는 true
		int age = 17;
		String name = "안현석";
		float height = 176f;
		boolean isFemale = false;
		
		System.out.println(age); // 줄바꿈 O
		System.out.print(height); // 줄바꿈 X
		System.out.print(name); // 줄바꿈 X
		System.out.printf("여자인가요? : %b", isFemale); // 변수 바인딩
	}

}
