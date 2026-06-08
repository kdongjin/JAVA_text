package chapter06.page.student;

public class StudentMain {

	public static void main(String[] args) {
		// 3명의 학생의정보를 받아서 출력하는 프로그램이다.
//		Student stu1 = new Student("kdj1", 100, 100, 100);
//		Student stu2 = new Student("kdj2", 90, 90, 90);
//		Student stu3 = new Student("kdj3", 80, 80, 80);
		//Student객체배열선언
		Student[] stuArray = new Student[3]; 
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i] = new Student("kdj"+i, 100,100,100); 
		}		
		
		//총점
//		stu1.totalCalculate();
//		stu2.totalCalculate();
//		stu3.totalCalculate();
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].totalCalculate();
		}
		
		//출력
//		stu1.studentPrint();
//		stu2.studentPrint();
//		stu3.studentPrint();
		for (int i = 0; i < stuArray.length; i++) {
			stuArray[i].studentPrint();
		}
		
	}

}






