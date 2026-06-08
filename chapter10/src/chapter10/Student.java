package chapter10;

public class Student extends Human {
	//멤변[부모(이름,나이), 학번]
	int studentID;

	//생성자(디생, 매생) : 
	//자식: 부모생성자를 책임져야한다.
	public Student(int studentID, String name, int age) {
		super(name, age);
		this.studentID = studentID;
	} 
	//멤함(등교하기)
	public void gotoSchool() {
		System.out.printf("자식 등교하기 stuid =%d, name=%s, age=%d \n",studentID,this.getName(), this.getAge());
	}
	
	
	
}
