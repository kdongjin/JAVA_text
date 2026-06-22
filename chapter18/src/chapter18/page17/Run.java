package chapter18.page17;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Run {

	public static void main(String[] args) throws UnknownHostException {
		// InetAdress 객체생성 => 통신을 할려면 (ip주소) "192.168.0.9"
		//1. 도메인주소를 가지고 InetAddress 만들어보기
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		System.out.println(ia1);
		//2. "192.168.0.9"
		InetAddress ia2 = InetAddress.getByAddress(new byte[] {(byte)192, (byte)168, (byte)0, (byte)9});
		System.out.println(ia2);
		//3. 도메인이름과 내가정한 ip로 InetAddress
		InetAddress ia3  = InetAddress.getByAddress("www.kdj.com", new byte[] {(byte)192, (byte)168, (byte)0, (byte)9});
		System.out.println(ia3);
		//4. 로컬호스트 : 자기 컴퓨터에서 할당된 주소
		InetAddress ia4 = InetAddress.getLocalHost();
		System.out.println(ia4);
		//5. 루프백호스트 : 127.0.0.1
		InetAddress ia5 = InetAddress.getLoopbackAddress();
		System.out.println(ia5);
		//6. IP주소가 2개이상있는 회사가 많이 있다. 
		InetAddress[] iaArr = InetAddress.getAllByName("www.daum.com");
		for (InetAddress ia : iaArr) {
			System.out.println(ia);
		}
		//==================================================
		
	}

}
















