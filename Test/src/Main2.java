
public class Main2 {

	public static void main(String[] args) {
		// 배열선언하는방법 정수형배열 5개
		int[] intArray = new int[5];
		int[] intArray3 = {10,20,30,40,50};
		intArray[0] = 10;
		
		//배열, 반복문을 활용하는방법 (검색하라, 수정하라, 입력하라, 계산하라)
//		for (int i = 0; i < intArray2.length; i++) {
//			sum = sum + intArray2[i]; 
//		}
		
		int[] intArray2 = new int[] {13,201,330,140,57};
		int sum = 0;
		for (int i : intArray2) {
			sum = sum * i; 
		}
		
		

	}

}
