package chapter05.practice05;

public class Page35StringTest {

	public static void main(String[] args) {
		// new 문자열객체를 생성한다.
		String str1 = new String("안녕하세요.");
		System.out.printf("str1 = %s \n", str1);
		System.out.printf("str1 주소 = %d \n ", System.identityHashCode(str1));
		
		String str2 = new String("안녕하세요");
		System.out.printf("str2 = %s \n", str2);

		//두개의 객체를 번지를 비교하면 결과값?
		System.out.printf("str1 == str2 = %b \n", str1 == str2);
		
		String s3 = "안녕하세요"; 
		System.out.printf("s3 = %d \n ", System.identityHashCode(s3));
		
		String s4 = "안녕하세요"; 
		System.out.printf("s4 = %d \n ", System.identityHashCode(s4));

	}

}
