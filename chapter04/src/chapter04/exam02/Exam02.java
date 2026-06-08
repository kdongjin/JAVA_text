package chapter04.exam02;

import java.util.Scanner;

public class Exam02 {
	  // static 전역변수다/
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // 4 무한반복문을 설정한다.
        while (true) {
            // 1.문제를 출력한다.
            System.out.println
            ("1번 :양수출력, 2번:양/음이프 , 3번:짝홀수 ,4번:사탕문제 ,5번:학생정보,6번:나이,7번:점수평균 ,8번:주민번호,9번:트루폴스,10번:연봉,11번:exit");
            System.out.print(">>");
            // 2.문제번호입력저장한다.
            int no = Integer.parseInt(scan.nextLine());
            // 3.문제번호에 따라서 실행하는 함수를 선택한다.(switch case)
            switch (no) {
            case 1:
                break;
            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
            	practice05(); 
                break;

            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
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

	private static void practice05() {
		//키보드로입력받은값들을변수에기록하고저장된변수값을화면에출력하여확인하세요.
		//이때, 성별이‘M’이면남학생, ‘M’이아니면여학생으로출력되도록처리하세요
		System.out.print("name>>");
		String name = scan.nextLine();
		
		System.out.print("grade>>");
		int grade = Integer.parseInt(scan.nextLine());
		
		System.out.print("ban>>");
		int ban = Integer.parseInt(scan.nextLine());
		
		System.out.print("no>>");
		int no = Integer.parseInt(scan.nextLine());
		
		System.out.print("gender(M/F)>>");
		//문자열에서 첫글자(인덱스: 0)
		char gender = scan.nextLine().toLowerCase().charAt(0);
		String strGender = (gender == 'm')?("남학생"):("여학생");
		
		System.out.print("score>>");
		double score = Double.parseDouble(scan.nextLine());
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %6.2f이다 \n",
				grade, ban, no, name, strGender, score);
	}
}




















