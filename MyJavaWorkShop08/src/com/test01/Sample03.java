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
//		 	animal.breathing(); // type = animal �ε� �ش�Ǵ� �޼��尡 �����ǵȰ� ������ �� �޼��尡 ȣ��ȴ�.
//			Animal animal2 = cat;
			
			checkAnimal(dog);
			checkAnimal(cat);
	}
	static void checkAnimal(Animal animal ) {
		animal.breathing();
	}
}
