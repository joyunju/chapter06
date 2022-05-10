// java.lang.Thread 인터페이스 사용하는 방법

package com.javaex.ex04;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		Runnable digit = new DigitImpl();
		// Thread thread = new Thread(new DigitImpl());
		// 주석 처리와 아래는 같은 코드
		Thread thread1 = new Thread(digit);
		Thread thread2 = new Thread(new LowerImpl());
		Thread thread3 = new Thread(new UpperImpl());

		//
		thread1.start();
		thread2.start();
		thread3.start();
//
//		for (char ch = 'A'; ch <= 'Z'; ch++) {
//			System.out.println(ch);
//			Thread.sleep(1000);
//		}

	}

}
