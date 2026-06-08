package chapter06.page10;

public class CarTest {
	static String[] colorArray = { "노란색", "빨간색", "검정색" };
	static String[] nameArray = { "소렌토", "제니시스", "그랜저" };

	public static void main(String[] args) {
		// 차 3대정보를 입력한다.
		Car[] carArray = new Car[3];
		for (int i = 0; i < carArray.length; i++) {
			carArray[i] = new Car(colorArray[i], 10000 * (i + 1), 2026, nameArray[i]);
		}

		// 등록된 객체에 멤버변수값을 수정(비추: 캡슐화정책)
		// carArray[0].color ="파란색";
		carArray[0].setColor("회색");

		// 차 3대운영
		carArray[0].drive();
		carArray[1].drive();
		carArray[2].drive();

		// 차 정보출력
		// carArray[0].carPrint();
		// carArray[1].carPrint();
		// carArray[2].carPrint();
		System.out.printf("%s \n", carArray[0].toString());
		System.out.printf("%s \n", carArray[1]);
		System.out.printf("%s \n", carArray[2]);

		// 첫번째차의 색상을 출력하고 싶다.
		System.out.printf("첫번째 차색상은 %s \n", carArray[0].getColor());

	}

}
