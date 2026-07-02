package test.singleton;

//싱글톤(3가지 -> 생성자(private), 멤버변수(정적,private), 멤버함수(정적) 
public class SingleTon {
	private static SingleTon singleTon; 
	
	private SingleTon() {
		System.out.println("생성자");
	}

	public static SingleTon getSingleTon() {
		if(singleTon == null) {
			singleTon = new SingleTon();
		}
		return singleTon;
	}
	
	//우리가 사용하고자 하는 함수 설계해서 사용하면 된다. 
	public void printAll() {
		System.out.println("싱글톤에서 사용되는 함수 입니다.");
	}
	
}
