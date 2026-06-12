package chapter15.page48;

public class MyThread  extends Thread{
	public boolean exitFlag = false;
	public boolean yieldFlag = false; 
	
	@Override
	public void run() {
		//무한루프를 돌면서 조건에 따라, yield상태일때와 Runnable상태일때 테스팅
		int number = 0; 
		while (true) {
			//조건에따라 yeild상태 실행상태를 진행한다.
			
			if(yieldFlag) {
				Thread.yield();
				number = 0; 
			}else {
				if(number <=2 ) {
					System.out.printf("%s 스레드가 실행중임 \n",this.getName());
					for (long i = 0; i < 1_000_000_000L; i++) {}
					number++; 
				}
			}
		}
	}//end of run
}
