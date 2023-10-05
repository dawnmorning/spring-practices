package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = { "classpath:com/poscodx/container/config/videosystem/applicationContext.xml" })
public class DVDPlayerXmlConfigTest {
	// interface 주입
//	@Autowired
	// xml Bean Configuration (Avengers)에서는 자동으로 id를 부여하지 않는다.
	// @Qualifier를 사용할 수 없다.
	DigitalVideoDisc dvd1;
	
	@Autowired
	@Qualifier("ironMan")
	DigitalVideoDisc dvd2;
	
	@Autowired
	@Qualifier("avengerInfiniteWar")
	DigitalVideoDisc dvd3;
	
	@Autowired
	@Qualifier("avengerEndgame")
	DigitalVideoDisc dvd4;
	
	@Autowired
	@Qualifier("avengerAgeOfUltron")
	DigitalVideoDisc dvd5;
	
	@Disabled
	@Test
	public void testDvd1NotNull() {
		assertNotNull(dvd1);
	}
	
	@Test
	public void testDvd2NotNull() {
		assertNotNull(dvd2);
	}
	
	@Test
	public void testDvd3NotNull() {
		assertNotNull(dvd3);
	}
	
	@Test
	public void testDvd4NotNull() {
		assertNotNull(dvd4);
	}
	
	@Test
	public void testDvd5NotNull() {
		assertNotNull(dvd5);
	}
}
