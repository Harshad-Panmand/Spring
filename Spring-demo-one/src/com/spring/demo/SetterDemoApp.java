package com.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("cricketCoach", CricketCoach.class);

		// Call the method on bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		// Close the context
		context.close();
	}

}
