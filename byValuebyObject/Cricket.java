package byValuebyObject;

public class Cricket{
	private String email;
	private String team;
	
	Cricket(String team){
		this.team=team;
		System.out.println("Team India");
	}
	public void getEmail() {
		System.out.println(email);
	}

	public void setEmail(String email) {
		
		System.out.println("Mail");
		this.email = email;
	}

}
