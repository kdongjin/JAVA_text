package chapter17.page38;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Run {

	public static void main(String[] args) {
		// ArrayList와 LinkedList 성능차이 경험해보자.
		List<Integer> aList = new ArrayList<Integer>();
		List<Integer> linkList = new LinkedList<Integer>(); 
		
		System.out.println("==================add()60~100배차이=====================");

		long startTime2 = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			linkList.add(0,i); 
		}
		long endTime2 = System.nanoTime();
		System.out.printf("LinkedList 100_000번추가했을때 걸리는 나노타입 %d \n", endTime2 - startTime2);
		
		//aList =>100000번 추가하겠다. add()
		long startTime = System.nanoTime();
		for (int i = 0; i < 100_000; i++) {
			aList.add(0,i); 
		}
		long endTime = System.nanoTime();
		System.out.printf("aList 100_000번추가했을때 걸리는 나노타입 %d \n", endTime - startTime);
		
		System.out.println("==================get()4000배차이=============================");
		long startTime3 = System.nanoTime();
		for (int i = 0; i < linkList.size(); i++) {
			linkList.get(i); 
		}
		long endTime3 = System.nanoTime();
		System.out.printf("LinkedList 100_000번 가져왔을때 걸리는 나노타입 %d \n", endTime3 - startTime3);
		
		//aList =>100000번 추가하겠다. add()
		long startTime4 = System.nanoTime();
		for (int i = 0; i < aList.size(); i++) {
			aList.get(i); 
		}
		long endTime4 = System.nanoTime();
		System.out.printf("aList 100_000번 가져왔을때 걸리는 나노타입 %d \n", endTime4 - startTime4);
		
		System.out.println("==================remove() 200배차이===============================");
		long startTime5 = System.nanoTime();
		for (int i = 0; i < linkList.size(); i++) {
			linkList.remove(0); 
		}
		long endTime5 = System.nanoTime();
		System.out.printf("LinkedList 100_000번 제거했을때 걸리는 나노타입 %d \n", endTime5 - startTime5);
		
		//aList =>100000번 추가하겠다. add()
		long startTime6 = System.nanoTime();
		for (int i = 0; i < aList.size(); i++) {
			aList.remove(0); 
		}
		long endTime6 = System.nanoTime();
		System.out.printf("aList 100_000번 제거했을때 걸리는 나노타입 %d \n", endTime6 - startTime6);

	}

}











