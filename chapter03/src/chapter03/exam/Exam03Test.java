package chapter03.exam;

import java.util.Scanner;

public class Exam03Test {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1, 2, 3, 4, 5:exit");
			System.out.print("no>>");
			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
			case 1:
				break;
			case 4:
				practice04();
				break;
			case 5:
				System.out.println("감사합니다. 프로그램종료");
				exitFlag = true;
				break;
			default:
				System.out.println("정신차려. 다시입력");
				break;
			}
		}

		if (scan != null) {
			scan.close();
		}
	}

	// 키보드로 두개의 정수, 연산기호를 입력받고, 연산결과를 계산해서 출력하라.
	// 두수는 정수 체클할것, 연산기호체크할것, 이상이 없으면 계산할것
	private static void practice04() {

		System.out.print("num1(정수만가능)>>");
		int num1 = Integer.parseInt(scan.nextLine());
		System.out.print("num2(정수만가능)>>");
		int num2 = Integer.parseInt(scan.nextLine());
		boolean exitFlag = false;
		String op = null;
		while (!exitFlag) {
			// 문자열 받을지 결정
			System.out.print("+ - / % *>>");
			op = String.valueOf(scan.nextLine().charAt(0));
			if (op.equals("+") || op.equals("-") || op.equals("/") || op.equals("*") || op.equals("%")) {
				exitFlag = true;
			} else {
				System.out.println("정신차려");
			}
		}

		switch (op) {
		case "+":
			System.out.printf("%d + %d = %d \n", num1, num2, num1 + num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d \n", num1, num2, num1 - num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d \n", num1, num2, num1 * num2);
			break;
		case "/":
			System.out.printf("%d / %d = %d \n", num1, num2, num1 / num2);
			break;
		case "%":
			//System.out.println(""+num1 +"%"+ num2 + "="+ (num1 % num2));
			System.out.printf("%d %s %d = %d \n", num1, op , num2, num1 % num2);
			break;
		}
		System.out.println();
	}
}
