package chapter15.page24;

public class Run {

	public static void main(String[] args) {
		Thread[] tArr = new Thread[10];
		
		// MyThread 스레드를 10개 스레드로 만들고 일을시키기겟다.
		for (int i = 0; i < 10; i++) {
			
			tArr[i] = new MyThread();
			tArr[i].setName("스레드"+i);
			if(i == 9) {
				tArr[i].setPriority(Thread.MAX_PRIORITY);
			}else {
				tArr[i].setPriority(Thread.NORM_PRIORITY);
			}
			
			tArr[i].start();
		}
		
		System.out.println("main thread stop");
	}

}
