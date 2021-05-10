package scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Prototype
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("scope.xml");
		ICouch coach=(ICouch)context.getBean("TC1");
		coach.setName("Namit");
		ICouch coach1 = (ICouch)context.getBean("TC1");
		coach1.setName("Kumar");
//		System.out.println("The Name of the Coach is : ");
		System.out.println(coach+"\n"+coach1);
		System.out.println("The Object is equal : "+coach.equals(coach1));
		System.out.println(coach.getName()+"\n"+coach1.getName());
		((ClassPathXmlApplicationContext)context).close();
	}
}