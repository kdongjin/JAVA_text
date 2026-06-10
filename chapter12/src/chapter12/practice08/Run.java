package chapter12.practice08;

import java.util.Scanner;

import chapter12.practice08.view.BookMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false; 
		while(!exitFlag) {
			System.out.println("1.도서, 2.판매, 3.회원관리, 4.관리자, 5.게시판 ,6.종료");
			System.out.print("1~6번선택 >>");
			int no = Integer.parseInt(scan.nextLine());
			
			switch (no) {
			case 1: {
				BookMenu bm = new BookMenu();
				bm.bookDisplay();
				break;
			}
			case 2:{
				System.out.println("도서판매는 작업중");
				break; 
			}
			case 6:{
				exitFlag = true; 
				break; 
			}
			default:
				System.out.println("고객님 메뉴에 있는 번호선택해주세요.");
				break; 
			}
		}
		
		//자원반납
		if(scan != null) {
			scan.close();
		}
		System.out.println("저희사이트를 방문해주셔서 감사합니다.");
	}

}
