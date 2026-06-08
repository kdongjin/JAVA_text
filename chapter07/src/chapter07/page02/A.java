package chapter07.page02;

public class A {
	//멤버변수 정수형정보두개값
	int m;
	int n; 
	//생성자(디생,매생)
	public A(int m, int n) {
		this.m = m;
		this.n = n;
	}
	//멤버함수(getter, setter)
	public int getM() {
		return this.m; 
	}
	public void setM(int m) {
		this.m = m; 
	}
	public int getN() {
		return this.n;
	}
	public void setN(int n) {
		this.n = n;
	}
	//멤버함수(역할기능)  
	//void work1() :지역변수 k = 5, k출력, work2(3)콜한다.
	public void work1() {
		int k = 5; 
		System.out.printf("k = %d \n",k);
		work2(3); 
	}
	
	//지역변수 j = 4, i+j 출력
	public void work2(int i) {
		int j = 4; 
		System.out.printf("%d + %d = %d \n",i,j,i+j);
	}
	
	public void work3() {
		int k = 10; 
		System.out.printf("지역변수 k = %d \n", k);
	}
	
	//멤버함수(toString: 멤버변수출력)
	public String toString() {
		return "A [m=" + m + ", n=" + n + "]";
	}
}





