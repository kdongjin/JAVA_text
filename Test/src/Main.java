
public class Main {

	public static void main(String[] args) {
		// 5단 출력
		// 5 * 1 = 5
		// 5 * 2 = 10
		// 5 * 9 = 45
		// 1단, 2단, 3단
		for (int i = 1; i < 10; i++) {
			System.out.printf("%d 단 \n", i);

			for (int j = 1; j < 10; j++) {
				System.out.printf(" %d * %d = %d \n", i, j, i*(j));
			}
		}
		
		

	}

}
