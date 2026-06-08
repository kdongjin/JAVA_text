package chapter07.page18;

public class Run {

	public static void main(String[] args) {
		// 가변형 길이 매개변수 설정 
		// 정수형배열 int[] a = (new int[]{1,2}) => (int[] a)
		method1(new int[] {1,2});
		int[] a = new int[] {11,22};
		method1(a);
		method2(22,33);
		method2(a); 
		method2(new int[] {44, 45});
		method3("aaa","bbb");
		method3(new String[]{"aaa1","bbb1"});
		String[] strArray = {"aaa2","bbb2"};
		method3(strArray);
	}
	
	public static void method1(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%-5d", a[i]);
		}
		System.out.println();
	}
	
	public static void method2(int... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("(2번)%-5d", a[i]);
		}
		System.out.println();
	}
	public static void method3(String... a) {
		for (int i = 0; i < a.length; i++) {
			System.out.printf("(2번)%-10s", a[i]);
		}
		System.out.println();
	}

}
