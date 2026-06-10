package chapter13.page01;

import java.io.IOException;
import java.io.InputStreamReader;

public class Run2 {

	public static void main(String[] args) {
		//1. checked Exception (InterruptedException)
		try {
			Thread.sleep(100);
		} catch (Exception e) {
			e.printStackTrace();
		}

		//2. checked Exception (ClassNotFoundException)
		try {
			Class cls =  Class.forName("java.lang.Object");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		//3. checked Exception (IoException)
		InputStreamReader isr = new InputStreamReader(System.in); 
		try {
			isr.read();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}












