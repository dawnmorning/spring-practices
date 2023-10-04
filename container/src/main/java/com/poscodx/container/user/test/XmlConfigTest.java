package com.poscodx.container.user.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.poscodx.container.user.User;

public class XmlConfigTest {
	public static void main(String[] args) {
		// XML Auto Configuration(Annotation Scanning)
//		testBeanFactory01();

		// XML Bean Configuration(Explicit Configuration)
//		testBeanFactor02();

		// XML AutoConfiguration
		// testApplicationContext01();

		// XML Bean Configuration(Explicit Configuration)
		testApplicationContext02();
	}

	private static void testApplicationContext02() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/poscodx/container/user/applicationContext02.xml");
		User user = null;
		
		// Type 으로 bean 가져옴
		user = ac.getBean(User.class);
		System.out.println(user.getName());
		
		// id로 bean 가져옴
		// Annotation Scan(Explicit Configuration) 에서는 Bean id가 자동으로 부여되지 않음("user")
		user = (User) ac.getBean("user");
		System.out.println(user.getName());
		
		// name으로 bean 가져옴
		user = (User) ac.getBean("usr");
		System.out.println(user.getName());
	}

	private static void testApplicationContext01() {
		ApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/poscodx/container/user/applicationContext01.xml");
		User user = null;
		user = ac.getBean(User.class);
		System.out.println(user.getName());

		// Annotation Scan(Auto Configuration) 에서는 Bean id가 자동으로 부여된다("user")
		user = (User) ac.getBean("user");
		System.out.println(user.getName());
	}

	private static void testBeanFactor02() {
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscodx/container/user/applicationContext02.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}

	private static void testBeanFactory01() {
		BeanFactory bf = new XmlBeanFactory(
				new ClassPathResource("com/poscodx/container/user/applicationContext01.xml"));
		User user = bf.getBean(User.class);
		System.out.println(user.getName());
	}
}
