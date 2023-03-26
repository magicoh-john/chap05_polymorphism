package com.javalab.polymorphism.pkg09;

public class SportsMain {

	public static void main(String[] args) {

		Player player = new Player();

		// 부모타입 클래스 변수 선언
		Sports sp = null;

		System.out.println("[1. 자동 타입 변환]--------------------");

		sp = new Baseball(); // 자동 타입 변환
		player.play(sp);

		sp = new Soccer(); // 자동 타입 변환
		player.play(sp);

		System.out.println("[2. 배열을 이용한 플레이]--------------------");
		
		Sports[] arrSports = new Sports[2];	// 부모 타입 배열
		arrSports[0] = new Baseball();	// 자동 형변환
		arrSports[1] = new Soccer();	// 자동 형변환
		for (int i = 0; i < arrSports.length; i++) {
			player.play(arrSports[i]);
		}
	}
}
