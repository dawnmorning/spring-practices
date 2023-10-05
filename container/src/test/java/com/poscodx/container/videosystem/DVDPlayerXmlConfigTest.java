package com.poscodx.container.videosystem;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
	
	@Autowired
	@Qualifier("avengerCaptainAmerica")
	DigitalVideoDisc dvd6;
	
	@Autowired
	@Qualifier("avengerDirectorEdition")
	DigitalVideoDisc dvd7;
	
	@Autowired
	DVDPack dvdPack;
	
	@Autowired
	@Qualifier("avengerExpansionEdition1")
	DigitalVideoDisc dvd9;
	
	@Autowired
	@Qualifier("avengerExpansionEdition2")
	DigitalVideoDisc dvd10;
	
	@Autowired
	@Qualifier("avengerExpansionEdition3")
	DigitalVideoDisc dvd11;
		
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
	
	@Test
	public void testDvd6NotNull() {
		assertNotNull(dvd6);
	}
	
	@Test
	public void testDvd7NotNull() {
		assertNotNull(dvd7);
	}
	
	@Test
	public void testDvd9NotNull() {
		assertNotNull(dvd9);
	}
	
	@Test
	public void testDvd10NotNull() {
		assertNotNull(dvd10);
	}
	
	@Test
	public void testDvd11NotNull() {
		assertNotNull(dvd11);
	}
	
	@Test
	public void testDVDPack() {
		assertNotNull(dvdPack);
	}
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdPlayer1;
	
	@Test
	public void testPlay1() {
		assertEquals("Playing Movie MARVEL's IronMan", dvdPlayer1.play());
	}
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdPlayer2;
	
	@Test
	public void testPlay2() {
		assertEquals("Playing Movie MARVEL's IronMan", dvdPlayer2.play());
	}
}
