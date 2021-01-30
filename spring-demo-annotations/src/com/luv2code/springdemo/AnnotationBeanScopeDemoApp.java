package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println("pointing the Same object : " + (theCoach==alphaCoach));
		System.out.println("Memory Location : " + theCoach);
		System.out.println("Memory Location : " + alphaCoach);
		
		context.close();

	}

}
