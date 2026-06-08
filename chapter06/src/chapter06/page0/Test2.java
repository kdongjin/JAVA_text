package chapter06.page0;

import java.util.Scanner;

public class Test2 {
	   static Scanner scan = new Scanner(System.in);
	    public static void main(String[] args) {
	        //직사각형 면적을 구하는 프로그램이다.
	        //사용자로부터 폭과 높이 입력받고 면적을 구해서 출력하는  프로그램을 구현한다.

	        System.out.println("폭을 입력하시오");
	        int width = Integer.parseInt(scan.nextLine());
	        System.out.println("높이을 입력하시오");
	        int height = Integer.parseInt(scan.nextLine());
	        int sum = width*height;

	        System.out.printf("폭:%-3d 높이:%-3d 면적:%-3d ",width,height,sum);

	        if(scan != null) {
	            scan.close();
	        }

	    }

	}