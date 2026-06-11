package chapter15.page7;

import java.awt.Toolkit;

public class Run {

	//main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지일을 동시에 진행할려고한다.
		// 사운드기능을 작동(1초마다 사운드를 발생한다. 5번발생시킨다)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스. 
		ToolkitThread tkt = new ToolkitThread();
		//tkt.setDaemon(true);
		//tkt.start();
		//부모가 Thread  PrintNumber 스레드동작
		PrintNumber pn = new PrintNumber();
		pn.start();
		//메인스레드
		Thread.sleep(2000);
		
		
		
		System.out.println("The end");
	}

}
