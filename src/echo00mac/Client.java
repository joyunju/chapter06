package echo00mac;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class Client {

	public static void main(String[] args) throws IOException {

		//
		Socket socket = new Socket();

		System.out.println("<클라이언트 시작>");
		System.out.println("==============================");

		System.out.println("[서버에 연결을 시도합니다.]");
		socket.connect(new InetSocketAddress("127.0.0.1", 5000));

		System.out.println("[서버에 연결되었습니다.]");

		// 메세지보내기용 스트림
		// OutputStream os = new FileOutputStream("phonebook.txt"); 이거 대신 ↓
		OutputStream os = socket.getOutputStream();   // new 불필요, 알아서 세팅되어있음
		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		// 메세지 받기용 스트림
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		//스캐너
		Scanner sc = new Scanner(System.in);
		
		// 반복문 적용
		while(true) {
			//키보드 입력
			String str = sc.nextLine();
			
			if(str.equals("/q")) {
				break;
			}
		}
		
		//메세지 보내기
		String str = sc.nextLine();
		
		bw.write(str);
		// 현재 정보량이 매우 적어 전송이 되지 않음 (정보량이 더필요한 상황 )
		bw.newLine();
		bw.flush(); // 쟁반이 다 꽉차지 않아도 보내라는 뜻 // 강제 송출
		
		//메세지 받기
		String reMsg = br.readLine();
		System.out.println("server : [" + reMsg + " ]");
		
		System.out.println("==============================");
		System.out.println("<클라이언트 종료>");
		
		sc.close();
		br.close();
		bw.close();
		socket.close();

	}

}
