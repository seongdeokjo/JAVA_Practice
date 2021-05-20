package com.test01;
class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}
class Fish {}

class Manager<T extends Animal>{
	T animal;
	Manager(T animal) {
		this.animal	= animal;
	}
//	public String toString(T obj1) {
//		return obj1.toString();
//	}
	public T getObject() {
		return this.animal;
	}
}
public class Sample06 {

	public static void main(String[] args) {
		Manager<Dog> dog = new Manager<>(new Dog());
//		Manager<Fish> fish	= new Manager<>(new Fish()); Ÿ�Թ̽���ġ �����߻� :  Ÿ�� �Ű������� ���� fishŬ������ animalŬ������ ��ӹް� ���� �ʱ� ������ 
		Manager<Cat> cat = new Manager<>(new Cat());
	}

}
