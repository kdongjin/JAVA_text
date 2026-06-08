package chapter05.practice05;

public class Page18Test {

	public static void main(String[] args) {
		// 2차원 배열처리하는 방법
		//int[][] a = new int[2][3];
		//1) int[] a = new int[2] 
		//2) a[0] = new int[3], a[1] = new int[3]
		int[][] a = new int[2][3];
		System.out.printf("a.length = %d \n", a.length);
		System.out.printf("a[0].length = %d \n", a[0].length);
		System.out.printf("a[1].length = %d \n", a[1].length);
		System.out.printf("a[0][0] = %d \n", a[0][0]);
		
		//자바코드로 이차원배열을 표현하는방법 1번
		/*
		 * int[][] b = new int[2][]; b[0] = new int[] {1, 2, 3}; b[1] = new int[]
		 * {1,2,3,4};
		 */		
		
		//자바코드로 이차원배열을 표현하는방법 2번
		//int[][] b = new int[][] {{1,2,3},{1,2,3,4,5}};
		
		//자바코드로 이차원배열을 표현하는방법 3번
		int[][] b = {{1,2,3},{1,2,3,4,5}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.printf("b[%d][%d] =  %d \n",i,j,b[i][j] );
			}
		}
		
	}

}





