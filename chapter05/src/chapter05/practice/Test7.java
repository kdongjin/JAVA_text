package chapter05.practice;

public class Test7 {

	public static void main(String[] args) {
		// 로또번호출력
		//1. lotto 배열선언
		int[] lotto = new int[7];
		//2. lotto 랜덤값으로 1 ~ 45 추출해서 저장한다.
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*(45 - 1 + 1) + 1);
			//1)flag값을 설정을 한다.
			//2)반복문을 돌려서 중복체크해서 문제가 없으면 그대로 진행한다.,
			//3)반복문을 중복이되면 flag값을 true저장하고 반복문을 빠져나간다.
			//4)조건문을 걸어서 flag 확인해서 true이면 (i--) 다시진행(continue)
			//5)조거문을 확인해서 flag가 false이면 lotto[i] = num진행한다. 
			lotto[i] = num; 
		}
		//3. lotto 번호출력
		for (int i = 0; i < lotto.length - 1; i++) {
			System.out.printf("%-3d", lotto[i]);
		}
		System.out.printf("보너스번호: %-3d", lotto[lotto.length - 1]);

	}

}
