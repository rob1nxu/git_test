package com.rx.spring5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// using git with eclipse
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println(cricketCoach.getDailyAdvise());
		
		// close the context
		context.close();
	}

}
