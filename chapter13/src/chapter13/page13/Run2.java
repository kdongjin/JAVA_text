package chapter13.page13;

import java.io.IOException;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {
		
		try( InputStreamReader isr = new InputStreamReader(System.in); ){
			System.out.print(">>");
			char charValue = (char)isr.read();
			System.out.printf("키보드로부터받은문자: %c \n", charValue);
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		System.out.println("The end");
	}

}
