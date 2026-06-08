package chapter07.page15;

//오버로딩조건(메서드 시그너쳐만 다르면 된다) : 매개변수 타입의갯수와 , 타입이 서로 달라야 한다. 
public class A {

	//멤버함수(오버로딩) 출력기능을 갖는 오버로딩
	public void print() {
		System.out.printf("오버로딩함수입니다.1\n");
	}
	public int print(int no) {
		System.out.printf("오버로딩함수입니다.2 no = %d \n", no);
		return no; 
	}
	public int print(double no) {
		System.out.printf("오버로딩함수입니다.3 no = %5.2f \n", no);
		return (int)no; 
	}
	public void print(int no, double dno) {
		System.out.printf("오버로딩함수입니다.4 no = %d dno = %5.2f \n", no, dno);
	}
	public void print(double dno, int no) {
		System.out.printf("오버로딩함수입니다.5 no = %d dno = %5.2f \n", no, dno);
	}
	public void print(String str, int no) {
		System.out.printf("오버로딩함수입니다.6 no = %d string = %s \n", no, str);
	}
}
