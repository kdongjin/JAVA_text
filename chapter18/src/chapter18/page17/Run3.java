package chapter18.page17;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class Run3 {

	public static void main(String[] args) throws UnknownHostException {
		// 1. 도메인명으로 InetAddress 생성
		InetAddress ia1 = InetAddress.getByName("www.google.com");
		// 2. port 번호설정 (0~ 1024번 개인사용금지)
		int port = 2000;
		// 3. 소켓통신 InetSocketAddress
		InetSocketAddress isa = new InetSocketAddress(ia1, port);
		// 4. 소켓주소 출력
		System.out.println(isa);
		// 5. 소켓주소(도메인명, 주소, 포트)
		System.out.println(isa.getHostName());
		System.out.println(isa.getPort());
		System.out.println(isa.getAddress());
	}

}
