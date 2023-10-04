package com.poscodx.container.user.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.poscodx.container.config.user.AppConfig;

public class JavaConfigTest {

	public static void main(String[] args) {
		tsetJavaConfigTest();

	}

	private static void tsetJavaConfigTest() {
		new AnnotationConfigApplicationContext(AppConfig.class);
		
	}

}
