package chapter17.practice13;

import chapter17.practice13.controller.StudentController;
import chapter17.practice13.model.StudentVO;
import chapter17.practice13.view.StudentView;

public class Run {

	public static void main(String[] args) {
		StudentView sv = new StudentView();
		sv.mainMenu();
		
		System.out.println("Main 프로그램 종료");
	}

}
