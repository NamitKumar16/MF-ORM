package byValuebyObject;

public class Baseball implements Coach{
	
	private Ifortune ob;
	
	public Baseball(Ifortune ob) {
		this.ob=ob;
	}
	
	public void getDailyW() {
		System.out.println("Play");
	}
	
	public void getDailyFortune() {
		ob.getFortune();
	}

}
