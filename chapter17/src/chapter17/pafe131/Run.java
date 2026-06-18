package chapter17.pafe131;

import java.util.Stack;

public class Run {

	public static void main(String[] args) {
		// Stack 컬플
		Stack<Data> st = new Stack<Data>(); 
		// add, add, put(k,v), push(v)
		st.push(new Data(1));
		st.push(new Data(5));
		st.push(new Data(9));
		st.push(new Data(3));
		System.out.println(st);
		
		// stack 제일위에 값을 확인 peek(), get, contains ->for each, get(k), peek()
		// peek , pop 차이점
		System.out.printf("st.peek() = %s \n", st.peek());
		System.out.printf("st.size() = %d \n", st.size());
		System.out.printf("st.pop() = %s \n", st.pop());
		System.out.printf("st.size() = %d \n", st.size());
		System.out.println(st);
		
		// search , contains, containsKey, containsValue
		System.out.printf("st.search(new Data(9)) = %d \n", st.search(new Data(9)));
		System.out.printf("st.search(new Data(1)) = %d \n", st.search(new Data(1)));
		System.out.printf("st.search(new Data(11)) = %d \n", st.search(new Data(11)));
		
		//isEmpty()
		System.out.printf("st.isEmpty() = %b \n", st.isEmpty());
		
	}

}













