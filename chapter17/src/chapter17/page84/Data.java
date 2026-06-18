package chapter17.page84;

import java.util.Objects;

public class Data implements Comparable<Data>{
	private int age;

	public Data(int age) {
		super();
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	} 
	
	@Override
	public int hashCode() {
		return Objects.hash(age);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Data) {
			Data d = (Data)obj; 
			return (d.age == this.age)? true : false; 
		}
		return false; 
	}

	@Override
	public int compareTo(Data o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return ""+age+"";
	}
	
	
}














