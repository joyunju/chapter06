package com.javaex.ex04;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'a'; ch < 'z'; ch++) {
			System.out.println(ch);
			
			//오류처리 : try-catch문 
			try {
				// 속도 느리게 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
