package chapter10.page29;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		//Bomb객체를 만들어서 진행
		Bomb b = new Car();
		b.bomb();
		//동시에 4명의 자식객체에 있는 bomb() 작동시키는방법
		//상속 => 오버라이딩 => 부모객체배열속에 자식객체등록
		Bomb[] bArray = new Bomb[] {new Car(), new Tree(), new Building(), new House()};
		for (int i = 0; i < bArray.length; i++) {
			bArray[i].bomb();
		}
		//멤버변수를 부모객체 = 자식객체  부모객체.m
		Bomb b2 = new House();
		System.out.printf("b1.m = %d \n", ((House)b2).m);
		b2.bomb();
		
		//정적멤버변수를 상속했을때 접근방법
		Bomb b3 = new Bomb();
		System.out.println(b3.sm);
		System.out.println(Bomb.sm);
		
		House h1 = new House();
		System.out.println("===========");
		System.out.println(h1.sm);
		System.out.println(House.sm);
		
		System.out.println("===========");
		Bomb b4 = new Bomb();
		b4.sbomb();
		Bomb.sbomb();
		System.out.println("===========");
		House h2 = new House();
		h2.sbomb();
		House.sbomb();
		System.out.println("===========");
		Bomb b5 = new House();
		b5.sbomb();
		((House)b5).sbomb();
	}

}














