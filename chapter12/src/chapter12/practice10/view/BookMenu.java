package chapter12.practice10.view;

import chapter12.practice10.Run;
import chapter12.practice10.controller.BookController;
import chapter12.practice10.model.Book;

public class BookMenu {

	private BookController bc;

	public BookMenu() {
		bc = new BookController();
	}

	public void bookInfoDisplay() {
		boolean exitFlag = false;
		while (!exitFlag) {

			System.out.println("1.정보입력, 2. 책정보출력, 3.정렬, 4.총대여수, 5.대여수와평균, 6.검색 7.HOME");
			System.out.print(">>");
			int no = Integer.parseInt(Run.scan.nextLine());

			switch (no) {
			case 1:
				// 1책정보입력 요청하는 화면
				insertBook();
				break;
			case 2:
				// 2책정보출력. 요청하는 화면
				selectBook();
				break;
			case 3:
				// 3책정렬에서 보여주세요.
				sortBook();
				break;
			case 4:
				// 4.책정보 총 대여수 보여주세요.
				sumRentCount();
				break;
			case 5:
				// 5.책정보 총 대여수와 평균을 보여주세요.
				sumAvg();
				break;
			case 6:
				// 5.책정보검색을 보여주세요.
				searchBookTitle();
				break;
			case 7:
				// Home
				exitFlag = true;
				break;
			default:
				System.out.println("다시선택바람");
				break;
			}
		}
	}

	private void insertBook() {
		bc.insertBook();
	}

	private void selectBook() {
		Book[] bArr = bc.selectBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}

	private void sortBook() {
		Book[] bArr = bc.sortBook();
		for (Book book : bArr) {
			System.out.println(book.toString());
		}
	}

	private void sumRentCount() {
		int sum = bc.sumRentCount();
		System.out.printf("총 대여수: %d \n", sum);
	}

	private void sumAvg() {
		double[] sumAvgArr = bc.sumAvg();
		System.out.printf("총 대여수: %.1f \n", sumAvgArr[0]);
		System.out.printf("총 평균: %.2f \n", sumAvgArr[1]);
	}

	private void searchBookTitle() {
		System.out.print("검색할책제목입력>>");
		String title = Run.scan.nextLine();

		Book book = bc.searchBookTitle(title);
		if (book != null) {
			System.out.printf("책제목:%s 찾았습니다. \n책정보: %s \n", title, book.toString());
		} else {
			System.out.printf("책제목:%s 못찾았습니다. \n", title);
		}
	}
}
