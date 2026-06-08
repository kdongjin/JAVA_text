package chapter09.practice06;

import java.util.Random;
import java.util.Scanner;

public class Run {
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		boolean exitFlag = false;
		while (!exitFlag) {
			System.out.println("1번:레시피, 2번:랜덤test, 3번:exit");
			System.out.printf("no>>");
			int no = Integer.parseInt(scan.nextLine());
			
			switch (no) {
			case 1:	
				recepiPractice(); 
				break;
			case 2:	
				//String str = randomString();
				//System.out.printf("랜덤으로 만든 문자열 = %s \n", str);
				break;
			case 3:	
				exitFlag = true;
				break;
			default:
				System.out.println("고객님 부탁해요!");
				break;
			}
		}
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}
	//recepi 프로그램
	public static void recepiPractice() {
		// recepi 객체생성
		System.out.printf("레시피주제입력>>");
		String recipeName = scan.nextLine();
		Recipe recipe = new Recipe(recipeName);
		
		// 재료제공
		for (int i = 0; i < 5; i++) {
			if(recipe.getIngredientCount() >= 5) {
				break; 
			}
			//재료를 입력하는 함수만든다. 
			recipe.addIngredient(randomString(3, 7));
		}
		//요리방법스탭 제공
		for (int i = 0; i < 5; i++) {
			if(recipe.getStepCount() >= 5) {
				break; 
			}
			//재료를 입력하는 함수만든다. 
			recipe.addStep(randomString(10, 20));
		}
		//요리내용을 출력
		System.out.printf("레시피출력 = %s \n", recipe.toString());
		
	}
	
	//한글글자를 갯수를 정해주면 랜덤으로 추출하는 함수
	public static String randomString(int start, int end) {
        String str = "";
        //한글유니코드: 44032 ~ 55203  ;
        //한글 (3 ~ 7) 범위안에서 뽑아낸다.
        int length = (int)(Math.random()*(end-start+1)+start); 
        for( int i = 0; i < length ; i++) {
        	//문자 -> unicode -> 한글(44032 ~ 55203)
           str += (char)((int)(Math.random()*(55203 - 44032 + 1) + 44032 ));
        }
		return str; 
	}

}


























