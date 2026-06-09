package chapter12.page19;

public class A {
	//정적 interface
	static interface B{
		//상수, 추상메소드
		public abstract void bcd(); 
	}
}

class C implements A.B{

	@Override
	public void bcd() {
		System.out.println("다형성구현2");
		
	}
	
}

