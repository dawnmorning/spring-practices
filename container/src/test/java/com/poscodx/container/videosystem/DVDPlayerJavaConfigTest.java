package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.poscodx.container.config.videosystem.DVDPlayerConfig;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { DVDPlayerConfig.class })
public class DVDPlayerJavaConfigTest {
	// 메서드와 이름이 같으면 스프링이 자동 인식
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 설정 클래스의 Bean생성 메소드의 @Bean의 name="dvdPlayer" 속성을 사용하기
	@Autowired
	@Qualifier("dvdPlayer")
	DVDPlayer dvdPlayer01;

	// 메서드와 이름이 같으면 스프링이 자동 인식
	// 같은 타입의 빈이 2개 이상 있는 경우
	// 설정 클래스의 Bean생성 메소드의 이름으로 Qualify 하기
	@Autowired
	@Qualifier("dvdPlayer02")
	DVDPlayer dvdPlayer02;
	
	@Autowired
	@Qualifier("dvdPlayer03")
	DVDPlayer dvdPlayer03;
	
	@Test
	public void testDvdPlayer01NotNull() {
		assertNotNull(dvdPlayer01);
	}

	@Test
	public void testPlay() {
		assertEquals("Playing Movie MARVEL's Avengers", dvdPlayer03.play());
	}

}
