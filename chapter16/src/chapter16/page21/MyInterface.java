package chapter16.page21;

public interface MyInterface {
	//상수
	//추상메소드, 디폴트메소드, private 메소드, 정적메소드
	public abstract void print();

}


class GenericMethod {
	
	public <T extends MyInterface> T method1(T t) {
		t.print();
		return null; 
	}
}