package patterns.factory;

public class AnimalFactory {
	
	public Animal getAnimal(String species) {
		
		if (species == null) return null;
		if (species.equalsIgnoreCase("dog")) return new Dog();
		
		return null;
	}
}
