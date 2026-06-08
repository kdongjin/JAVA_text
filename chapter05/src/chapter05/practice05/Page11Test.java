package chapter05.practice05;

public class Page11Test {

	public static void main(String[] args) {
		// 배열선언을 할때 되는방법과 안되는 방법을 찾아보자
		// 정수형배열 1
		int[] ia = new int[3];
		ia[0] = 10;
		ia[1] = 20;
		ia[2] = 30;
		
		// 정수형배열 2
		int[] ia2 = new int[] {10,20,30};
		int[] ia22 = null; 
		ia22 = new int[]{10,20,30}; 
		
		// 정수형배열 3 (주의)
		int[] ia3 = {10,20,30};
		int[] ia4 = null; 
		//ia4 = {10,20,30};
		
	}

}
