package chapter12.page14;

public class Run {

	public static void main(String[] args) {
		//자 = 자객
		B b = new B();
		b.bcd();
		//부 = 자객 (다형성구현)
		C c = new B();
		c.bcd();
		//부 = 부객
		//C c2 = new C(); 
		//익명클래스 => 익명객체 => 부 = 익명객체
		C c2 = new C() {
			@Override
			public void bcd() {
				System.out.println("부보로부터 구현된 다형성구현");
				cde(); 
			}
			public void cde() {
				System.out.println("익명에서 사용자 정의 사용한함수");
			}
		};
		
		c2.bcd();
		
		A1 a1 = new A1();
		a1.abc();

	}

}
