package chapter15.page7_2;

import java.awt.Toolkit;

public class Run {

	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지일을 동시에 진행할려고한다.
		// 사운드기능을 작동(1초마다 사운드를 발생한다. 5번발생시킨다)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스. 
		PrintNumber2 pn2 = new PrintNumber2();
		Thread thread = new Thread(pn2);
		
		ToolkitThread2 tt2 = new ToolkitThread2();
		Thread thread2 = new Thread(tt2);

		thread.start();
		thread2.start(); 
		
		System.out.println("The end");
	}

}
