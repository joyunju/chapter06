package com.javaex.ex02;

public class DigitThread extends Thread {

	// 필드

	// 생성자

	// 메소드 - gs

	// 메소드 - 일반
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("thread1 : " + i);
		}
	}
}
