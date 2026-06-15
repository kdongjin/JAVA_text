package chapter16.page21;

public class Run {

	public static void main(String[] args) {
		MyClass mi = new MyClass(); 

		GenericMethod gm = new GenericMethod();
		gm.<MyClass>method1(mi); 
		
		
		gm.<MyInterface>method1(new MyInterface() {
			
			@Override
			public void print() {
				System.out.println("오버라이딩된 함수2");
				
			}
		});
	}

}
