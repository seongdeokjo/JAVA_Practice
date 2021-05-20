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
//		Manager<Fish> fish	= new Manager<>(new Fish()); 타입미스매치 오류발생 :  타입 매개변수의 제한 fish클래스가 animal클래스를 상속받고 있지 않기 때문에 
		Manager<Cat> cat = new Manager<>(new Cat());
	}

}
