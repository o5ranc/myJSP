package com.network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {

	public static void main(String[] args) {
		Socket client = null;
		PrintWriter out = null;
		
		client = new Socket();
		System.out.println("서버와 연결 시도 . . . . ");
		try {
			client.connect(new InetSocketAddress("127.0.0.1",5000),3000);
			System.out.println("서버와의 연결 성공!!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//여기서 true 주고 주지 않을 때의 차이점. true를 할 때마다 buffer가 비워지는 것. 
			//true가 없을땐 close를 할때 몽땅 보내게 되어있음.
			out = new PrintWriter(client.getOutputStream(),true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner in = new Scanner(System.in);
		String msg; 
		System.out.print("보낼 메세지 있나요?");
		while ((msg= in.nextLine())!=null) {
			if(msg.contains("끝"))break;
			out.println(msg);
			System.out.print("보낼 메세지가 더 있나요?");
		}
		System.out.println("클라이언트 종료!");
		try {
			out.close();
			in.close();
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
