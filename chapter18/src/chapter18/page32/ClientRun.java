package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ClientRun {

	public static void main(String[] args) throws IOException {
		// 클라이언트소켓(고객)
		System.out.println("<<Client>>");
		// 서버소켓(socket)
		//서버에 요청을 하면 , 서버에서 Accept하게 되면 서버소켓정보를 받게된다. 
		Socket socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)9}),3000);

		System.out.println("서버에 접속완료");
		System.out.printf("서버주소 :%s , 서버포트번호: %d \n", socket.getInetAddress(), socket.getPort());
	
		// 서버와 대화할수있는(입 :OutputStream, 귀: InputStream) 생성해야된다.
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream((socket.getOutputStream()))); // 고객에게 전달할
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

		// 1. 클라이언트는 듣는다. 무한대기
		String receiveMessage = dis.readUTF(); 
		System.out.printf("서버>>%s\n", receiveMessage);

		//2. 서버에게 주문한다. 
		dos.writeUTF("짜장면이요.");
		dos.flush();

		// 3. 고객이 주문할 내용을 읽기를 기다린다.(무한대기)
		String receiveMessage2 = dis.readUTF();
		System.out.printf("서버>>%s\n", receiveMessage2);
		
	}

}











