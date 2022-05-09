// java.lang.Thread 클래스를 사용하는 방법

package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		//3개의 스레드를 생성해서 시작
		Thread thread1 = new DigitThread(); 	//숫자 
		Thread thread2 = new LowerThread();		//소문자
		Thread thread3 = new UpperThread();		//대문자 
		
		// start() 와 run() 메서드의 차이 
		thread1.start();
		thread2.start();
		thread3.start();
		
		
		// start() 와 run() 메서드의 차이점알기
		// start()
		// : 멀티스레드로 동작
		// : native 영역에서 새로운 Thread가 생성되며 Thread가 시작되면 run() 메서드가 실행된다.
		
		// run()
		// : 싱글스레드로 동작 
		// : Thread가 생성되지 않으며 그냥 run() 메서드만 실행된다.
		
	}

}
