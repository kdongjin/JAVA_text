package chapter15.page48;

public class Run {

	public static void main(String[] args)  {
		// 사용자가 정의한 스레드를 두개를 만든다.
		// 모두 데몬스레드다.
		// 사용자가 스레드이름 부여한다.
		// 사용자가 한쪽스레드 yield 진행하고, 다른쪽 스레드 실행
		MyThread t1 = new MyThread();
		t1.setName("스레드1번");
		t1.setDaemon(true);
		t1.yieldFlag = false; 
		t1.start();

		MyThread t2 = new MyThread();
		t2.setName("스레드2번");
		t2.setDaemon(true);
		t2.yieldFlag = true; 
		t2.start();
		
		//메인스레드 6번동안 두개의 스래드를 1초씩 진행하고 양보하고 조절진행
		for (int i = 0; i < 6; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
			t1.yieldFlag = !t1.yieldFlag;
			t2.yieldFlag = !t2.yieldFlag;
		}
		
		System.out.println("main Thread end");
		
	}

}








