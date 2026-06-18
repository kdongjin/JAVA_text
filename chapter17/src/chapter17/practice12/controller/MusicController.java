package chapter17.practice12.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import chapter17.practice12.model.Music;

public class MusicController {
	//멤버변수 Book[] bArr, COUNT, 
	private List<Music> mList; 
	private List<Music> cmList; 
	//생성자
	public MusicController() {
		mList = new ArrayList<Music>();
		cmList = new ArrayList<Music>();
	}
	//추가 add(객체)
	public int addList(Music music) {
		try {
			mList.add(music);
			return 1;  
		} catch (Exception e) {
			return 0;  
		}
	}
	//추가 add(0,객체) 
	public int addAtZero(Music music) {
		try {
			mList.add(0,music);
			return 1;  
		} catch (Exception e) {
			return 0;  
		}
	}
	//모두출력
	public List<Music> printAll(){
		return mList; 
	}
	//정렬자료를 보관함.
	public List<Music> sortPrintAll(){
		return cmList; 
	}
	//검색 
	public Music searchMusic(String title) {
		for (Music music : mList) {
			if(music.getTitle().equals(title)) {
				return music; 
			}
		}
		return null; 
	}
	//삭제
	public Music removeMusic(String title) {
		for (Music music : mList) {
			if(music.getTitle().equals(title)) {
				mList.remove(music);
				return music; 
			}
		}
		
		return null; 
	}
	//수정
	public Music setMusic(String title, Music music) {
		for (int i = 0; i < mList.size(); i++) {
			Music m = mList.get(i);
			if(m.getTitle().equals(title)) {
				mList.set(i, music);
				return mList.get(i); 
			}
		}
		
		return null;
	}
	//정렬 노래타이틀로 오름차순
	//TreeSet, TreeMap, (ArrayList, Vector, LinkedList)
	public int ascTitle() {
		cmList.clear();
		for (Music music : mList) {
			if(music != null) {
				cmList.add(new Music(music)); 
			}
		}
		
		try {
			//TreeSet, TreeMap 사용하지 않고, 일반 컬렉션 프레임워크 정렬이가능하다.
			Collections.sort(cmList, new AscTitle());
			return 1;
		} catch (Exception e) {
			return 0; 
		}
		
	}
	//정렬: 내림차순 가수이름 정렬
	public int descSinger() {
		cmList.clear();
		for (Music music : mList) {
			if(music != null) {
				cmList.add(new Music(music)); 
			}
		}
		
		try {
			Collections.sort(cmList);
			return 1; 
		} catch (Exception e) {
			return 0; 
		}
	}
}

























