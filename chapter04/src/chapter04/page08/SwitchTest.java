package chapter04.page08;

import java.util.Scanner;

public class SwitchTest {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// switch case문에 break 있는것과 없는것의 차이점
		// no = 1 -> 'A', no = 2 -> 'B', no = 3 -> 'C', no = 4 -> 'D', 5-> "해당사항없음"
		System.out.print("input no(1~5)>>");
		int no = Integer.parseInt(scan.nextLine());
		
		switch (no) {
		case 1:
			System.out.println("A");
			//break;
		case 2:
			System.out.println("B");
//			break;
		case 3:
			System.out.println("C");
//			break;
		case 4:
			System.out.println("D");
//			break;			
		default:
			System.out.println("해당사항이없음.");
//			break;
		}
		
		scan.close();
		System.out.println("The end");
	}

}
