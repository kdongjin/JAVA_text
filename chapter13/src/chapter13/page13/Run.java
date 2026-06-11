package chapter13.page13;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		//finally 이용한 자원반납처리 예외처리
		// 1byte 입력한값을 -> 2byte char 변형을 값을 읽겠다. 
		Scanner scan = new Scanner(System.in);

		InputStreamReader isr = null;
		char[] buffer = new char[10]; 
		
		try {
			isr = new InputStreamReader(System.in); 
			System.out.print(">>");
			char charValue = (char)isr.read();
			System.out.printf("키보드로부터받은문자: %c \n", charValue);
		} catch (Exception e) {
			System.out.println("System.in 장치 문제발생");
		} finally {
			if(isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
		
		
		
		//System.in => 키보드
		//isr = new InputStreamReader(System.in);
		try {
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}







