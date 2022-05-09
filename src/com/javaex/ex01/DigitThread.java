//숫자를 출력하는 스레드 클래스

package com.javaex.ex01;

public class DigitThread extends Thread {

	// 필드

	// 생성자

	// 메소드 - gs

	// 메소드 - 일반
	// 꼭 run() 이라고 써야함 *****
	// option + commad +s > Override/Implement Methods 누르면 부모쪽 메소드 모임
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}
