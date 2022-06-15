package textBasedGame;

public class Characters {
	private String name;
	private int health;
	private String catchPhrase;
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	
	public Characters(String name, int health, String catchPhrase) {
		this.name= name;
		this.health = health;
		this.catchPhrase=catchPhrase;
		
	}
	
	public void getInfo() {
		System.out.println("Name :"+ this.getName());
		System.out.println("Health :"+ this.getHealth());
		System.out.println("catchPhrase :"+ this.getCatchPhrase());
		
	}
	
	
}
