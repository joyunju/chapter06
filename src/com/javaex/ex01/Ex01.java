package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) throws InterruptedException {

		// 출장가서 준비되는대로 시작해라(숫자 찍어라)
		Thread thread = new DigitThread(); // 스레드를 생성
		//***** thread.run(); 이라고 쓰지 않게 주의 *****
		thread.start(); // 스레드를 시작

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			// 실행중인 스레드를 잠시 멈추게 하고 싶다면 Thread 클래스의 정적 메소드인 sleep() 메소드를 사용
			// Thread.sleep()메소드를 호출한 스레드는 주어진 시간 동안 일시 정지 상태가 되고 다시 실행 대기 상태로 돌아갑니다.
			Thread.sleep(1000);
		}

	}

}
