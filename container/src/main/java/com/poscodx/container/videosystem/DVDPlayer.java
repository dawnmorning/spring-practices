package com.poscodx.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
		
	}

	// 주입(Injection)하기
	// Bean 생성메소드를 직접 호출하는 방법
	// 생성자 주입
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	public String play() {
		return dvd.play();
	}
}
