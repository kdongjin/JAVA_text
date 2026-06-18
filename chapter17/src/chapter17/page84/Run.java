package chapter17.page84;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Run {

	public static void main(String[] args) {
		// Map 컬렉션 프레임워크진행 HashMap<키객체,값객체>   ArrayList<값객체> : 키 자동으로 인덱스설정(0,1,2,3 ~~, 100)
		Map<Data, String> hm = new HashMap<Data, String>();
		Map<Data,String>  syncHashMap = Collections.synchronizedMap(hm);
		
		// add => put
		hm.put(new Data(1), new String("kdj1"));
		hm.put(new Data(2), new String("kdj2"));
		hm.put(new Data(3), new String("kdj3"));
		System.out.println(hm.toString());
		
		// set(1,"abc") replace(키객체, 바꾸고자 값객체), for each => contains => 부분수정, 
		hm.replace(new Data(2), new String("홍길동"));
		System.out.println(hm.toString());
	
		// get(index) === get(키객체), for each문을 통해서 가져온다. 
		System.out.printf(" hm.get(new Data(2)) = %s \n",hm.get(new Data(2)));
		
		// List: contains(객체), Set: contains(객체), Map : containsKey(객체), containsValue(객체)
		System.out.printf("hm.containsKey(new Data(2)) = %b \n", hm.containsKey(new Data(4)));
		System.out.printf("hm.containsValue(new String(홍길동1)) = %b \n", hm.containsValue(new String("홍길동1")));
		
		//향상된포문 : ArrayList, set,  Map => for each문 안된다. => 
		//1. Map 키객체를 Set 변경한다.
		 Set<Data>  mapToSet = hm.keySet();
		 System.out.println(mapToSet);
		 for (Data data : mapToSet) {
			//키객체로 Value객체를 찾을 수 있다. 
			 String value = hm.get(data);
			 System.out.printf("hm.get(%s) = %s \n",data, value);
		}
		 
		 //2. entrySet() => 1번문장으로 빠꾸어서 실행하라.(하지말것) 
		 //3. Set<Map.entry<Data, String>> => 향상된 포문을 작돟
		 Set<Map.Entry<Data, String>> entrySet = hm.entrySet(); 
		 System.out.println(entrySet);
		 for (Entry<Data, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		 
		 //size()
		 System.out.printf("map size = %d \n", hm.size());
		 
		 //remove(인텍스), remove(객체), remove(키객체);
		 hm.remove(new Data(3)); 
		 System.out.println("remove(3)= "+hm);
		 
		 //clear()
		 hm.clear();
		
		 
		 //isEmpty()
		 System.out.printf("hm.isEmpty() = %b \n", hm.isEmpty());
		
	}
	

}



























