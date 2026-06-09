package chapter12.page03;

public class Run {
	
	public static void main(String[] args) {
		//인스턴스내부클래스 B사용할려고 한다. 
		//인스턴스멤버변수를 a, b, c사용할려고 한다.
		A aobj = new A(); 
		System.out.println(aobj.a);
		
		//인스턴스멤버클래스 사용방법
		A.B bobj = aobj.new B(); 
		bobj.bcd();
		//정적멤버클래스 사용방법
		A.C cobj = new A.C(); 
		cobj.bcd();
		
	}
}
