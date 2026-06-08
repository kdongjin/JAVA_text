package chapter07.page10;

import java.util.Arrays;

public class A {
	// 멤변
	// 디생,매생
	
	// 겟터,셋터
	// 기능
	// 1)리턴값없고, 함수명 print, 매변없고, 안녕출력
	// 2)리턴값 int, 함수명 data, 매변없고, 3을 리턴
	// 3)리턴값 double, 함수명 sum, 매변없고 int a double b, a + b을 리턴
	// 4)리턴값없고 , 함수명 printMonth, 매변없고 int m,
	// m값이 0미만이거나, 12 초과이거든 "잘모된입력" 출력 리턴
	// 아니면 'm 월' 값을 출력
	// #. 리턴타입:void + 매개변수: 없음
	void print() {
		System.out.println("안녕");
	}

	// #. 리턴타입: int + 매개변수: 없음
	int data() {
		return 3;
	}

	// #. 리턴타입: double + 매개변수: 2개
	double sum(int a, double b) {
		return a + b;
	}

	// #. 리턴타입: void + 매개변수 : 1개 + 내부 함수종료(return 포함)
	void printMonth(int m) {
		if (m < 0 || m > 12) {
			System.out.println("잘못된 입력!");
			return;
		}
		System.out.println(m + "월 입니다.");
	}

	// 출력
	
	//정적멤버함수(객체를 만들지 않고도 정적멤버함수를 사용이가능)
	public static void staticPrint() {
		System.out.println("정적 안녕");
	}
	public static double staticSum(int a, double b) {
		return a + b;
	}
	public static void intArrayPrint(int[] array) {
		System.out.printf(" %s \n", Arrays.toString(array));
	}
	

}


















