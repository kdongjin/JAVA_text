package chapter18.page32;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Run {

	public static void main(String[] args) throws IOException {
		// 서버소켓(식당)
		
			System.out.println("<<SERVER>>");
			ServerSocket serverSocket = new ServerSocket(3000);
			// 접속대기(고객식당들어오기를 기다린다), 무한대기
			// socket :고객이다.
			Socket socket = serverSocket.accept();
			// 서버화면 고객이 입장을 했음을 알려줘야한다.
			System.out.println("클라이언트 연결수락하였습니다(고객입장)");
			System.out.printf("고객주소 :%s , 고객포트번호: %d \n", socket.getInetAddress(), socket.getPort());

			// 클라이언트와 대화할수있는(입 :OutputStream, 귀: InputStream) 생성해야된다.
			DataOutputStream dos = new DataOutputStream(new BufferedOutputStream((socket.getOutputStream()))); // 고객에게
																												// 전달할
																												// 메세지(말)
			DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

			// 1. 서버가 고객에게 말한다.
			String sendMessage = "안녕하세요 고객님";
			dos.writeUTF("안녕하세요 고객님");
			System.out.printf("서버>>%s\n", sendMessage);
			// 버퍼를 가득채워져야만 전송이 되는데, 바로 작성한 글을 바로 보내고 싶다.
			dos.flush();
			// 2. 고객이 주문할 내용을 읽기를 기다린다.(무한대기)
			String message = dis.readUTF();
			System.out.printf("고객>>%s\n", message);
			// 3. 서버는 주문한것을 진행하면된다.
			dos.writeUTF(message + " 주문처리되었습니다. 감사합니다.");
			dos.flush();

			
		
	}
}
