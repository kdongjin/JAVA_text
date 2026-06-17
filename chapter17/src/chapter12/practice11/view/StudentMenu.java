package chapter12.practice11.view;

import java.util.List;

import chapter12.practice11.Run;
import chapter12.practice11.controller.StudentController;
import chapter12.practice11.model.Student;

public class StudentMenu {

	private StudentController sc;

	public StudentMenu() {
		sc = new StudentController();
	}

	public void studentInfoDisplay() {
		boolean exitFlag = false;
		while (!exitFlag) {

			System.out.println("1.입력, 2.출력, 3.정렬, 4.점수총합, 5.점수평균, 6.검색 , 7.석차, 8.Home");
			System.out.print(">>");
			int no = Integer.parseInt(Run.scan.nextLine());

			switch (no) {
			case 1:
				// 1책정보입력 요청하는 화면
				insertStudent();
				break;
			case 2:
				// 2책정보출력. 요청하는 화면
				selectStudent();
				break;
			case 3:
				// 3책정렬에서 보여주세요.
				sortStudent();
				break;
			case 4:
				// 4.책정보 총 대여수 보여주세요.
				sumTotal();
				break;
			case 5:
				// 5.책정보 총 대여수와 평균을 보여주세요.
				avgTotal();
				break;
			case 6:
				// 5.책정보검색을 보여주세요.
				searchStudentNoName();
				break;
			case 7:
				// 5.책정보검색을 보여주세요.
				rankStudent();
				break;
			case 8:
				// Home
				exitFlag = true;
				break;
			default:
				System.out.println("다시선택바람");
				break;
			}
		}
	}

	
	
	private void insertStudent() {
		sc.insertStudent();
	}

	private void selectStudent() {
		List<Student> sArr = sc.selectStudent();
		for (Student student : sArr) {
			System.out.println(student.toString());
		}
	}
	
	private void sortStudent() {
		List<Student> sArr = sc.sortStudent(); 
		for (Student student : sArr) {
			System.out.println(student.toString());
		}
	}


	private void sumTotal() {
		int sum = sc.sumTotal(); 
		System.out.printf("5명의 학생의 점수 총합 : %5d \n",sum);
	}
	

	private void avgTotal() {
		double avg = sc.avgTotal();
		System.out.printf("5명의 학생의 점수 총합평균 : %.2f \n",avg);
	}


	private void searchStudentNoName() {
		System.out.print("검색할이름>>");
		String name = Run.scan.nextLine();
		System.out.print("검색할번호>>");
		String no = Run.scan.nextLine();
		Student student = sc.searchStudentNoName(name, no); 
		if(student != null) {
			System.out.printf("찾는학생정보 : %s \n", student.toString());
		}else {
			System.out.printf("찾는 학생정보가 없습니다. \n");
		}
		
	}

	private void rankStudent() {
		List<Student> sArr = sc.rankStudent();
		for (Student s : sArr) {
			System.out.println(s.toString() +"석차=" +s.getRank());
		}
	}

}









