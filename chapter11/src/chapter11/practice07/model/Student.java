package chapter11.practice07.model;

import java.util.Objects;

//9개
public class Student {
	//1.멤버변수(인멤,정적멤,상수-인상,정상)
	private String name;
	private String subject;
	private int score; 
	//2.생성자(디생,매생,super(),생오버로딩:this)
	public Student() {
		this(null, null, 0);
	}
	public Student(String name, String subject, int score) {
		super();
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	//3.멤함(겟,셋,기능,equals,hascode,출력)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	//오버라이딩 equals
	@Override
	public boolean equals(Object obj) {
		//1.부인자타
		if (!(obj instanceof Student)) {
			System.out.println("정신차려 비교대상오류");
			return false; 
		}
		//2.다운캐스팅
		Student stu= (Student)obj;
		//3.내용비교
		if (this.name.equals(stu.name)) {
			return true;
		}
		return false; 
	}
	//? hashCode : hash가 무엇일까?
	@Override
	public int hashCode() {
		return Objects.hash(this.name); 
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subject=" + subject + ", score=" + score + "]";
	}
	
}


































