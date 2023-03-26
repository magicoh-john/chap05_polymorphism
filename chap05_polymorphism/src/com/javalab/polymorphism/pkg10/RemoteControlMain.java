package com.javalab.polymorphism.pkg10;

import java.util.ArrayList;
import java.util.List;

public class RemoteControlMain {
	public static void main(String[] args) {
		
		// 1. 인터페이스를 사용하지 않는 평범한 경우
		Television tv = new Television();
		
		// 2. 인터페이스를 사용하는 경우
		RemoteControl rc = null; // 인터페이스 타입 변수 rc 선언

		//rc 변수에 Television 객체를 대입(일종의 자동 타입 변환)
		rc = new Television();
		rc.turnOn();	// 부모 타입의 turnOn()메소드는 감춰지고 구현 객체(자식)의 메소드가 호출됨.
		System.out.println();
		
		//rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();	// Audio 객체의 오버로딩된 메소드가 호출됨
		System.out.println();
		
		// 인터페이스 타입 배열 생성해서 자동 호출
		RemoteControl[] rcs = new RemoteControl[2];
		rcs[0] = new Audio();
		rcs[1] = new Television();
		for (RemoteControl remote : rcs) {
			remote.turnOn();
			System.out.println();
		}
		
		// 나중에 배울 ArrayList<RemoteControll> 활용
		Audio audio = new Audio();
		Television tv1 = new Television();
		List<RemoteControl> remoconList = new ArrayList<>();
		remoconList.add(audio);
		remoconList.add(tv1);
		for (RemoteControl remoteCon : remoconList) {
			remoteCon.turnOn();
		}
	}
}