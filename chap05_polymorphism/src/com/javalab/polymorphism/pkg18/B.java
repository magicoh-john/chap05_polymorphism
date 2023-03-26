package com.javalab.polymorphism.pkg18;

public class B {
	//인스턴스 멤버 클래스
	class C {}
	
	//인스턴스 필드 값으로 B 객체 대입
	B field = new B(); 
	
	//생성자
	B() {
		B b = new B();
	}
	
	//인스턴스 메소드
	void method() {
		B b = new B();
	}
}