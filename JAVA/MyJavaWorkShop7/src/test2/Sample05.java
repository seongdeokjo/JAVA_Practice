package test2;
class Animal1 {
	void breathing() {
		System.out.println("Animal breathing");
	}
}
class Dog1 extends Animal1 {
	void breathing() {
		System.out.println("Dog breathing");
	}
}
class Cat1 extends Animal1 {
	void breathing() {
		System.out.println("Cat breathing");
	}
}
public class Sample05 {
static Animal1 Creat(String animalName) {
	Animal1 a = null;
	switch(animalName) {
	case "Dog" :
		a = new Dog1();
		break;
	case "Cat" :
		a = new Cat1();
		break;
	}
	return a;
}
	public static void main(String[] args) {
		Animal1 a1 = new Dog1();
		a1.breathing();
		Animal1 a2 = new Cat1();
		a2.breathing();
	
	}
}
