package chapter10.page29;

public class House extends Bomb {
	//멤버
	int m = 4; 
	public static int sm = 4; 
	
	@Override
	public void bomb() {
		System.out.println("자식 house : 집이 무너집니다.");
	}
	
	public static void sbomb() {
		System.out.println("자식 House : 정적멤버함수입니다.");
	}
}
