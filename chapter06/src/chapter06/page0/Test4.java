package chapter06.page0;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle[] rtArray = new Rectangle[3]; 
		
		//반복문을 이용해서 각각의 객체를 선언하고 ,초기값설정한다.
		for (int i = 0; i < rtArray.length; i++) {
			rtArray[i] = new Rectangle(10*(i+1), 20*(i+1));
		}
		
		//반복문을 이용해서 각각의 객체 면적을 구해서 저장한다.
		for (int i = 0; i < rtArray.length; i++) {
			rtArray[i].getArea();
		}
		
		//반목문을 이용해서 객체 면적을 출력한다.
		for (int i = 0; i < rtArray.length; i++) {
			rtArray[i].rectanglePrint();
		}

	}

}
