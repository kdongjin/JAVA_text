package chapter17.pafe131;

import java.util.Objects;

public class Data implements Comparable<Data>{
	private int number;

	public Data(int number) {
		super();
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data d = (Data)obj; 
			if(d.number == this.number) {
				return true; 
			}
		}
		return false;
	}

	@Override
	public int compareTo(Data o) {
		return this.number - o.number;
	}

	@Override
	public String toString() {
		return "" + number + "";
	}
	
	
	

}





















