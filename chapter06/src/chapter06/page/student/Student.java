package chapter06.page.student;

//분산되어 있는 학생정보를 Student클래스관리함.
public class Student {
	//멤버변수
	String name; 
	int kor;
	int eng;
	int math;
	int total;
	
	//디폴트 생성자 X => 매개변수있는생성자
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng; 
		this.math = math;
	} 
	//멤버함수
	void totalCalculate() {
		total = kor + eng + math; 
	}
	//멤버함수
	void studentPrint() {
		System.out.printf("%-10s %-5d %-5d %-5d %-5d \n", name, kor, eng, math, total);
	}
}
