package com.javalab.polymorphism.pkg12;

// 실행 클래스
public class RemoteControlMain {

	public static void main(String[] args) {
		
		RemoteControl remocon; //인터페이스 타입 변수 선언
		
		// 1. 리모컨 기능만 있는 Televesion 사용
		//텔레비전 객체 생성해서 인터페이스 타입에 저장
		remocon = new Television();  //구현 객체 대입(자동타입변환)
		remocon.turnOn(); //구현 객체의 메소드가 호출
		remocon.turnOff(); //구현 객체의 메소드가 호출
		System.out.println();

		// 자신이 구현하지 않은 인터페이스 타입으로 저장 불가
		//Searchable sh1 = new Television(); // Searchable을 구현해야 함.
		//sh1.search("www.naver.com");
		
		// 2. SmartTV를 작동하는 경우
		SmartTelevision sTv = new SmartTelevision();
		// 인터페이스 타입 변수에 저장
		RemoteControl remocon2 = sTv; // 자동타입변환
		Searchable sh = sTv;   //자동타입변환
		remocon2.turnOn();     //구현 객체의 메소드가 호출
		remocon2.setVolume(6); //구현 객체의 메소드가 호출
		sh.search("www.naver.com");
		remocon2.turnOff();
	}
}
