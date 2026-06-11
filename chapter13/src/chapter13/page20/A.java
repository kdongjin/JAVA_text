package chapter13.page20;

public class A {

	//멤변수(인변,정변,상수,인클,정클,정인터페이스)
	//생성자(디생,매생 ->this)
	public A() {}
	//멤버함수(인함,정함,겟터,세터,기능,오라(hashCode,equlas, toString)
	public void abc() throws InterruptedException  {
		bcd();
	}
	public void bcd() throws InterruptedException {
		//반복문을 실행하다가 0.5초씩 정지했다가 실행하는 로직구현
		for (int i = 0; i < 10; i++) {
			System.out.println(i+1);
				Thread.sleep(500);
		}
		
	}
}
