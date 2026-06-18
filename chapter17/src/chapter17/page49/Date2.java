package chapter17.page49;

import java.util.Objects;

public class Date2 implements Comparable<Date2>{
	private int age;

	public Date2(int age) {
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
		if(obj instanceof Date2) {
			Date2 d = (Date2)obj; 
			return (d.age == this.age)? true : false; 
		}
		return false; 
	}

	@Override
	public int compareTo(Date2 o) {
		return this.age - o.age;
	}

	@Override
	public String toString() {
		return ""+age+"";
	}
	
	
}














