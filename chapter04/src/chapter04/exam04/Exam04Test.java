package chapter04.exam04;

import java.util.Scanner;

public class Exam04Test {
	// 1)scanner 선언과 닫는다.
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// 5)무한반복을 처리하고, 종료선택을 진행한다.
		// 6)반복할내용을 찾아서 집어넣어준다.
		while (true) {

			// 2)메뉴출력한다.
			System.out.println("==================================");
			System.out.println("1:1번주제, 2:2번주제, 3:3번주제, 4: 별표찍기 5:별표찍기2 6:별표찍기3 7:종료");
			System.out.print(">>");
			// 3)번호선택
			int no = Integer.parseInt(scan.nextLine());
			// 4)switch case
			switch (no) {
			case 1:
				practice01();
				break;
			case 2:
				break;
			case 3:
				practice03();
				break;
			case 4:
				practice04(); 
				break;
			case 5:
				practice05(); 
				break;				
			case 6:
				practice06(); 
				break;				
			case 7:
				System.out.println("프로그램 종료");
				break;				
			default:
				System.out.println("정신차려 다시입력");
				break;
			}// end of switch

			if (no == 7) {
				break;
			}
		} // end of while

		// 1)scan 종료
		if (scan != null) {
			scan.close();
		}
	}// end of main



	// 1번문항
	private static void practice01() {
		// TODO Auto-generated method stub

	}

	// 3번문항 큰값, 작은값 구별하기
	private static void practice03() {
		// 큰값, 작은값 구별하기
		int a = 8;
		int b = 4; 
		int max = 0, min = 0;
		
		if (a > b) {
			max = a;
			min = b; 
		} else {
			max = b;
			min = a; 
		}
		for (int i = min; i <= max; i++) {
			System.out.printf("%d ", i);
		}
		
		//System.out.printf("max = %d min = %d \n", max, min);
	}
	
	//별표찍기
	private static void practice04() {
	
		
		
	}
	
	//별표찍기 2
	private static void practice05() {
		for (int i = 0; i < 4; i++) {
			//i=0 j=4, i=1 j=3
			for (int j = 0; j < -i + 4; j++) {
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
	}

	
	//별표찍기 3
	private static void practice06() {
		for (int i = 0; i < 5; i++) {
			//공백 i=0 j =4, i=1 j= 3
			for (int j = 0; j < -i + 4; j++) {
				System.out.printf("%c",' ');
			}
			//별 i=0 k=1, i= 1 k=3 
			for (int k = 0; k < 2*i + 1; k++) {
				System.out.printf("%c",'*');
			}
			System.out.println();
		}
	}
}


















