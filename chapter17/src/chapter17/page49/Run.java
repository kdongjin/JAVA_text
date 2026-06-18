package chapter17.page49;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// List == Set 똑같고 (6가지명령어를 사용가능하다. Set =>get()없다.
		// Set 중복으로 삽입이안된다.(equals, hashCode 오버라이딩 필수적이다. )
		// TreeSet 정렬,검색 (comparable  구현이된다)
		//추가기능 add
		Set<Data> hset1 = new HashSet<Data>();
		Set<Data> syncHSet = Collections.synchronizedSet(hset1); 
		
		hset1.add(new Data(1, "A"));
		hset1.add(new Data(1, "B"));
		hset1.add(new Data(1, "C"));
		hset1.add(new Data(1, "A"));
		System.out.println(hset1.toString());
		//삭제기능 remove
		hset1.remove(new Data(1,"A"));
		System.out.println(hset1.toString());
		//가져오기기능 get
		System.out.println("====get x => for each ===================");
		for (Data data : hset1) {
			System.out.println(data);
		}
		//clear 기능
		hset1.clear();
		System.out.printf("hset1.clear() : %s \n", hset1.toString());
		//isEmpty 기능
		
		System.out.printf("hset1.isEmpty() = %b \n", hset1.isEmpty());
		
		Set<Data> hset2 = new HashSet<Data>();
		hset2.add(new Data(1, "A"));
		hset2.add(new Data(1, "B"));
		hset2.add(new Data(1, "C"));
		
		//contains 확인
		System.out.printf("new Data(1, 'A') contains : %b \n", hset2.contains(new Data(1, "A")));
		System.out.printf("new Data(1, 'D') contains : %b \n", hset2.contains(new Data(1, "D")));
		
		//size()확인
		System.out.printf("size = %d \n", hset2.size());
		
		//iterator확인
		System.out.println("==========iterator================");
		Iterator<Data> iterator = hset2.iterator();
		//바구니속에 가져올객체가 있으면 true, 없으면 false
		while (iterator.hasNext()) {
			Data data = iterator.next();
			System.out.println(data);
		}
		//for each 가져와서 출력하겠다.
		System.out.println("==========for each================");
		for (Data data : hset2) {
			System.out.println(data);
		}
	
	}

}


































