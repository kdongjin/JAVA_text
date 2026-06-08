package chapter11.practice07.view;

import chapter11.practice07.controller.StudentController;
import chapter11.practice07.model.Student;

public class StudentMenu {
	private StudentController ssm;

	public StudentMenu() {
		ssm = new StudentController(); 
		//학생정보출력(5명)
		Student[] studentArray = ssm.printStudent();
		for (int i = 0; i < studentArray.length; i++) {
			System.out.printf("%d번 %s \n", i, studentArray[i].toString());
		}
		//학생합계, 평균출력
		double[] avgArray = ssm.avgScore();
		System.out.printf("5명의 학생의 총점: %5.1f \n", avgArray[0]);
		System.out.printf("5명의 학생의 평균: %5.1f \n", avgArray[1]);
		//학생의 성적의 결과출력 60점이상이면 합격, 60점미만 재시험
		for (int i = 0; i < avgArray.length; i++) {
			String isPass = (studentArray[i].getScore() >= ssm.CUT_LINE ) ? "합격" : "불합격";
			System.out.printf("%s 학생은 %s 입니다 \n",studentArray[i].getName(),isPass);
		}
	} 
	
	
}
