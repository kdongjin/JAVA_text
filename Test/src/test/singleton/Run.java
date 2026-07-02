package test.singleton;

public class Run {

	public static void main(String[] args) {
		// 싱글톤을 이용해서 객체를 만들어서 활용
		
		//SingleTon st1 = new SingleTon();
		SingleTon st1 = SingleTon.getSingleTon();
		SingleTon st2 = SingleTon.getSingleTon();
		SingleTon st3 = SingleTon.getSingleTon();
	
		st1.printAll();
		st2.printAll();
		st3.printAll();
		
		
		
		
	}

}
