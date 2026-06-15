package chapter16.page19;

public class Run {

	public static void main(String[] args) {
		//D<Object> d = new D<Object>(new Object());
		//D<A> d = new D<A>(new A());
		D<B> d1 = new D<B>(new B());
		d1.setT(new B());
		d1.setT(new C());
		//d1.setT(new Object());

		D<C> d2 = new D<C>(new C());
		d2.setT(new C());
		//d2.setT(new B());
	}

}
