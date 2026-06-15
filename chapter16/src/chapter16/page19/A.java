package chapter16.page19;

public class A {}
class B extends A{}
class C extends B{}

//제네릭타입에 타입제한 Object 이하까지만 가능
//제네릭타입에 타입제한 B 이하까지만 가능 => Object, A 안됨 // B, C됨
class D<T extends B> {
	T t;

	public D(T t) {
		super();
		this.t = t;
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
