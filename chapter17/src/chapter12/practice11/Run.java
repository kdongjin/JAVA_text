package chapter12.practice11;

import java.util.Scanner;

import chapter12.practice11.view.StudentMenu;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentMenu sm = new StudentMenu();
		sm.studentInfoDisplay();
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("메인프로그램종료");
	}

}
