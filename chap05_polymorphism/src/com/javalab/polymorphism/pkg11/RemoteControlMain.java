package com.javalab.polymorphism.pkg11;

public class RemoteControlMain {
	public static void main(String[] args) {
		//인터페이스 변수 선언
		RemoteControl rc;
		
		//Television 객체를 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn(); //TV 켬
		rc.setVolume(11);
		rc.turnOff();	//TV 끔
		System.out.println();
		
		//Audio 객체를 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-1);
		rc.turnOff();
		System.out.println();
		
		// 다형성 구현을 위한 배열 선언
		RemoteControl[] rcs = new RemoteControl[2];
		rcs[0] = new Television();
		rcs[1] = new Audio();
		for (RemoteControl remoteControl : rcs) {
			remoteControl.turnOn();
			remoteControl.turnOff();
			System.out.println();
		}
		
	}
}