package com.javaex.ex02;

public class LowerThread extends Thread {

	// 필드

	// 생성자

	// 메소드 - gs

	// 메소드 - 일반
	public void run() {
		for (char chLower = 'a'; chLower <= 'z'; chLower++) {
			System.out.println("thread2 : " + chLower);
		}
	}

}
