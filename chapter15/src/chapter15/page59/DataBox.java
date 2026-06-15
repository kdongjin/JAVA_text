package chapter15.page59;

//공유클래스
public class DataBox {
	//멤변(인변,정변,상수,내이클,내정클,내인스)
	private String breadState;
	//생성(디생,매생,디통,부모)
	public DataBox(String breadState) {
		super();
		this.breadState = null;
	}
	//멤함(겟,셋,기능,오버라이딩(hashCode, equals, toString))
	public synchronized void getBreadState() {
		if(this.breadState == null) {
			try {
				wait();
			} catch (InterruptedException e) {} 
		}
		System.out.printf("%s빵을 바구니에서 가져갑니다. \n",this.breadState);
		this.breadState = null; 
		notify(); 
	}
	public synchronized void setBreadState(String breadState)  {
		//breadState 빵이 존재하면 wait()상태로 빠진다.
		//다른스레드가 빵을가져가고, wait()상태를 깨워줘야한다.(notify)
		if(this.breadState != null ) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}
		//빵을 바구니에 놓았다
		this.breadState = breadState;
		System.out.printf("%s빵이 바구니에 있습니다 \n", this.breadState);
		//다른스레드보고 빵이 있으니 가져가라. 다른 스레드 wait()를 깨워줘야한다.  
		notify();
	}
	
	
}
