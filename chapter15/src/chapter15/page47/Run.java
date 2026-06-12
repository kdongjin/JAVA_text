package chapter15.page47;

public class Run {

	public static void main(String[] args) {
		
		Thread mainThread = Thread.currentThread();
		System.out.printf("main Thread State : %s \n", mainThread.getState());
		
		// 사용자가 정의한 스레드를 생성한다.(람다식진행)
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				//1부터 100억까지 카운트하는 반복문을 진행한다. 
				for (long i = 0; i < 100_000_000_000L; i++) {
				}
			}
		});
		
		//1. new 상태도를 점검
		System.out.printf("Thread State : %s \n", thread.getState());
		
		//2.스레드.start() 상태도를 점검
		thread.start();
		System.out.printf("Thread State : %s \n", thread.getState());
		
		//3.스레드 종료상태일때. (메인스레드에게  thread가 종료될때 까지 기다려요청한다.
		try {
			thread.join();
		} catch (InterruptedException e) {}
		System.out.printf("Thread State : %s \n", thread.getState());
		
		System.out.println("main thread end");
		System.out.printf("마지막 main Thread State : %s \n", mainThread.getState());
	}

}










