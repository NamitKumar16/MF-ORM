package sp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
     IWorker fp = (IWorker)context.getBean("producer", IWorker.class);
//	    IWorker p = new Producer(fp);
        Consumer c = new Consumer(fp);
        c.consumer();
    }
}

