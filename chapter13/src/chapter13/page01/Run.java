package chapter13.page01;

import java.util.Scanner;

public class Run {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		double value = 0.0;
		boolean exitFlag = false; 
		while (!exitFlag) {
			System.out.print("숫자입력(제발 0값 제외)>>");
			int num = Integer.parseInt(scan.nextLine());
			try {
				System.out.println("100문장 실행됨.");
				//실행된 100문장
				//예외가 발생된문장 value = 10 / num;
				value = 10 / num;
				exitFlag = true; 
				System.out.println("200문장 실행됨.");
				//실행할 문장 200문장
			} catch (Exception e) {
				System.out.println("고객님이 입력하신 값으로 계산이 불가능합니다.");
				e.printStackTrace();
			}
		}
		System.out.printf("결과값: %5.2f \n",value);
		
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}
}
