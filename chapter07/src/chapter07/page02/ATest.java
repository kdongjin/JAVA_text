package chapter07.page02;

public class ATest {

	public static void main(String[] args) {
		//1. A 객체를 만든다.
		A a = new A(3, 4);
		//2. A객체 m멤버변수 10으로 변경하시오.
		//a.m = 10; 
		a.setM(10);
		
		//2. A 멤버변수 m, n 출력한다.
		//System.out.printf("a.m = %d\n", a.m);
		//System.out.printf("a.n = %d\n", a.n);
		System.out.printf("a.m = %d\n", a.getM());
		System.out.printf("a.n = %d\n", a.getN());
		//3.A 멤버함수 work1()
		a.work1();

	}

}
