package chapter10.page29;

public class Car extends Bomb {
	//오버라이딩
	@Override
	public void bomb() {
		System.out.println("자식 car : 자동차가 터집니다.");
	}
}
