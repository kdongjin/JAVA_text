package chapter18.page17;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;

public class Run2 {

	public static void main(String[] args) throws IOException {
		// InetAdress 객체생성 => 통신을 할려면 (ip주소) "192.168.0.9"
		//1. 도메인주소를 가지고 InetAddress 만들어보기
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		System.out.println(ia1);
		System.out.println("===========================");
		byte[] bArr = ia1.getAddress();
		System.out.printf("ia1.getAddress() : %s \n", Arrays.toString(bArr));
		System.out.printf("ia1.getHostAddress() : %s \n",ia1.getHostAddress());
		System.out.printf("ia1.getHostName() : %s \n",ia1.getHostName());
		System.out.printf("ia1.isReachable(10) : %b \n",ia1.isReachable(10));
		System.out.printf("ia1.isLoopbackAddress() : %b \n",ia1.isLoopbackAddress());
		System.out.printf("ia1.isMulticastAddress() : %b \n",ia1.isMulticastAddress());
	}

}
















