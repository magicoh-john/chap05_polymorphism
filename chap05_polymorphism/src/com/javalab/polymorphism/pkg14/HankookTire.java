package com.javalab.polymorphism.pkg14;
/**
 * 구현 클래스
 */
public class HankookTire implements Tire {
	//추상 메소드 재정의
	@Override
	public void roll() {
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}