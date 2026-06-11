package chapter13.page27;

public class MyException extends Exception{
	//멤변(인변,정변,상수,인클,정클,정인터 : 6개)
	private String message; 
	//생성자(디생,매생->오버로딩, this)
	public MyException() {
		this(null); 
	}
	public MyException(String message) {
		super(message);
		this.message = message;
	}
}
