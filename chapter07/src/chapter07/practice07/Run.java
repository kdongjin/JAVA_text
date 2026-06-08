package chapter07.practice07;

import java.util.Scanner;

public class Run {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		boolean exitFlag = false; 
		while (!exitFlag) {
			System.out.printf("1:1번문제, 2:2번문제, 3:종료 \n");
			System.out.printf("선택>>");
			int no = Integer.parseInt(scan.nextLine()); 
			
			switch (no) {
			case 1:
				practice01(); 
				break;
			case 2:
				System.out.println("2번문제");
				break;
			case 3:
				exitFlag = true; 
				System.out.println("프로그램종료");
				break;			
			default:
				System.out.println("정신차려");
				break;
			}
		}//end of while
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}
	//1번문제 
	//기본본생성자를통해Product 객체를생성하고 information()을 이용해 출력
	//출력양식: 아이폰/200만원/애플
	private static void practice01() {
		//1.객체를 만든다.
		Product product = new Product();
		//2.setter를 멤버변수에 값을 입력한다.
		System.out.print("상품명>>");
		String productName = scan.nextLine();
		product.setPrdouctName(productName);
		
		System.out.print("가격>>");
		int price = Integer.parseInt(scan.nextLine());
		product.setPrice(price);
		
		System.out.print("브랜드명>>");
		String brand = scan.nextLine();
		product.setBrand(brand);
		
		//3. 출력
		product.information();
	}
}


















