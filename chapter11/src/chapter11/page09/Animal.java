package chapter11.page09;

//추상클래스 == 일반클래스(추상메소드, new 할수없음) : 반드시 멤버함수 한개이상 추상메소드가 있어야한다. 
//일반클래스: 9가지자신있어여 
public abstract class Animal extends Object{
	//멤버변수
	private int price;
	private String name; 
	//생성자(오버로딩)
	public Animal() {
		this(0, null);
	}
	public Animal(int price, String name) {
		super();
		this.price = price;
		this.name = name;
	}
	//멤버함수(겟터,셋터,기능, 출력, equals, hashcode, 추상메소드 : 오버라이딩, 오버로딩)
	public abstract void cry();
}













