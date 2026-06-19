package chapter17.practice13.view;

import java.util.List;
import java.util.Scanner;

import chapter17.practice13.controller.StudentController;
import chapter17.practice13.model.StudentVO;

public class StudentView {
	private Scanner scan; 
	private StudentController sc; 
	
	public StudentView() {
		scan = new Scanner(System.in);
		sc = new StudentController(); 
	}

	public void mainMenu() {
		boolean exitFlag = false;

		while (!exitFlag) {
			System.out.println("***** 학생 성적 관리 메뉴 *****");
			System.out.println("1. 학생 정보 추가");
			System.out.println("2. 전체 학생 목록 출력");
			System.out.println("3. 특정 학생 검색");
			System.out.println("4. 특정 학생 삭제");
			System.out.println("5. 특정 학생 정보 수정");
			System.out.println("6. 총점 내림차순정렬");
			System.out.println("7. 이름 오름차순정렬");
			System.out.println("8. Test용 더미자료 입력");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 번호 선택 : >> ");
			int no = Integer.parseInt(scan.nextLine());

			switch (no) {
			case 0:	exitFlag = true; break;
			case 1:	addStudent(); break;
			case 2:	printAll(); break;
			case 3:	searchStudent(); break;
			case 4:	removeStudent(); break;
			case 5:	updateStudent(); break;
			case 6:	sortByTotalDesc(); break;
			case 7:	sortByNameAsc(); break;
			default: System.out.println("잘못된 번호 입력"); break;
			}// end switch
		} // end while
		
		if(scan != null) scan.close();
		System.out.println("***** 프로그램종료 *****");
		
	}

	//1입력(insert)
	private void addStudent() {
		sc.addStudent(new StudentVO("홍길동1", 260601, 90, 19, 90));
		sc.addStudent(new StudentVO("홍길동2", 260602, 90, 80, 37));
		sc.addStudent(new StudentVO("홍길동3", 260603, 81, 54, 72));
		sc.addStudent(new StudentVO("홍길동4", 260604, 77, 67, 74));
		sc.addStudent(new StudentVO("홍길동5", 260605, 50, 90, 93));
	}

	//2 출력(select)
	private void printAll() {
		List<StudentVO> sl =  sc.printAll();
		if(sl != null) {
			System.out.println(sl);
		}else {
			System.out.println("학생정보를 보여줄수 없습니다.");
		}
	}
	
	//검색(select)
	private void searchStudent() {
		System.out.print("검색이름>>");
		String name = scan.nextLine();
		System.out.print("검색아이디>>");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.searchStudent(name, id);
		if(student != null) {
			System.out.println(student);
		}else {
			System.out.println("이름과 아이디갑 없습니다.");
		}
	}


	//삭제(delete)
	private void removeStudent() {
		System.out.print("삭제할이름>>");
		String name = scan.nextLine();
		System.out.print("삭제할아이디>>");
		int id = Integer.parseInt(scan.nextLine());
		StudentVO student = sc.removeStudent(name, id);
		if(student != null) {
			System.out.println("삭제성공: "+student);
		}else {
			System.out.println("삭제실패");
		}
	}
	

	//수정(update): 기존아이디가 같으면 수정(이름, 점수), 
	private void updateStudent() {
		System.out.print("수정할이름>>");
		String name = scan.nextLine();
		System.out.print("수정할아이디>>");
		int id = Integer.parseInt(scan.nextLine());
		
		StudentVO svo = new StudentVO(name,id,(int)(Math.random()*100),(int)(Math.random()*100), (int)(Math.random()*100));
		StudentVO student = sc.searchStudent(svo.getName(), svo.getId());
		if(student != null) {
			sc.updateStudent(id,name,svo); 
		}else {
			System.out.println("업데이트할 수 없습니다. 정보다시입력요청");
		}
	}

	//정렬(select) : 얕은복사(0)
	private void sortByTotalDesc() {
		List<StudentVO> sl = sc.sortByTotalDesc();
		if(sl != null) {
			System.out.println(sl);
		}else {
			System.out.println("정렬을 진행할 수 없습니다.");
		}
		
	}

	//정렬(select) : 깊은복사 얕은복사(0)
	private void sortByNameAsc() {
		List<StudentVO> sl = sc.sortByNameAsc();
		if(sl != null) {
			System.out.println(sl);
		}else {
			System.out.println("정렬을 진행할 수 없습니다.");
		}
	}
}





















