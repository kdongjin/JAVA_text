package chapter05.practice05;

import java.util.Arrays;

public class Page12Test {

	public static void main(String[] args) {
		// 정수형변수와 정수형배열명 선언해놓고, 초기값을 주지 않을때에는 문제발생
		int a = 0;
		System.out.println(a);
		
		int[] ia = null; 
		System.out.println(ia);
		
		// 정수형배열을 만들고, 다른 정수형배열변수 저장한다.
		// 그리고 다른 정수형배열에서 첫번째요소를 수정을 하면 원래배열은 첫번째 요소는 어떤것일까?
		int[] aArray = {3, 4, 5};
		int[] bArray = null; 
		bArray = aArray; 
		bArray[0] = 10; //aArray[0]
		System.out.printf("bArray[0] = %d \n", bArray[0]);
		System.out.printf("aArray[0] = %d \n", aArray[0]);
		System.out.println("aArray 배열요소 길이는 "+ aArray.length);
		
		//배열을 출력하는데 사용하는방법은 반복문
		//반복문: 일반포문출력, 향상품된포문
		String[] cArray = {"3입니다", "4입니다", "5입니다"};
		for (int i = 0; i < cArray.length; i++) {
			System.out.printf(" cArray[%d] =  %s \n",i, cArray[i]);
		}
		int count = 0; 
		for (String i : cArray) {
			System.out.printf("cArray[%d] = %s \n",count++, i);
		}
		
		//Arrays 배열에 관려된 편익성 라이브러리가 모두 있다.
		int[] dArray = {3, 4, 5};
		String strArray = Arrays.toString(dArray) + "문자열";
		System.out.println(strArray);
		
		
		
		
		
		
		
	}

}
