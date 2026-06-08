package chapter05.practice;

import java.util.Arrays;

public class Exam05Test {

	public static void main(String[] args) {
		// 랜덤값을 구하는 공식(1 ~ 10까지)
		//int num = (int)(Math.random()*(큰값 - 작은값 +1) + 작은값);

		//{5, 7, 3, 10, 6} max값을 출력한다.
		int[] array = {5, 7, 3, 10, 6};
		
		//최대값을 구할때에는 max 가장작은값을 준다.
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.printf(" %s의 최대값은 %d \n ", Arrays.toString(array), max );
		
		//최소값을 구할때에는 min 가장큰값을 준다.
		int min = Integer.MAX_VALUE; 
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.printf(" %s의 최소값은 %d", Arrays.toString(array), min );
	}

}



