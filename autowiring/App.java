package autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring3.xml");
        Employee emp = (Employee)context.getBean("employee");
        System.out.println(emp.toString());
    }

}
