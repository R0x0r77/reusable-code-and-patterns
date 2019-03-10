package patterns.factory;

public class Dog extends Animal{

	int weight;
	String name;
	
	public Dog() {}
	
	public Dog(int weight, String name) {
		
		this.weight = weight;
		this.name = name;
	}
	
	void makeSound() {
		System.out.println("bark");
	}
}
