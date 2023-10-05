package com.poscodx.container.config.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.videosystem.Avengers;
import com.poscodx.container.videosystem.DVDPlayer;
import com.poscodx.container.videosystem.DigitalVideoDisc;

@Configuration
public class DVDPlayerConfig {
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}

	// 주입(Injection)하기
	// Bean 생성메소드를 직접 호출하는 방법
	// 생성자 주입
	@Bean("dvdPlayer")
	public DVDPlayer dvdPlayer() {
		// 메서드 이름이 id
		return new DVDPlayer(avengers());
	}

	// 주입(Injection)하기 2
	// parameter로 Bean 생성 방법
	// 생성자 주입
	@Bean
	public DVDPlayer dvdPlayer02(DigitalVideoDisc dvd) {
		return new DVDPlayer(dvd);
	}

	// 주입(Injection)하기 3
	// setter로 Bean 생성 방법
	// 생성자 주입
	@Bean
	public DVDPlayer dvdPlayer03(DigitalVideoDisc dvd) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDvd(dvd);
		return dvdPlayer;
	}
}
