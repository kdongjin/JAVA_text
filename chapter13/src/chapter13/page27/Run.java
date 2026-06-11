package chapter13.page27;

public class Run {

	public static void main(String[] args) {
		//우리가 만든 MyException 사용해서 예외처리를 진행하는 프로그램
		//1. 사용자로 부터 정수값을 입력받는다.
		//2. 사용자가 입력한값이 0 ~ 100 정상동작 출력하고, 
		// 그렇지 않으면 내가 만든 예외처리를 진행한다.
		int no = 110; 
		
		try {
			if(no < 0 || no > 100) {
				throw new MyException("0부터 100사이값만 값을 받습니다. ");
			}else {
				System.out.println("정상동작");
			}
		} catch (MyException e) {
			e.printStackTrace();
		}
		System.out.println("The end");
	}

}
