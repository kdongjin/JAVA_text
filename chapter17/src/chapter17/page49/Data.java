package chapter17.page49;

import java.util.Objects;

public class Data implements Comparable<Data>{
	private int no; 
	private String name;
	
	public Data(int no, String name) {
		super();
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "[" + no + ", " + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data data = (Data)obj;
			if(this.no == data.no && this.name.equals(data.name)) {
				return true; 
			}
		}
		return false; 
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}

	//값 - 값  , 문자열(compareTo)
	@Override
	public int compareTo(Data o) {
		int result = this.no - o.no; 
		if(result == 0) {
			result = this.name.compareTo(o.name);
		}
		
		return result;
	}
}








