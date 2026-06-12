package chapter12.practice09.view;


import chapter12.practice09.Run;
import chapter12.practice09.controller.BookController;
import chapter12.practice09.model.Book;

public class BookMenu {
	private BookController bc; 
	
	public BookMenu() {
		bc = new BookController(); 
	}
	
	public void bookInfoDisplay() {
		boolean exitFlag = false; 
		while (!exitFlag) {
			
			System.out.println("1.책정보출력, 2.대여 순위별 정렬, 3.총대여수, 4.대여수와 평균, 5.HOME");
			System.out.print(">>");
			int no = Integer.parseInt(Run.scan.nextLine());
			
			switch (no) {
			case 1:
				//1책정보를 다보여주세요. 요청하는 화면
				printBook();
				break;
			case 2:
				//2책정보를 대여수 순위로 정렬에서 보여주세요.
				rentCountSort(); 
				break;
			case 3:
				//3.책정보 총 대여수 보여주세요.
				sumRentCount();
				break;
			case 4:
				//4.책정보 총 대여수와 평균을 보여주세요.
				avgRentCount();
				break;
			case 5:
				//Home
				exitFlag = true;
				break;
			default:
				System.out.println("다시선택바람");
				break;
			}
		}
	}

	
	
	//1책정보를 다보여주세요. 요청하는 화면
	public void printBook() {
		Book[] bArr= bc.printBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}
	//2책정보를 대여수 순위로 정렬에서 보여주세요.
	private void rentCountSort() {
		Book[] bArr = bc.rentCountSort();
		for (int i = 0; i < bArr.length; i++) {
			System.out.println(bArr[i].toString());
		}
	}

	//3.책정보 총 대여수 보여주세요.
	public void sumRentCount() {
		System.out.printf("책정보 총 대여수 : %d \n", bc.sumRentCount());
	}

	
	//4.책정보 총 대여수와 평균을 보여주세요.
	private void avgRentCount() {
		double[] sumAvgArr = bc.avgRentCount();
		System.out.printf("책정보 총 대여수: %5.0f ,책정보 평균 : %6.2f \n", sumAvgArr[0], sumAvgArr[1]);
	}

}












