package chapter15.page7_3;

import java.awt.Toolkit;

public class Run {

	// main 스레드
	public static void main(String[] args) throws InterruptedException {
		// 두가지일을 동시에 진행할려고한다.
		// 사운드기능을 작동(1초마다 사운드를 발생한다. 5번발생시킨다)
		// 숫자를 출력한다. (1초마다 숫자를 1부터 5까지 출력한다.)
		// 사운드 클래스.
		// 임시객체로 만들어서 바로실행하고 바로 제거한다.

		// PrintNumber2 pn2 = new PrintNumber2();
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("띵");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		});

		// ToolkitThread2 tt2 = new ToolkitThread2();
		Thread thread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit tk = Toolkit.getDefaultToolkit();

				for (int i = 0; i < 5; i++) {
					tk.beep();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}

			}
		});

		thread.start();
		thread2.start();

		System.out.println("The end");
	}

}
