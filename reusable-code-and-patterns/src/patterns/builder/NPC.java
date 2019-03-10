package patterns.builder;

public class NPC implements NPCPlan{

	private String weapon;
	private String armor;
	private String ride;
	
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	public String getWeapon() {
		return weapon;
	}

	public String getArmor() {
		return armor;
	}

	public void setArmor(String armor) {
		this.armor = armor;
	}

	public String getRide() {
		return ride;
	}

	public void setRide(String ride) {
		this.ride = ride;
	}
	
	
}
