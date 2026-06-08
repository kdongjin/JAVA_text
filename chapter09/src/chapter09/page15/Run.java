package chapter09.page15;

public class Run {

	public static void main(String[] args) {
		// A객체 두개를 만든다.
		A a1 = new A();
		A a2 = new A(); 
		
		//두개객체 동적멤변 m 값을 할당하고 출력한다. 
		a1.m = 5;
		a2.m = 6;
		System.out.printf("a1.m = %d , a2.m = %d \n", a1.m, a2.m);
		
		//두개객체 정적멤변 n값을 할당하고 출력한다.
		a1.n = 7;
		a2.n = 8;
		System.out.printf("a1.n = %d , a2.n = %d \n", a1.n, a2.n);
		
		//정적멤버변수는 객체참조변수명.정적멤버변수 (지양) => 클래스명.정적멤버변수
		A.n = 9; 
		System.out.printf("a1.n = %d , a2.n = %d \n", a1.n, a2.n);
		
	}

}
