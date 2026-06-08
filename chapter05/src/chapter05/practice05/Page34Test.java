package chapter05.practice05;

import java.util.Arrays;

public class Page34Test {

	public static void main(String[] args) {
		// 1차원배열을 => 문자열을 변경  배열가지고 => 문자열 Arrays사용한다.
		int[] a1 = new int[] {10,20,30};
		int[] a2 = a1; 
		
		a2[0] = 60;
		a2[1] = 70;
		a2[2] = 80;
		// 배열을 문자열로 변경한다. 배열의 주소값을 문자열로 리턴해서 보여준다.
		String strA1 = a1.toString();
		System.out.printf("strA1 = %s \n", strA1);
		
		String str2A1 = Arrays.toString(a1);
		System.out.printf("str2A1 = %s \n", str2A1);

		String str2A2 = Arrays.toString(a2);
		System.out.printf("str2A2 = %s \n", str2A2);
	}

}
