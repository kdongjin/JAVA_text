package chapter16.page27;

public class Run {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.<String>method1("kdj"); 
		
		Child c = new Child();
		c.<Number>method1(10);
		

	}

}
