package annotation;
public class Baseball implements Coach{
private IFortune ifortune;

	
	public Baseball(IFortune ifortune) {
		this.ifortune = ifortune;
    }

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Practice Baseball";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return ifortune.getDailyFortune();
	}

}