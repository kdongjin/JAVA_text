package chapter15.page51;

public class MyThread1 extends Thread{
	
	@Override
	public void run() {
		//가장긴값으로 시간지연을 하면서 업무를 진행한다.
		for (long i = 0; i < Long.MAX_VALUE; i++) {}
	}
}
