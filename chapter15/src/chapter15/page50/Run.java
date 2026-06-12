package chapter15.page50;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		// 내가만든 스레드를 작동시킨다.
		MyThread mt = new MyThread();
		Thread th = new Thread(mt);
		th.start();
		
		//메인스레드 0.1초동안 일시정지, 내가만든스레드를 점검해본다.
		Thread.sleep(100);
		System.out.printf("MyThread 상태: %s \n",th.getState());
		
		// 내가만든 스레드를 메인스드레드에서 인터럽트 걸어준다.
		th.interrupt();
		Thread.sleep(10);
		
		// 내가만든 스레드 상태도를 점검한다. 
		System.out.printf("MyThread 상태: %s \n",th.getState());

	}

}
