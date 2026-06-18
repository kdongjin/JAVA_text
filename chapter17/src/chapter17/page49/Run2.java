package chapter17.page49;

import java.util.SortedSet;
import java.util.TreeSet;

public class Run2 {

	public static void main(String[] args) {
		// TreeSet : 중복허용안됨 hashCode, equals, 대소크기정해져야됨. compareTo
		TreeSet<Date2> ts = new TreeSet<Date2>();

		// 20개 객체를 트리셋에 추가
		for (int i = 1; i <= 20; i++) {
			int value = (int) (Math.random() * (20 - 1 + 1) + 1);
			System.out.printf("%3d", value);
			ts.add(new Date2(value));
		}
		// 출력
		System.out.println("\n ==============");
		System.out.printf("ts.size() =%d \n", ts.size());
		System.out.println(ts);
		// 가장작은값 first(), pollfirst() 차이점을 비교
		System.out.printf("ts.first() = %s \n", ts.first());
		System.out.printf("ts.pollfirst() = %s \n", ts.pollFirst());
		System.out.printf("ts.size() =%d \n", ts.size());
		System.out.println(ts);
		// 가장작은값 first(), pollfirst() 차이점을 비교
		System.out.printf("ts.last() = %s \n", ts.last());
		System.out.printf("ts.polllast() = %s \n", ts.pollLast());
		System.out.printf("ts.size() =%d \n", ts.size());
		System.out.println(ts);
		// lower, higher
		System.out.printf("ts.lower(new Date2(10)) = %s \n", ts.lower(new Date2(10)));
		System.out.printf("ts.higher(new Date2(10)) = %s \n", ts.higher(new Date2(10)));
		// floor, ceiling
		System.out.printf("ts.floor(new Date2(10)) = %s \n", ts.floor(new Date2(10)));
		System.out.printf("ts.ceiling(new Date2(10)) = %s \n", ts.ceiling(new Date2(10)));
		// headSet(E), headSet(E,false)
		SortedSet<Date2> ss = ts.headSet(new Date2(10), true);
		System.out.println(ss);
		// tailSet(E), tailSet(E,false)
		SortedSet<Date2> ss1 = ts.tailSet(new Date2(10), false);
		System.out.println(ss1);
		// subSet(E1, E2)
		SortedSet<Date2> ss2 = ts.subSet(new Date2(5),true, new Date2(15), true); 
		System.out.println(ss2);
		// 기본: 오름차순, -> 내림차순
		SortedSet<Date2> ss3 = ts.descendingSet();
		System.out.println(ss3);
	}

}









