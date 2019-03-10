package patterns.factory;

public class Demo {
	
	public static void main(String[] args) {
		
		AnimalFactory factory = new AnimalFactory();
		
		Animal sparky = factory.getAnimal("DOG");
		sparky.makeSound();
	}
}
