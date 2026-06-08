package chapter04.standard.practice;

import java.util.Scanner;

public class StandarPractice {
		//1)scanner 선언과 닫는다.
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		//5)무한반복을 처리하고, 종료선택을 진행한다.
		//6)반복할내용을 찾아서 집어넣어준다.
		while (true) {
			
			//2)메뉴출력한다.
			System.out.println("==================================");
			System.out.println("1:1번주제, 2:2번주제, 3:3번주제, 4: 종료");
			System.out.print(">>");
			//3)번호선택
			int no = Integer.parseInt(scan.nextLine());
			//4)switch case
			switch (no) {
			case 1:
				practice01(); 
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("정신차려 다시입력");
				break;
			}//end of switch
			
			if(no == 4) {
				break; 
			}
		}//end of while
		
		//1)scan 종료
		if(scan != null) {
			scan.close();
		}
	}//end of main
	
	//1번문항
	private static void practice01() {
		// TODO Auto-generated method stub
		
	}
}
