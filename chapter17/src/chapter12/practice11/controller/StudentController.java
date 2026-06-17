package chapter12.practice11.controller;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import chapter12.practice11.model.Student;

public class StudentController {
	//1.Student 자료공간 확보, 깊은복사공가 확보
	private List<Student> sArr;
	private List<Student> csArr; 

	//생성자
	public StudentController() {
		 sArr  = new LinkedList<Student>();
		 csArr = new LinkedList<Student>();
	}
	
	//2. 입력
	public void insertStudent() {
		sArr.add(new Student("kdj1", "20260601", 100, 100, 100));
		sArr.add(new Student("kdj2", "20260602", 90, 100, 100));
		sArr.add(new Student("kdj3", "20260603", 80, 100, 100));
		sArr.add(new Student("kdj4", "20260604", 70, 100, 100));
		sArr.add(new Student("kdj5", "20260605", 60, 100, 100));
	}
	//3. 출력
	public List<Student> selectStudent() {
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
	public List<Student> sortStudent() {
		//깊은복사: deep copy, 얕은복사: shallow copy
		for (Student s : sArr) {
			csArr.add(new Student(s));
		}
		//정렬 size(), set(), get()
		for (int i = 0; i < csArr.size() - 1; i++) {
			for (int j = i; j < csArr.size(); j++) {
				if(csArr.get(i).getTotal() < csArr.get(j).getTotal()) {
					Student buffer = csArr.get(i);
					csArr.set(i,csArr.get(j));
					csArr.set(j, buffer); 
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
		return sumTotal() / sArr.size();
	}
	
	//8. 기능(석차)
	public List<Student> rankStudent() {
		for (int i = 0; i < csArr.size(); i++) {
			csArr.get(i).setRank(i+1);
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


























