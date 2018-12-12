class Person {

	// data is called instance variables (data or "state"
	String name;
	int age;

	// class is a blueprint for creating objects
	// in java, classes specify what objects are
	/*
	 * classes can contain 1. Data (in form of variables and instances) 2.
	 * Subroutines (methods)
	 */
	void speak() {
		for(int i=0; i<3; i++) {
			System.out.println("My name is: " + name + " and I am " + age + " years old");
		}
		
	}
	void sayHello() {
		System.out.println("Hello there!");
		
	}
}

public class app {

	public static void main(String[] args) {

		Person person1 = new Person();

		person1.name = "Joe Bloggs";
		person1.age = 37;
		person1.speak();
		person1.sayHello();

		Person person2 = new Person();
		person2.name = "Sara Smith";
		person2.age = 20;
		person2.speak();
		person2.sayHello();

		System.out.println(person1.name);
	}

}
