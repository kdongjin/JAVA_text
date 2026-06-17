package chapter17.page09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Run {
	public static void main(String[] args) {
		//List => ArrayList, Vector, LinkedList
		//size() => 10개확보 => 생성자 갯수를 입력이 가능하다. 
		//LinkedList : 링크드리스트 구조때문에 사이즈을 잡아놓고 사용하는것이 아니다.
		List<String> aList1 = new ArrayList<String>(50);
		List<String> aList2 = new Vector<String>(50);
		//List<String> aList3 = new LinkedList<String>(50);
		//==========================================================
		//Arrays.asList(); 정적리스트로 변경한다. (배열처럼 추가, 삭제 안된다.)
		List<String> aList3 = Arrays.asList("a","b","c"); 
		System.out.println(aList3);
		aList3.set(1, "k");
		System.out.println(aList3);
		//===========================================================
		//전체삭제
		List<String> aList4 = new ArrayList<String>();
		aList4.add("a");
		aList4.add("b");
		aList4.add("c");
		System.out.println("aList4 = "+aList4);
		aList4.clear();
		System.out.println("aList4.clear() = "+aList4);
		//isEmpty();
		if(aList4.isEmpty()) {
			System.out.printf("aList4 자료가 없습니다. 사이즈 %d \n", aList4.size());
		}
		//List구조를 배열구조로 변경한다.
		List<String> aList5 = new ArrayList<String>();
		aList5.add("a");
		aList5.add("b");
		aList5.add("c");
		String[] oArray = aList5.toArray(new String[0]);
		System.out.println(Arrays.toString(oArray));
		// List 구조에 contains 기능이 있는지 체크
		if(aList5.contains("a") == true) {
			System.out.println("list에 contains 기능이 있어요.");
		}
		//List 구조에 iterator 기능이 있는지 체크
		
	
	}
}










