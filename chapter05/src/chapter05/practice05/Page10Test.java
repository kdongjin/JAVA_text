package chapter05.practice05;

public class Page10Test {

	public static void main(String[] args) {
		// 배열선언방식 1
		int[] intArray = new int[4];
		intArray[0] = 10;
		intArray[1] = 20;
		intArray[2] = 30;
		intArray[3] = 40;

		// 반복문을 출력하시오.s
		arrayPrint(intArray);

		System.out.println("\n=================");
		// 베열선언방식2
		int[] intArray2 = new int[] { 11, 21, 31, 41 };

		// 반복문을 출력하시오.
		arrayPrint(intArray2);

	}
	
	public static void arrayPrint(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
		}
		return;
	}

}







