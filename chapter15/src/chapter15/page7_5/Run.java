package chapter15.page7_5;

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
		thread.setName("땡땡출력스레드");
		
		ToolkitThread2 tt2 = new ToolkitThread2();
		Thread thread2 = new Thread(tt2);
		thread2.setName("땡땡소리스레드");
		
		thread.start();
		thread2.start(); 
		
		//현재 작동되고 스레드 수
		System.out.printf("현재 작동되고 스레드 수 : %d \n",Thread.activeCount());
		//현재 작동되고 있는 스레드 이름
		System.out.printf("thread.start() 진짜이름: %s \n", thread.getName());
		System.out.printf("thread2.start() 진짜이름: %s \n", thread2.getName());
		System.out.printf("thread 우선순위는 : %d \n",thread.getPriority());
		System.out.printf("thread2 우선순위는 : %d \n",thread2.getPriority());
		
		
		System.out.println("The end");
	}

}










