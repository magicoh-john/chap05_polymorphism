package com.javalab.polymorphism.pkg08;

/**
 * 추상클래스 구현 클래스(자식 클래스)
 * 부모의 추상 메소드 중에서 하나라도 구현 안하면 자신도 추상클래스가 되어야 함.
 * 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 되어야 함. 
 * 예를 들어서 stop() 메소드를 구현하지 않으면 이 클래스도 추상크래스가 되어야 함.
 * 추상메소드가 하나라도 있으면 그 클래스는 추상클래스가 되어야 함. 
 */
public class Bus extends Vehicle {

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	// 주석처리하면 클래스가 추상 클래스가 되어야 함.
	@Override
	public void stop() {
		System.out.println("버스가 정차합니다.");
	}


}
