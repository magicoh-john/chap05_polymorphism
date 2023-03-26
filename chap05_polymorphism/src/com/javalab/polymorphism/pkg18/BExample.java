package com.javalab.polymorphism.pkg18;

public class BExample {
	public static void main(String[] args) {
		//A 객체 생성
		B a = new B();

		//B 객체 생성
		B.C b = a.new C();
	}
}