package chapter11.page09;

public class Run {

	public static void main(String[] args) {
		//1.다형성구현 부모객체배열 => 자식객체번지저장
		//2.반복문사용해서 다형성을구현
		Animal[] aArray = new Animal[] {new Cat(), new Dog()};
		
		for (int i = 0; i < aArray.length; i++) {
			aArray[i].cry();
		}
		
		Animal animal = new Animal() {
			
			@Override
			public void cry() {
				System.out.println("제비는 지지베베");
				
			}
		};
		
		animal.cry();
	}
}
