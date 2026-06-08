package chapter04.practice;

import java.util.Scanner;

public class PracticeTest {
	// static 전역변수다/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // 4 무한반복문을 설정한다.
        for (;true;) {
            System.out.println
            ("1번 :p9_switch, 2번:p15_for , 3번: 구구단 ,4번:break lable ,5번:학생정보,6번:나이,7번:점수평균 ,8번:주민번호,9번:트루폴스,10번:연봉,11번:exit");
            System.out.print(">>");
            int no = Integer.parseInt(scan.nextLine());
            switch (no) {
            case 1:
            	page9_practice(); 
                break;
            case 2:
        		for (int i = 0 ; i < 10 ; i += 2) {
        			System.out.printf("i = %-3d \n", i);
        		}
            	//page15_practice(); 
                break;
            case 3:
            	gugudan_practice(); 
                break;
            case 4:
            	forBreakPractice(); 
                break;
            default:
                System.out.println("정신차려~ 너 때문에 프로그램 종료되었다.");
                break;
            }
            // 5.무한방복문 종료조건을 준다.1~3
            if (no < 1 || no >11) {
                break;
            }
        }
        // 6)자원반납
        if (scan != null) {
            scan.close();
        }
        System.out.println("The end");
    }

	

	//ppt자료 9번
	private static void page9_practice() {
		//switch case 문을 작성한다. 
		//입력번호 7~10 pass출력한다. 그이외 fail출력
		System.out.print("no>>");
		 
		int no = Integer.parseInt(scan.nextLine());
		switch (no) {
		case 10:		case 9:		case 8:		case 7:
			System.out.println("pass");
			break;
		default:
			System.out.println("Fail");
			break;
		}
		
	}
	
	//ppt자료 15
	private static void page15_practice() {
		//반복문처리 10, 9 , ..., 1
		for (int i = 0 ; i < 10 ; i += 2) {
			System.out.printf("i = %-3d \n", i);
		}
		System.out.println("===========");
		//for문 while문
		int i = 0;
		while (i < 10) {
			System.out.printf("i = %-3d \n", i);
			i += 2;
		}
	}

	//구구단 프로그램
    private static void gugudan_practice() {
		// 1단 ~ 9단 출력
    	// 1단출력
    	// 1 * 1 = 1, 1 * 2 = 2, 1 * 3 = 3, ... 1 * 9 = 9 
	}
    //중첩반복문을 한번에 break문으로 빠져나가기
    private static void forBreakPractice() {
		// 구구단 프로그램작성
    	OUT: for (int i = 0; i < 9; i++) {
			System.out.printf(" **** %d단 ****\n",i+1);
			for (int j = 0; j < 9; j++) {
				System.out.printf(" %d * %d = %d \n", i+1, j+1, (i+1) * (j+1));
				if((j+1) == 8) {
					break OUT; 
				}
			}//end of inner for
		}//end of outter for
    	System.out.println("반복문이 끝났어요.");
	}
	
}













