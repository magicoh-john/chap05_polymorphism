package com.javalab.polymorphism.pkg08;

public class VehicleMain {

	public static void main(String[] args) {

		// 추상 클래스는 직접 객체 생성 안됨.
		// Vehicle vehicle = new Vehicle(); //컴파일 오류

		Driver driver = new Driver();
		
		Vehicle[] vehicles = new Vehicle[2];
		vehicles[0] = new Taxi();
		vehicles[1] = new Bus();
		
		for (Vehicle vehicle : vehicles) {
			driver.drive(vehicle);
		}

	}
}
