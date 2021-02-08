package bean_life;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean_Life.xml");
		IC coach=(IC)context.getBean("bkb");
		IC coach1=(IC)context.getBean("bkb");
//		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getDailyWorkout());
//		System.out.println(coach1.getDailyFortune());
		System.out.println(coach1.getDailyWorkout());
		((ClassPathXmlApplicationContext)context).close();
	}
}