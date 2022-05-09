// java.lang.Thread 클래스를 사용하는 방법

package com.javaex.ex03;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		Runnable digit = new DigitImpl();
		//Thread thread = new Thread(new DigitImpl());
		// 주석 처리와 아래는 같은 코드 
		Thread thread = new Thread(digit);
		
		//
		thread.start();

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}
