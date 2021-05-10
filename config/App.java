package config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configApp.class");
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("configApp.class");
		//get the bean
		        Coach coach7 = context.getBean("cricketCoach", CricketCoach.class);
		        System.out.println(coach7.getRoutine());

		        CricketCoach coach10 = context.getBean("ccoach7", CricketCoach.class);
		        System.out.println(coach10.display());
	}

}
