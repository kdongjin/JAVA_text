package chapter15.page51;

//멤버변수 MyThread1 가지고 있다. (MyThread2는 MyThread1 협업을 진행함을 나타남)
public class MyThread2 extends Thread{
	public MyThread1 mt1; 
	public MyThread2(MyThread1 mt1) {
		this.mt1 = mt1;
	}
	@Override
	public void run() {
		//mt1 요청하면 Mythread2야 내가 3초동안 일을하겠다. 대신 일시정지 대기하라.
		try {
			mt1.join(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//mt1의 자료를 받고 MyThread2 자신의 일을 진행한다. 
		for (long i = 0; i < Long.MAX_VALUE; i++) {}
	}
}
