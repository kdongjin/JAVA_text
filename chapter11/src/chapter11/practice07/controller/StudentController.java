package chapter11.practice07.controller;

import chapter11.practice07.model.Student;

public class StudentController {
	//멤변
	private Student[] sArr;
	public final int CUT_LINE;
	//생성자
	public StudentController() {
		//학생객체배열을 생성한다. CUT_LINE 초기값설정
		sArr = new Student[5];
		CUT_LINE = 60; 
		//객체배열에 초기값을 입력한다.
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "리액트", 20);
	}
	//멤함 getter
	public Student[] printStudent() {
		return sArr;
	}
	//멤함(기능) 합계
	public int sumScore() {
		int sum = 0; 
		for (int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
		}
		return sum; 
	}
	//멤함(기능) 평균 
	public double[] avgScore() {
		double[] avgArray = new double[2];
		avgArray[0] = (double)sumScore();
		avgArray[1] = avgArray[0] / 5.0; 
		return avgArray; 
	}
}








