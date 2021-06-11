package com.test01;
public class Sample03 {
	public static void main(String[] args) {
			Dog dog = new Dog();
			dog.barking();
			 dog.breathing();
			Cat cat = new Cat();
			cat.breathing();
			cat.meowing();
			
//			Animal animal = dog; // upcasting
//		 	animal.breathing(); // type = animal 인데 해당되는 메서드가 재정의된게 있으면 그 메서드가 호출된다.
//			Animal animal2 = cat;
			
			checkAnimal(dog);
			checkAnimal(cat);
	}
	static void checkAnimal(Animal animal ) {
		animal.breathing();
	}
}
