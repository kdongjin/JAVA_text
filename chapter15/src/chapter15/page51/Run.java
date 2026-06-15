package chapter15.page51;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//내가 만든 두개스레드를 작동시킨다.
		//두개 스레드 상태값을 확인한다.
		MyThread1 mt1 = new MyThread1(); 
		mt1.start();
		
		MyThread2 mt2 = new MyThread2(mt1);
		mt2.start();
		
		Thread.sleep(100);
		System.out.printf("MyThread1 상태 %s \n",mt1.getState());
		System.out.printf("MyThread2 상태 %s \n",mt2.getState());
		
		//메인스레드 0.1초간 정지
		mt2.interrupt();
		Thread.sleep(100);
		
		System.out.printf("MyThread1 상태 %s \n",mt1.getState());
		System.out.printf("MyThread2 상태 %s \n",mt2.getState());
	}

}
