package patterns.builder;

public class KnightBlueprint implements NPCManual{

	private NPC knight;
	
	public KnightBlueprint(NPC knight) {
		
		this.knight = knight;
	}
	
	
	@Override
	public void giveWeapon() {
		knight.setWeapon("Long Sword");
	}

	@Override
	public void giveArmor() {
		knight.setArmor("Heavy Armor");
	}

	@Override
	public void giveRide() {
		knight.setRide("Horse");
	}

	@Override
	public NPC getNPC() {
		return this.knight;
	}
	
	

}
