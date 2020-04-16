package com.spring.beans;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.inteface.Coach;

public class DefaultAnnotationApp {
	public static void main(String[] args) {
		// Read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Get bean from spring container
		Coach myDefaultTrackCoach = context.getBean("tennisCoachDefaultBean", Coach.class);
		
		// Call a method on bean
		System.out.println(myDefaultTrackCoach.getDailyWorkout());
		
		// Close the context
		context.close();
	}
}
