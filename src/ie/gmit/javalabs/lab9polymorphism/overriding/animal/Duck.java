package ie.gmit.javalabs.lab9polymorphism.overriding.animal;

public class Duck extends Animal{
	
	@Override
	public void speak() {
		System.out.println("Quack!");
	}
}
