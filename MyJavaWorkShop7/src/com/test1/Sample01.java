package com.test1;
class Animal {
	void breathing() {
		System.out.println("Animal Breathing");	}
}
class Dog extends Animal {
	void barking() {
		System.out.println("Dog Barking");}
}
class Cat extends Animal {
	void meowing() {
		System.out.println("cat me0wing");{
	}
}
public static class Sample01 {
	static void test (Dog d) {}
	static void test2(Cat c) {}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.barking();
		dog.breathing();
		//참조변수의 형변환
		Animal animal = dog; //implicit cast
		animal.breathing();
		
		Dog dog2 = (Dog)animal; //explic casts
		dog2.barking();
		dog2.barking();
		
		Object obj = dog;
		Dog obj2 = (Dog)obj; 
	}	
}
}
