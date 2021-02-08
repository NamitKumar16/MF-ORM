package MF;

public class Main {
    public static void main(String[] args) {
        IWorker fp = Factory.getObject();
//	    IWorker p = new Producer(fp);
        Consumer c = new Consumer(fp);
        c.consumer();
    }
}

