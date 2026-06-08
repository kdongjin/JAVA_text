package chapter05.practice05;

import java.util.Scanner;

public class Page32StringTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// 문자열객체를 만드는 방법
//		System.out.print("name>>");
//		String name = scan.nextLine();
//		System.out.printf("name = %s \n",name);
		
		//1번방법과 2번방법은 메모리에서 차이가 발생한다. 
		//문자열객체를 직접만들어보자 1번방법
		String name2 = new String("kdj");
		System.out.printf("name2 = %s \n",name2);
		
		//문자열객체를 직접만들어보자 2번방법
		String name3 = "홍길동";
		System.out.printf("name3 = %s \n",name3);

	}

}
