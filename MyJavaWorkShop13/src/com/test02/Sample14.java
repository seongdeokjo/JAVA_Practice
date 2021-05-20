package com.test02;

import java.util.*;

class Fruit1 {
	String name;
	int weight;
	Fruit1(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	public String toString() {
		return name + "("+weight+")";
	}
}
class Apple1 extends Fruit1 {
	Apple1(String name, int weight) {
		super(name, weight);
	}
}
class Grape1 extends Fruit1 {
	Grape1(String name, int weight) {
		super(name, weight);
	}
}
class AppleComp implements Comparator<Apple1> {

	@Override
	public int compare(Apple1 o1, Apple1 o2) {
		
		return o2.weight - o1.weight;
	}
	
}
class GrapeComp implements Comparator<Grape1> {

	@Override
	public int compare(Grape1 o1, Grape1 o2) {

		return o2.weight - o1.weight;
	}
	
}
class FruitComp implements Comparator<Fruit1> {

	@Override
	public int compare(Fruit1 o1, Fruit1 o2) {
		// TODO Auto-generated method stub
		return o2.weight - o1.weight;
	}
	
}
class FruitBox1<T extends Fruit1> extends Box1<T> {}
class Box1<T> {
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	ArrayList<T> getList() {
		return list;
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
	
}
public class Sample14 {

	public static void main(String[] args) {
		FruitBox1<Apple1> appleBox = new FruitBox1<Apple1>();
		FruitBox1<Grape1> grapeBox = new FruitBox1<Grape1>();
		appleBox.add(new Apple1("GreenApple", 300));
		appleBox.add(new Apple1("GreenApple", 100));
		appleBox.add(new Apple1("GreenApple", 200));
		
		grapeBox.add(new Grape1("Greengrape",400));
		grapeBox.add(new Grape1("Greengrape",300));
		grapeBox.add(new Grape1("Greengrape",200));
		
		Collections.sort(appleBox.getList(), new AppleComp());
		Collections.sort(grapeBox.getList(), new GrapeComp());
		System.out.println(appleBox);
		System.out.println(grapeBox);
		Collections.sort(appleBox.getList(), new FruitComp());
		Collections.sort(grapeBox.getList(), new FruitComp());
		
		System.out.println(appleBox);
		System.out.println(grapeBox);
		
	}

}
