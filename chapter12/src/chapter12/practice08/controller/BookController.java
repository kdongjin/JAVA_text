package chapter12.practice08.controller;

import chapter12.practice08.model.BookVO;

public class BookController {
	// 우리가 데이터를 가지고 있어야한다. => 데이타베이스에서 자료를 가져온다.(5개자료)
	private BookVO[] bArr;

	// 생성자
	public BookController() {
		bArr = new BookVO[5];
		bArr[0] = new BookVO("자바정석", "it", 45);
		bArr[1] = new BookVO("혼공C언어", "it", 15);
		bArr[2] = new BookVO("피프티피플", "소설", 50);
		bArr[3] = new BookVO("꿈백화점", "소설", 35);
		bArr[4] = new BookVO("삼국지", "역사", 10);
	}

	// 책정보출력
	public BookVO[] printBook() {
		return bArr;
	}

	// rentCount 합계
	public int sumRentCount() {
		int sum = 0;
		for (int i = 0; i < bArr.length; i++) {
			sum += bArr[i].getRentCount();
		}
		return sum;
	}

	// 총계와 평균값을 double[]
	public double[] avgRentCount() {
		double[] sumAndAvg = new double[2];
		sumAndAvg[0] = (double) sumRentCount();
		sumAndAvg[1] = sumAndAvg[0] / bArr.length;
		return sumAndAvg;
	}

	// 도서대여 카운트중심으로 내림차순으로 정렬하시오.
	// 원본을 사용해서 정렬하는 방법으로 처리한다.
	public BookVO[] rentCountSort() {

		for (int j = 0; j < bArr.length - 1; j++) {
			for (int i = j; i < bArr.length; i++) {
				if (bArr[j].getRentCount() < bArr[i].getRentCount()) {
					BookVO buffer = bArr[j];
					bArr[j] = bArr[i];
					bArr[i] = buffer;
				}
			}
		}
		return bArr;
	}

}
