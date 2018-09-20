package question_2;

abstract class animal
{
	 String colour,breed;
		abstract void eat();
		void speak() {
			System.out.println("Speak");
		}
		}
class Dog extends animal{
	public void eat() {
		System.out.println("Dog eats");
	}
	public void speak() {
		System.out.println("Dog barks");

	}
	public void print(String breed,String colour){

		this.colour=colour;
		this.breed = breed;
		System.out.println("colour " +colour);
		System.out.println("Breed " +breed);
	}
}

public class Animals {

	public static void main(String[] args){

		animal obj = new Dog();
		Dog obj1 = new Dog();
		obj.eat();
		obj.speak();
		obj1.eat();
		obj1.speak();
		obj1.print("Doberman","Black");
	}
	
}
