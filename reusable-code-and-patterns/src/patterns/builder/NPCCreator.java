package patterns.builder;

public class NPCCreator {

	private NPCManual blueprint;
	
	public NPCCreator(NPCManual blueprint) {
		
		this.blueprint = blueprint;
	}
	
	
	public void createNPC () {
		
		this.blueprint.giveWeapon();
		this.blueprint.giveArmor();
		this.blueprint.giveRide();
	}
	
	public NPC getNPC() {
		
		return this.blueprint.getNPC();
	}
}
