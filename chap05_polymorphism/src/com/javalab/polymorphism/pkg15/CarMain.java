package com.javalab.polymorphism.pkg15;
/**
 * 실행클래스
 *  - myCar.run(); 
 *    코드는 동일하지만 어떤 타이어 객체를 필드에 저장하느냐에 따라 다른 결과가 나옴
 *    다형성 적용된 경우
 */
public class CarMain {
	
	public static void main(String[] args) {
		
		//1. 자동차 객체 생성
		Car myCar = new Car();

		//run() 메소드 실행
		myCar.run();
		
		System.out.println();

		//2. 타이어 교체
		//타이어를 다른 회사걸로 교체 가능
		myCar.frontTire1 = new HankookTire(); // 자동 타입 변환
		myCar.frontTire2 = new HankookTire();
		myCar.backTire1 = new HankookTire();
		myCar.backTire2 = new HankookTire();
		myCar.run();
		System.out.println();
		
		//3. 타이어를 다른 회사걸로 교체 가능
		// 자동차의 필드를 Tire 인터페이스 타입으로 해놓음
		myCar.frontTire1 = new KumhoTire();
		myCar.frontTire2 = new KumhoTire();
		myCar.backTire1 = new KumhoTire();
		myCar.backTire2 = new KumhoTire();
		myCar.run(); //2.번과 동일한 코드이지만 결과는 다름
		
	}
}