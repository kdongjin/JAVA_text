package chapter06.page0;

import java.util.Scanner;

public class Test {
	static Scanner scan = new Scanner(System.in); 
	public static void main(String[] args) {
		// 3명의 학생의 정보를 입력받는다.(반복문, 배열관리)
		// 이름,국어, 영어, 수학
		// 3명의 학생정보와 3명의 각총점을 출력한다.
		String[] name = new String[3]; 
		int[] kor = new int[3], eng = new int[3], math = new int[3], total = new int[3]; 
		
		//3명의 정보를 입력받고 계산처리
		for (int i = 0; i < 3; i++) {
			System.out.printf("name%d>>",i);
			name[i] = scan.nextLine(); 
			
			System.out.printf("kor%d>>",i);
			kor[i] = Integer.parseInt(scan.nextLine()); 
			System.out.printf("eng%d>>",i);
			eng[i] = Integer.parseInt(scan.nextLine()); 
			System.out.printf("math%d>>",i);
			math[i] = Integer.parseInt(scan.nextLine()); 
			
			//총점을 구하는것을 함수로 이용해서 처리하겠다. 
			total[i] = totalCalculate(kor[i], eng[i], math[i]);
			//total[i] = kor[i] + eng[i] + math[i];
		}
		
		//total = totalCalculate(kor, eng, math);
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("name = %s %-5d %-5d %-5d %-5d \n",name[i], kor[i], eng[i], math[i], total[i]);
		}

		if (scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}
	
	
	//3과목을 점수를 총합에서 리턴하는 함수
	private static int totalCalculate(int kor, int eng, int math) {
		int sum = kor + eng + math;
		return sum;
	}

}















