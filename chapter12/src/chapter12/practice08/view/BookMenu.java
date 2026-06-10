package chapter12.practice08.view;

import chapter12.practice08.Run;
import chapter12.practice08.controller.BookController;
import chapter12.practice08.model.BookVO;

public class BookMenu {
	private BookController bk;
	
	public BookMenu() {
		this.bk = new BookController();
	}
	
	public void bookDisplay() {
		boolean exitFlag = false; 
		while (!exitFlag) {
			System.out.println("1.도서정보출력, 2.대여통계출력, 3.도서등급판별, 4.도서정보정렬 , 5.메인화면" );
			System.out.print("1~5번선택>>");
			int no = Integer.parseInt(Run.scan.nextLine()); 
			switch (no) {
			case 1:{
				System.out.println("========== 도서 정보 출력 ==========");
				BookVO[] bookVO= bk.printBook(); 
				for (int i = 0; i < bookVO.length; i++) {
					System.out.println(bookVO[i].inform());
				}
			}
				break;
			case 2:{
				System.out.println("========== 대여 통계 출력 ==========");
				double[] avgRentCount = bk.avgRentCount();
				System.out.printf("도서정보랜트수합계 : %5.0f ", avgRentCount[0]);
				System.out.printf("도서정보랜트수평균 : %5.0f \n", avgRentCount[1]);
			}
				break;
			case 3:{
				System.out.println("========== 도서 등급 판별 ==========");
				BookVO[] bookVO= bk.printBook(); 
				
				for (int i = 0; i < bookVO.length; i++) {
					char grade = 'F';
					if (bookVO[i].getRentCount() >= 50 ) {
						grade = 'A';
					}else if (bookVO[i].getRentCount() >= 40 ) {
						grade = 'B';
					}else if (bookVO[i].getRentCount() >= 30 ) {
						grade = 'C';
					}else if (bookVO[i].getRentCount() >= 20 ) {
						grade = 'D';
					}
					
					System.out.print(bookVO[i].inform());
					System.out.printf(" 도서등급 : %c \n", grade);
				}
			}
				break;
			case 4:
				System.out.println("========== 도서 정보 정렬 ==========");
				BookVO[] bvArr = bk.rentCountSort();
				for (BookVO bookVO : bvArr) {
					System.out.println(bookVO.inform());
				}
				break;
			case 5:
				System.out.println("========== 도서 정보 페이지종료 ==========");
				exitFlag = true; 
				break;			
			default:
				System.out.println("고객님 맞는메뉴선택해주세요.");
				break;
			}
			
		}
	}

}










