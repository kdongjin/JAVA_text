package chapter12.page19;

public class ImageButton{
	//멤버변수
	private OnDoubliClickListener odc;
	
	//인터페이스 설계(이벤트처리방법)
	static interface OnDoubliClickListener{
		public abstract void onDoubleClick(); 
	}

	public void setOnDoubliClickListener(OnDoubliClickListener odc) {
		this.odc = odc;
	}
	
	public void DoubliClick() {
		this.odc.onDoubleClick();
	}
	

}
