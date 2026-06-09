package chapter12.page14;

public class A1 {
	//멤버변수
	public C c = new C() {
		
		@Override
		public void bcd() {
			System.out.println("이너 익명 다형성구현입니다. ");
			
		}
	};
	
	//멤버이너클래스
//	public class B implements C{
//
//		@Override
//		public void bcd() {
//			System.out.println("이너 다형성구현입니다. ");
//			
//		}
//		
//	}
	
	//메서드함수
	public void abc() {
		c.bcd();
	}
}
