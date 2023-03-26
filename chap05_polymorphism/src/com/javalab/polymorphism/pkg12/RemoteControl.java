package com.javalab.polymorphism.pkg12;

/**
 * 리모컨 기능만 있는 TV
 */
public interface RemoteControl {
	//상수(public static은 생략가능)
	public static int MAX_VOLUME = 10;
	public static int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	public void setVolume(int volume);
}