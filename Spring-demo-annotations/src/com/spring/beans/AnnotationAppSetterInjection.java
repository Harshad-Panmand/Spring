package com.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.inteface.Coach;

public class AnnotationAppSetterInjection {

	public static void main(String[] args) {
		// Read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get bean from spring container
		Coach myTrackCoach = context.getBean("tableTennisCoach", Coach.class);

		// Call a method on bean
		System.out.println(myTrackCoach.getDailyWorkout());

		// Call the method for getting daily fortunes
		System.out.println(myTrackCoach.getDailyFortune());

		// Close the context
		context.close();
	}
}
