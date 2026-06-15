package chapter15.page59;

import java.util.Iterator;

public class Run {

	public static void main(String[] args) {
		//공유객체
		DataBox db = new DataBox(null);
		
		// 두개스레드객체를 만든다. (3번방식으로 진행)
		//첫번째스레드 빵을 한개씩을 만들어서 DataBox 집어넣는다.(10번진행)
		//두번째스레드 빵이 있으면 DataBox에서 가져온다.(10번진행)

		//빵을 만들어서 입력
		Thread th1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					db.setBreadState(i+"번째" );
				}
			};
		};
		
		Thread th2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					db.getBreadState(); 
				}
			};
		};
		
		th1.start();
		th2.start(); 
		
	}

}
