package chapter10.page59;

public class A {
	//멤버변수
	private int age;
	private String name;
	//생성자
	public A() {
		this(0,null); 
	}
	public A(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	} 
	//멤버함수(겟터, 셋터)
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//멤버함수(출력)
	@Override
	public String toString() {
		return "A [age=" + age + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		//1. 부인자타를 확인한다.
		if (!(obj instanceof A)) {
			System.out.printf("제발 비교대상객체 좀 주라.");
			return false; 
		}
		//2.다운캐스팅을 한다.
		A a = (A)obj;
		//3. this객체와, a 객체를 비교한다. (나이만한다.)
		if(this.age == a.age && this.name.equals(a.name)) {
			return true;
		}
		return false; 
	}
}













