package chapter07.page10;

import java.util.Arrays;

public class ATest {

	public static void main(String[] args) {
		//A 객체를 생성한다.
		A a = new A();
		
		//a객체에 멤버함수 print()
		a.print();

		//a객체에 멤버함수 int data()
		int num = a.data();
		System.out.printf("num = %d \n",num);
		
		//a객체에 멤버함수 double sum(int, double)
		double value = a.sum(10, 20.45); 
		System.out.printf("value = %-10.2f \n",value);
		
		//a객체에 멤버함수 void printMonth(int)
		a.printMonth(20);
		a.printMonth(11);

		//정적멤버함수를(클래스명.정적멤버함수)
		a.staticPrint();
		A.staticPrint();
		
		double value2 = A.staticSum(20, 20.45);
		System.out.printf("value2 = %-10.2f \n",value2);
		
		//======================================
		int[] array ; 
		array = new int[3];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		//System.out.printf(" %s \n", Arrays.toString(array));
		A.intArrayPrint(new int[3]);
		
		int[] array2 ; 
		array2 = new int[] {11,21,31};
		A.intArrayPrint(new int[] {11,21,31});
		//System.out.printf(" %s \n", Arrays.toString(array2));
		
		int[] array3 = {12, 22, 32};
		//array3  = {12, 22, 32};
		A.intArrayPrint(array3);
		//System.out.printf(" %s \n", Arrays.toString(array3));
	}

}






























