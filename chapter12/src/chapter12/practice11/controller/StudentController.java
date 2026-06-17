package chapter12.practice11.controller;

import chapter12.practice11.model.Student;

public class StudentController {
	//1.Student 자료공간 확보, 깊은복사공가 확보
	private Student[] sArr;
	private Student[] csArr; 
	private final int COUNT = 5; 

	//생성자
	public StudentController() {
		 sArr  = new Student[COUNT];
		 csArr = new Student[COUNT]; 
	}
	
	//2. 입력
	public void insertStudent() {
		sArr[0] = new Student("kdj1", "20260601", 100, 100, 100);
		sArr[1] = new Student("kdj2", "20260602", 90, 100, 100);
		sArr[2] = new Student("kdj3", "20260603", 80, 100, 100);
		sArr[3] = new Student("kdj4", "20260604", 70, 100, 100);
		sArr[4] = new Student("kdj5", "20260605", 60, 100, 100);
	}
	//3. 출력
	public Student[] selectStudent() {
		return sArr; 
	}
	//4. 수정
	//5. 삭제
	//6. 검색
	public Student searchStudentNoName(String name, String no) {
		Student findStudent = null; 
		for (Student s : sArr) {
			if(s.getName().equals(name) && s.getNo().equals(no)) {
				findStudent = s; 
				break; 
			}
		}
		return findStudent; 
	}
	//7. 정렬
	public Student[] sortStudent() {
		//깊은복사: deep copy, 얕은복사: shallow copy
		for (int i = 0; i < sArr.length; i++) {
			if(sArr[i] != null) {
				csArr[i] = new Student(sArr[i]); 
			}
		}
		//정렬
		for (int i = 0; i < csArr.length - 1; i++) {
			for (int j = i; j < csArr.length; j++) {
				if(csArr[i].getTotal() < csArr[j].getTotal()) {
					Student buffer = csArr[i];
					csArr[i] = csArr[j];
					csArr[j] = buffer; 
				}
			}
		}
		
		return csArr; 
	}

	//8. 기능(전체학생 총점. 전체학생 평균)
	public int sumTotal() {
		int sum = 0; 
		for (Student s : sArr) {
			if(s != null) {
				sum += s.getTotal();
			}
		}
		return sum; 
	}
	
	//8. 기능(전체학생 평균)
	public double avgTotal() {
		return sumTotal() / (double)COUNT;
	}
	
	//8. 기능(석차)
	public Student[] rankStudent() {
		for (int i = 0; i < csArr.length; i++) {
			csArr[i].setRank(i+1);
//			if(i == 0) {
//				csArr[i].setRank(i+1);
//			}else if((csArr[i-1].getTotal() == csArr[i].getTotal())) {
//				csArr[i].setRank(csArr[i-1].getRank());
//			}else {
//				csArr[i].setRank(i+1); 
//			}
		}

		//원본에 등수를 입력저장하는 방식
//		for (int i = 0; i < csArr.length; i++) {
//			for (int j = 0; j < sArr.length; j++) {
//				if(csArr[i].getNo().equals(sArr[i].getNo())) {
//					sArr[i].setRank(csArr[i].getRank());
//					break; 
//				}
//			}
//		}
		
		return csArr; 
	}
}


























