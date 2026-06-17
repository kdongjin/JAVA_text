package chapter17.page06;

import java.util.ArrayList;
import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		//배열과(크기변경, 삭제변경, 추가변경: 일고, 수정만가능) 리스트(모두됨)의 차이점. 
		//배열크기 낭비, 리스트 낭비없음 비교
		String[] array = new String[]{"가", "나", "다", "라", "마", "바", "사"};
		for (String string : array) {
			System.out.printf("%5s ", string);
		}
		System.out.println();
		array[1] = null; 
		array[2] = null; 
		
		for (String string : array) {
			System.out.printf("%5s ", string);
		}
		System.out.printf("\n배열의 크기: %d \n", array.length);
		System.out.println("array ="+array);
		System.out.println("array =" +Arrays.toString(array) + "kdj");
		System.out.println("\n==========================");
		//리스트
		ArrayList<Student> aList = new ArrayList<Student>();
		aList.add(new Student()); aList.add(new Student()); aList.add(new Student()); 
		aList.add(new Student()); aList.add(new Student()); 
		for (Student s : aList) {
			System.out.printf("%5s ", s);
		}
		System.out.printf("\narrayList 크기: %d \n", aList.size());
		
		aList.remove(1);
		aList.remove(2);
		System.out.println();
		for (Student s : aList) {
			System.out.printf("%5s ", s);
		}
		System.out.printf("\narrayList 크기: %d \n", aList.size());
		System.out.println(aList+"kdj");
	}
}









