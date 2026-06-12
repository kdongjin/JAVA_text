package chapter15.page24;

public class MyThread extends Thread{

	@Override
	public void run() {
		//5초간일을진행(계산하는)하는 스레드
		for (long i = 0L; i < 100_000_000_000_000_000L; i++) {
			
		}
		System.out.printf(" %s스레드가 우선순위: %d 일을마침 \n",
				this.getName(), this.getPriority());
	}

}
