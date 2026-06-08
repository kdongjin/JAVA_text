package chapter10;

public class Rund {

	public static void main(String[] args) {
		//자식객체를 만든다.
		Student stu = new Student(1100, "kdj", 62);
		//자식멤버변수출력
		System.out.printf("stu.name = %s \n",stu.getName());
		System.out.printf("stu.age = %s \n",stu.getAge());
		System.out.printf("stu.stuID = %s \n",stu.studentID);
		
		System.out.println("The end");
	}

}
