package chapter16.page20;

public class GenericMehod {
	//제네릭 메소드 타입제한
	//리턴값: 0, 매개변수: 0
	
	public <T extends String> T method1(T t) {
		//t.메소드 Object 10개반 제한이 되더라. 
		int len = t.length();
		System.out.printf("length = %d \n", len);
		return null; 
	}

}
