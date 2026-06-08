package chapter06.page0;

import java.util.Scanner;

public class Test3 {
	static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // 배열과 반복문을 이용할것
        // 직사각형 면적을 구하는 프로그램이다.
        // 사용자로 부터 폭과 높이를 입력받고 면적을 구해서 출력하는 프로그램을 구현한다.
        int[] width = new int[3], length = new int[3], area = new int[3];

        for (int i = 0; i < area.length; i++) {
            System.out.println("폭 : ");
            width[i] = Integer.parseInt(scan.nextLine());
            System.out.println("높이 : ");
            length[i] = Integer.parseInt(scan.nextLine());

            area[i] = width[i] * length[i];

            System.out.printf("면적: %d \n", area[i]);
        }

        if (scan != null) {
            scan.close();
        }
    }

}