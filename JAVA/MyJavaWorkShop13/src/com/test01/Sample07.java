package com.test01;

import java.util.*;

interface Eatable {}
class Fruit implements Eatable {
	public String toString() {
		return "Fruit";
	}
}
class Apple extends Fruit { 
	public String toString() {
		return "Apple";
	}
}
class Grape extends Fruit {
	public String toString() {
		return "Grape";
	}
}
class Toy {
	public String toString() {
		return "Toy";
	}
}
class FruitBox<T extends Fruit & Eatable> extends Box<T> {}
class Box<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
public class Sample07 {
	
	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<>();
		FruitBox<Apple> appleBox = new FruitBox<>();
		FruitBox<Grape> grapeBox = new FruitBox<>();
//		FruiBox<Toy> toy = new FruitBox<>(); 
//		FruitBox<Grape> grapeBox2 = new FruitBox<Apple>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
//		appleBox.add(new Grape());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox-"+ fruitBox);
		System.out.println("appleBox-"+ appleBox);
		System.out.println("grapeBox-"+ grapeBox);
	}

}
