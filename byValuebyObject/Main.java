package byValuebyObject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("by.xml");
		
		Coach coach=(Coach)context.getBean("base");
		Cricket cricket = (Cricket)context.getBean("cricket");
		Address address = (Address)context.getBean("address");

		
		coach.getDailyW();
		coach.getDailyFortune();
		
		cricket.getEmail();
		
		address.getState();

	}

}

