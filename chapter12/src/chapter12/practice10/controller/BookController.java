package chapter12.practice10.controller;

import chapter12.practice10.model.Book;

public class BookController {
	//1. Book[] 
	private Book[] bArr;
	private final int COUNT = 5; 

	public BookController() {
		bArr = new Book[COUNT]; 
	} 
	//2. 입력
	public void insertBook() {
		bArr[0] = new Book("자바정석", "it", 45);
		bArr[1] = new Book("혼공C언어", "it", 15);
		bArr[2] = new Book("피프티피플", "소설", 50);
		bArr[3] = new Book("꿈백화점", "소설", 35);
		bArr[4] = new Book("삼국지", "역사", 10);
	}
	
	//3. 출력
	public Book[] selectBook() {
		return bArr; 
	}
	//4. 정렬(기술 : 원본을 건드리지않고, 사본(깊은복사)을 만든다.)
	public Book[] sortBook() {
		//1.기존의 Book[] 을 깊은복사 다른곳에 Book[] 생성
		Book[] cbArr = new Book[COUNT]; 
		for (int i = 0; i < cbArr.length; i++) {
			cbArr[i] = new Book(bArr[i]);
		}
		//5개배열원소  [0] <[0] [0] <[1]  [0] <[2]  [0] <[3]  [0] <[4]
		//                   [1] <[1]  [1] <[2]  [1] <[3]  [1] <[4]
		//							   [2] <[2]  [2] <[3]  [2] <[4]
		//                                       [3] <[3]  [3] <[4]
		for (int i = 0; i < cbArr.length-1; i++) {
			for (int j = i; j < cbArr.length; j++) {
				if(cbArr[i].getRentCount() < cbArr[j].getRentCount()) {
					Book buffer = cbArr[i];
					cbArr[i] = cbArr[j];
					cbArr[j] = buffer;
				}
			}
		}
		return cbArr; 
	}
	//5. 수정
	//6. 삭제
	//7. 검색
	public Book searchBookTitle(String title) {
		Book findBook = null;  
		for (int i = 0; i < bArr.length; i++) {
			if(bArr[i].getTitle().contains(title) == true) {
				findBook  = bArr[i]; 
				break; 
			}
		}
		return findBook; 
	}
	//7. 요청되는계산(대여수총합)
	public int sumRentCount() {
		int sum = 0; 
		for (Book book : bArr) {
			sum += book.getRentCount(); 
		}
		return sum; 
	}
	//7. 요청되는계산(대여수총합, 대여수평균)
	public double[] sumAvg() {
		double[] sumAvgArr = new double[2];
		sumAvgArr[0] = (double)sumRentCount();
		sumAvgArr[1] = sumAvgArr[0] / COUNT; 
		return sumAvgArr; 
	}
	
}






































