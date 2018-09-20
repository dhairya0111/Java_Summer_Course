package assignment_7;

public interface Animals {

		void eat();
		void speak();

public static void main(String[] args) {
	  dog obj=new dog();
    obj.speak();
    obj.eat();
    Cat obj1=new Cat();
    obj1.speak();
    obj1.eat();
	}
}