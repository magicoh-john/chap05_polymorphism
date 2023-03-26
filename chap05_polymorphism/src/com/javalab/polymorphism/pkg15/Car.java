package com.javalab.polymorphism.pkg15;
/**
 * 인터페이스를 구현한 클래스들을 사용하는 클래스
 * - 필드를 인터페이스 타입으로함
 */
public class Car {
	//필드(타이어 인터페이스 타입)
	Tire frontTire1 = new KumhoTire();
	Tire frontTire2 = new KumhoTire();
	Tire backTire1 = new KumhoTire();
	Tire backTire2 = new KumhoTire();
	
	//메소드
	void run() {
		frontTire1.roll();
		frontTire2.roll();
		backTire1.roll();
		backTire2.roll();
	}
}