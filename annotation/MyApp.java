package annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring2.xml");
		
		CricketCoach cricket=(CricketCoach)context.getBean("ccoach",CricketCoach.class);
    	
//    	System.out.println(cricket.getDailyWorkout());
    	System.out.println(cricket.getDailyFortune());
    	TennisCoach tennis=(TennisCoach)context.getBean("tcoach",TennisCoach.class);
    	
//    	System.out.println(tennis.getDailyWorkout());
    	System.out.println(tennis.getDailyFortune());
	}

}