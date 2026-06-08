package chapter07.practice08;

import java.util.Scanner;

public class Run {
	static Scanner scan = new  Scanner(System.in); 
	public static void main(String[] args) {
		boolean exitFlag = false; 
		while (!exitFlag) {
			System.out.println("1번:zoo, 2번:zoo배열관리, 3번:member, 4:exit");
			System.out.print("no>>");
			int no = Integer.parseInt(scan.nextLine());
			
			switch (no) {
			case 1:	
				zooPractice();
				break;
			case 2:	
				zooArrayPractice(); 
				break;
			case 3:	break;
			case 4:	
				System.out.println("프로그램종료");
				exitFlag = true; 
				break;
			default:
				System.out.println("정신차려");
				break;
			}
		}
		
		if(scan != null) {
			scan.close();
		}
		System.out.println("The end");
	}
	
	//동물원 프로그램
	private static void zooPractice() {
		//객체를만든다.
		Zoo zoo = new Zoo("우리동물원","경기도성남");
		
		//동물들을 입성
		boolean exitFlag = false; 
		while (!exitFlag) {
			int animalCount = zoo.getAnimalCount();
			if(animalCount >= 5) {
				System.out.println("동물원 인원초과");
				exitFlag = true; 
			}else {
				System.out.print("동물원에 입소할 동물이름>>");
				String animalName = scan.nextLine(); 
				zoo.addAnimal(animalName);
			}
		}
		//동물원전체출력
		System.out.printf("동물원정보: %s \n",zoo.toString());
		
	}
	//동물원객체 배열관리
	private static void zooArrayPractice() {
		// 동물원클래스 배열관리 3개관리
		Zoo[] zooArray = new Zoo[3]; 
		
		//사이즈 정해져있는것 무한루프를 사용하지 않는다.
		for (int i = 0; i < zooArray.length; i++) {
			zooArray[i] = new Zoo();
			System.out.print("동물원이름>>");
			zooArray[i].setName(scan.nextLine());
			System.out.print("동물원위치>>");
			zooArray[i].setLocation(scan.nextLine());
			
			//동물들을 입성
			boolean exitFlag = false; 
			while (!exitFlag) {
				int animalCount = zooArray[i].getAnimalCount();
				if(animalCount >= 5) {
					System.out.println("동물원 인원초과");
					exitFlag = true; 
				}else {
					System.out.print("동물원에 입소할 동물이름>>");
					String animalName = scan.nextLine(); 
					zooArray[i].addAnimal(animalName);
				}
			}
			System.out.printf("%d번째 동물원셋팅완료했습니다. \n", i+1);
		}//end of for
		
		//3개동물원 정보출력
		for (int i = 0; i < zooArray.length; i++) {
			System.out.printf("%d번째동물원정보출력 \n%s \n",i+1, zooArray[i].toString());
		}
	}

}


































