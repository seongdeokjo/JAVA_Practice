package test2;

class Animal {
	void breathing() {
		System.out.println("Animal Breathing");	}
}
class Dog extends Animal {
	void breathing() {
		System.out.println("Dog Breathing");	}
	void barking() {System.out.println("Dog Barking");}
}
class BlackDog extends Dog {
	void running() { System.out.println("BlackDog Running");}
}
class Cat extends Animal {
	void meowing() {System.out.println("cat me0wing");}	
}
public class Sample01 {
	static Animal test(Animal a) {
		Animal a2 = null;
		String name = a.getClass().getName();
		switch(name) {
		case "Dog" :
			a2 = new Dog();
			break;
		case "BlackDog" :
			a2 = new BlackDog();
			break;
		}
		return a2;
	}

	public static void main(String[] args) {
		Animal ob = new Dog();
		ob.breathing();
		
		
		
//		BlackDog bkDog = new BlackDog();
//		Dog dog5 = bkDog;
//		Animal animal4 = dog5;
//		BlackDog bkDog2= (BlackDog)animal4;
//		Dog dog6 = (Dog)animal4;
//		dog6.barking();
//		dog6.breathing();
//		
//		BlackDog bkDog3 = new BlackDog();
//		Animal obj2 = bkDog3;
//		
//		Animal obj = new BlackDog(); // blackDog ��ü�� ����� AnimalŸ������ ����ȯ 
//		obj.breathing();
//		
//		Dog dog7 = new Dog();
//		Animal obj3 = new Dog(); //dog ��ü�� ����� animal Ÿ������ ����ȯ 
//		obj3.breathing();
//		
//		// ���갥 
//		Animal obj4 = test(new BlackDog());
//		Animal obj5 = test(new Dog());
//		System.out.println(test(dog5));
		
		
		
		
//		Dog dog = new Dog();
//		Animal animal = dog;
//		Dog dog2 = (Dog)animal;
		
		
//		Dog dog3 = new Dog();
//		Animal animal2 = dog3 ;
//		
//		Cat cat = (Cat)animal2; //���� ����(x)
//		 ��ü�� ������� �������� ���� ĳ������ x 
//		Animal animal3 = new Animal();
//		Dog dog4 = (Dog)animal3;
	}
}
