package chapter13.page27;

public class MyRTException  extends RuntimeException{
	private String message; 
	
	public MyRTException() {
		this(null);
	}

	public MyRTException(String message) {
		super(message);
		this.message = message;
	}


}
