package chapter17.practice12.model;

import java.util.Objects;

public class Music implements Comparable<Music>{
	//멤버변수
	private String title;
	private String singer;
	//생성자
	public Music() {
		this(null, null);
	}
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	public Music(Music m) {
		super();
		this.title = m.title;
		this.singer = m.singer;
	}
	//겟터,셋터
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	} 
	//오버라이딩
	@Override
	public int hashCode() {
		return Objects.hash(title, singer);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Music) {
			Music m = (Music)obj; 
			if(title.equals(m.title) && singer.equals(m.singer)) {
				return true;
			}
		}
		return false;
	}
	
	//singer 오름차순(this.singer.compareTo(o.singer))
	//singer 내림차순(o.singer.compareTo(this.singer))
	@Override
	public int compareTo(Music o) {
		return o.singer.compareTo(this.singer);
	}
	
	@Override
	public String toString() {
		return "[" + title + ", " + singer + "]";
	}
	
	

}















