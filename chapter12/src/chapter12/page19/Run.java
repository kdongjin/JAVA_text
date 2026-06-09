package chapter12.page19;

public class Run {

	public static void main(String[] args) {
		//내부에 있는 인터페이스를 사용해보자
		//B b = new 자식(); 
		//B b2 = new B() {}; 
		A.B b = new A.B() {
			@Override
			public void bcd() {
				System.out.println("다형성구현");
			}
		};
		
		b.bcd();
		//=======================================
		C c = new C();
		//부 = 자식객체 
		A.B b2 = c;
		b2.bcd();
		
		//이미지버튼을 이벤트핸들러등록 처리까지 진행
		ImageButton ib = new ImageButton();
		ib.setOnDoubliClickListener(new ImageButton.OnDoubliClickListener() {
			
			@Override
			public void onDoubleClick() {
				System.out.println("고객님 요청한신 이미지 처리완료하였습니다.");
				
			}
		});
		
		ib.DoubliClick();
	}
}









