package chapter17.practice12.view;

import java.util.List;
import java.util.Scanner;

import chapter17.practice12.controller.MusicController;
import chapter17.practice12.model.Music;

public class MusicView {
	private Scanner sc; 
	private MusicController mc; 
	
	public MusicView() {
		sc = new Scanner(System.in);
		mc = new MusicController();
	}
	
	public void mainMenu() {
		boolean exitFlag = false; 
		while (!exitFlag) {
			System.out.print("** 메인 메뉴 **\n"
					+ "1. 마지막 위치에 곡 추가\n" 
					+ "2. 첫 위치에 곡 추가\n"
					+ "3. 전체 곡 목록 출력\n"
					+ "4. 특정 곡 검색\n"
					+ "5. 특정 곡 삭제\n"
					+ "6. 특정 곡 정보 수정\n"
					+ "7. 곡명 오름차순 정렬 \n"
					+ "8. 가수명 내림차순 정렬 \n" 
					+ "9. 종료\n"
					+ "메뉴 번호 선택 : >> ");
			int no = Integer.parseInt(sc.nextLine()); 
			switch (no) {
				case 1:	addList(); break;
				case 2:	addAtZero(); break;
				case 3:	printAll(); break;
				case 4:	searchMusic(); break;
				case 5:	removeMusic(); break;
				case 6:	setMusic(); break;
				case 7:	ascTitle(); break;
				case 8:	descSinger(); break;
				case 9:	exitFlag = true;  break;
			default:
				break;
			}
			
		}
	}



	//1. 마지막 위치에 곡 추가
	private void addList() {
		//public int addList(Music music)
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addList(music);
		if(result == 1) {
			System.out.printf("%s 등록이 잘되었습니다. \n",music );
		}else {
			System.out.printf("%s 등록이 실패했습니다 \n",music );
		}
	}
	
	//2. 첫 위치에 곡 추가
	private void addAtZero() {
		//int addAtZero(Music music)
		System.out.print("add title >>");
		String title = sc.nextLine();
		System.out.print("add singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		int result = mc.addAtZero(music);
		if(result == 1) {
			System.out.printf("%s 처음위치에 등록이 잘되었습니다. \n",music );
		}else {
			System.out.printf("%s 처음위치에 등록이 실패했습니다 \n",music );
		}
	}

	//3. 전체 곡 목록 출력
	private void printAll() {
		List<Music> mList = mc.printAll(); 
		if(mList != null) {
			System.out.println(mList);
		}else {
			System.out.println("Music List 보여줄내용이 없습니다.");
		}
	}

	//4. 특정 곡 검색
	private void searchMusic() {
		System.out.print("search title >>");
		String title = sc.nextLine();
		Music music = mc.searchMusic(title);
		if(music != null) {
			System.out.println("검색되어진 뮤직: "+music);
		}else {
			System.out.println(title + " Music이 검색되지 않습니다.");
		}
	}

	//5. 특정 곡 삭제
	private void removeMusic() {
		System.out.print("삭제될 title >>");
		String title = sc.nextLine();
		Music music = mc.removeMusic(title);
		if(music != null) {
			System.out.println("삭제가 완료된 뮤직: "+music);
		}else {
			System.out.println(title + " Music이 검색되지 않습니다.");
		}
	}

	
	//6. 특정 곡 정보 수정
	private void setMusic() {
		System.out.print("old title >>");
		String oldTitle = sc.nextLine();
		
		System.out.print("new title >>");
		String title = sc.nextLine();
		System.out.print("new singer >>");
		String singer = sc.nextLine();
		Music music = new Music(title, singer);
		
		Music newMusic = mc.setMusic(oldTitle, music); 
		if(newMusic != null) {
			System.out.println("수정된 뮤직: "+music);
		}else {
			System.out.println(oldTitle + " Music이 검색되지 않습니다.");
		}
	}


	//7. 곡명 오름차순 정렬
	private void ascTitle() {
		int result = mc.ascTitle();
		if(result == 1) {
			System.out.println("타이틀명 정렬이 완료되었습니다.");
			List<Music> mList = mc.sortPrintAll();
			System.out.println(mList);
		}else {
			System.out.println("타이틀명 정렬이 안되었습니다.");
		}
	}
	
	//8. 가수명 내림차순 정렬
	private void descSinger() {
		int result = mc.descSinger();
		if(result == 1) {
			System.out.println("가수명 정렬이 완료되었습니다.");
			List<Music> mList = mc.sortPrintAll();
			System.out.println(mList);
		}else {
			System.out.println("가수명 정렬이 안되었습니다.");
		}
	}
}















