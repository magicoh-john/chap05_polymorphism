package com.javalab.polymorphism.pkg07;

public class AnimalMain {
	public static void main(String[] args) {
		
		// 1. 객체를 생성해서 자신의 타입에 저장(다형성 아님)
		System.out.println("[1. 자손 객체를 생성해서 자손 타입 변수에 저장(다형성 아님)]");
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();
		cat.sound();

		System.out.println();
		
		// 2. 다형성 적용, 변수의 자동 타입변환
		// 객체를 생성해서 부모 타입에 저장함.
		System.out.println("[2. 다형성 적용, 자동 타입 변환 + 오버라이딩 메소드 호출]");
		
		Animal animal = null; // 추상클래스 객체 생성 안됨.
		
		animal = new Dog();	// 자동 타입 변환
		animal.sound();		// 오버라이딩 메소드 호출
		
		animal = new Cat();	// 자동 타입 변환
		animal.sound();		// 오버라이딩 메소드 호출
		System.out.println();
		
		// 3. 매개변수의 다형성
		System.out.println("[3. 다형성 적용 매개 변수의 다형성  + 자동 타입 변환]");
		animalSound(dog);
		animalSound(animal); // animal에는 Cat객체의 주소 있음.
		System.out.println();
		
		Animal[] animals = new Animal[2];
		animals[0] = new Dog();
		animals[1] = new Cat();
		for (Animal ani : animals) {
			animalSound(ani);
		}
	}

	public static void animalSound(Animal animal ) {
		animal.sound(); // 오버로딩 메소드 호출
	}

}