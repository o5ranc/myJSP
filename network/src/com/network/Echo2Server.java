package com.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/* 확인방법
 * 1. Echo2Server 서버 실행 후 접속 대기
 * 2. Echo1Client 여러개 실행 후 각각 메시지 보내서 서버에 도착 잘 하는지 보기
 * */
public class Echo2Server extends Thread {
	protected static boolean cont = true;
	protected Socket connection = null;

	private Echo2Server(Socket accept) {
		connection = accept;
		start();
	}
	
	public void run() {
		BufferedReader in;
		
		System.out.println("스레드 생성됨.");
		
		try {
			in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String msg;
			while((msg = in.readLine()) != null) {
				System.out.println("읽은 메시지 : " + msg);
			}
			in.close();
			connection.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		// 1. 서버 소켓 생성을 위한 변수 지정
		ServerSocket server = null;
		server = new ServerSocket(5070);
		System.out.println("서버 소켓 생성 중....");
		
		while(cont) {
			System.out.println("연결 대기 중....");
			new Echo2Server(server.accept());
		}
	}
}
