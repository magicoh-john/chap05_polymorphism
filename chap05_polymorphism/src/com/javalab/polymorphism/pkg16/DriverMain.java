package com.javalab.polymorphism.pkg16;
/**
 * [개발 코드 역할]
 * 인터페이스를 구현한 클래스들을 객체로 생성해서 관리하는 역할
 */

public class DriverMain {
	
	public static void main(String[] args) {
		//[1] 다형성이 아닌 일반적인 객체 활용
		System.out.println("[1] 다형성이 아닌 일반적인 객체 활용===================");
		Taxi taxi = new Taxi();
		taxi.run();
		Bus bus = new Bus();
		bus.run();
		System.out.println();
				
		//[2] 인터페이스와 매개 변수를 활용한 다형성 구현
		System.out.println("[2] 인터페이스와 매개 변수를 활용한 다형성 구현 =============");
		Driver driver = new Driver(); // 인터페이스를 사용한 Driver 객체 생성

		// 구현 객체 생성해서 인터페이스 타입에 저장
		driver.drive(taxi);	//Driver객체의 drive()메소드로 전달되면서 자동 타입 변환됨
		driver.drive(bus);
		System.out.println();
		
		//[3] 운행할 객체가 많을 경우 일일히 drive메소드를 호출해줘야함(코드 중복)
		//    그걸 방지하기 위해서 반복문으로 아무리 많은 객체가 와도 자동으로
		//    자신의 운행방식에 맞게 운전하게 됨.[다형성]
		
		System.out.println("[3] 반복문을 통해서 운행을 자동화 시킴 =============");
		Vehicle[] vehicle = new Vehicle[2];
		vehicle[0] = new Bus(); // 자동 타입 변환
		vehicle[1] = new Taxi();
		
		for(int i=0; i<vehicle.length; i++) {
			driver.drive(vehicle[i]); // 어떤 구현 객체가 와도 받는 쪽에서 자동으로 타입 변환되어 처림
		}
	}
	
}