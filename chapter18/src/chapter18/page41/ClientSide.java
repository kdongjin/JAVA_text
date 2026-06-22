package chapter18.page41;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSide {

	public static void main(String[] args) throws UnknownHostException, IOException {
		System.out.println("클라이언트 영역");
		Socket socket = null;
		// 1번, 2번 서버주소(127.0.0.1)와, 서버포트번호(3000)
		// 서버에 접속요청(socket : 서버와 통신할수 있는 정보가 들어있다)
		//socket = new Socket(InetAddress.getByName("localhost"), 3000);
		socket = new Socket(InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)0,(byte)91}),3000);

		// 3번 서버 socket가지고 송, 수신기 만든다.
		// OutputStream(입), InputStream(귀)
		System.out.println("서버와 연결성공");
		DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));
		
		//4.서버에 보낼 파일이름(bg2.png)결정해서 전송한다. => 파일객체
		File file = new File("src/member-3.png");
		//파일을보낼려면 파일읽어주는통역사가 필요함. 
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		System.out.printf("파일전송할 파일면: %s \n",file.getName());
		//4.서버에 파일명을 전송한다.
		dos.writeUTF(file.getName());
		dos.flush();
		
		//5.서버에게 이미지 전체사이즈와 이미지를 byte[] 전송한다.
		//byte[2048] 크기를 정한다.
		 byte[] imageData = new byte[2048];
		 int length = 0; 
		 //이미지 파일로부터 한번에 2048바이트씩 가져온사이즈값를 계속해서 가져온다.
		 //이미지 모두 가져올때 까지 (-1: 더이상 가져올수 없을때)
		 while ( (length = bis.read(imageData)) != -1 ) {
			dos.writeInt(length);
			dos.write(imageData);
			dos.flush();
		 }
		 dos.writeInt(-1); 
		 dos.flush();
		 
		 //6. 서버가 보낸 메세지를 받아서 확인하고 종료한다.
		 String message = dis.readUTF();
		 System.out.println(message);
		 
		 System.out.println("클라이언트 종료");
	}

}
















