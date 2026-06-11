package chapter13.page10;

import java.io.FileNotFoundException;

public class Run {
	public static void main(String[] args) {
		//다중예외처리하기 
		try {
			int num = Integer.parseInt("10!"); 
			System.out.println(3/0);
		} catch (NullPointerException e) {
			System.out.println("NumberFormatException");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArithmeticException");
		} catch (Exception e) {
			System.out.println("Exception");
			e.printStackTrace();
		}finally {
			System.out.println("finally");
		}
		
	}
}
