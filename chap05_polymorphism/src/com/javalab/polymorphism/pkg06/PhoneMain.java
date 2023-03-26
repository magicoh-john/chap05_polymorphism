package com.javalab.polymorphism.pkg06;

public class PhoneMain {
	public static void main(String[] args) {
		//Phone은 추상 클래스로 자신의 생성자 호출 불가
		//Phone phone = new Phone();

		// 자식 객체를 생성하면 부모인 추상클래스가 먼저 객체로 생성후 자식 생성
		// 자식 객체 생성 -> 부모에게서 상속받은 멤버 모두 사용 가능
		SmartPhone smartPhone = new SmartPhone("홍길동");

		smartPhone.turnOn(); // 부모 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff();	// 부모 메소드
	}
}