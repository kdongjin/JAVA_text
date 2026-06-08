package chapter10.page18;

//자식
public class B extends A {
	//멤변
	int n = 4; 
	//생성자(부모생성자책임)
	public B(int m, int n) {
		super(m);
		this.n = n;
	}
	//멤함
	public void bcd() {
		System.out.println("B 클래스함수");
	}
	
}
