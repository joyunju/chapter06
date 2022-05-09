package com.javaex.ex02;

public class UpperThread extends Thread{

	// 필드

	// 생성자

	// 메서드 - gs

	// 메서드 - 일반
	public void run() {
		for (char chUpper = 'A'; chUpper <= 'Z'; chUpper++) {
			System.out.println("thread3 : " + chUpper);
		}
	}

}
