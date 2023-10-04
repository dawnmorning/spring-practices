package com.poscodx.container.config.user;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.poscodx.container.user.Friend;

@Configuration
// 01.xml파일 합쳐놓은 어노테이션
@ComponentScan(basePackages = {"com.poscodx.container.user"} )
public class AppConfig {
	
	@Bean
	public Friend friend() {
		return new Friend("마이콜");
	}
}
