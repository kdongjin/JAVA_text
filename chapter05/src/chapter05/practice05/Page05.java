package chapter05.practice05;

public class Page05 {

	public static void main(String[] args) {
		//배열선언 정수형[], 실수형[], 문자형[], 부울형[], 문자열[]
		//주의 :자바는 반드시 배열갯수를 결정해야된다. (이유: 저장장소 ~~~
		//자바스크립트 let a = [10, 23.4,"abcd", false] , let a = new Array(4)
		//let a = new Array(10, 23.4,"abcd", false); 
		//let b = [ ];
		String[] strArrya = new String[4];
		double[] doubleArray = new double[4];
		char[] charArray = new char[4];
		boolean[] boolArray = new boolean[4]; 
		int[] intArray = new int[4];  //  let a = new Array(4)

		
		intArray[0] = 10; 
		intArray[1] = 20; 
		intArray[2] = 30; 
		intArray[3] = 40;
		
		//[10, 23.4,"abcd", false], new Array(10, 23.4,"abcd", false)
		int[] intArray2 = new int[] {19,20,30,40}; 
		
		System.out.printf("%3d \t",intArray2[0]);
		System.out.printf("%3d \t",intArray2[1]);
		System.out.printf("%3d \t",intArray2[2]);
		System.out.printf("%3d \t",intArray2[3]);
		
		System.out.println("\n==========================");
		for (int i = 0; i < intArray2.length; i++) {
			System.out.printf("%3d \t",intArray2[i]);
		}
	}

}
















