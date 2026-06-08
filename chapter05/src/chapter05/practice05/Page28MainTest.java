package chapter05.practice05;

public class Page28MainTest {

	public static void main(String[] args) {
		//매개변수 String[] args 온다면 출력해보고 싶다.
		if (args != null) {
			for (int i = 0; i < args.length; i++) {
				System.out.printf("args[%d] = %s \n", i, args[i]);
			}
		} else {
			System.out.println("넘어오는 args 문자열배열이 없습니다.");
		}
		System.out.println("The end");
	}
}
