package com.test03;
interface Fightable extends Movable,Attackable { }
interface Movable { 
	void move(int x, int y); 
	}
interface Attackable {
	void attack(Unit u);
}
class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {
		
	}
	public void attack (Unit u) {
		
	}
}
class Unit {
	int currentHP;
	int x;
	int y;
}
public class Sample05 {

	public static void main(String[] args) {
	Fighter f = new Fighter();
	if(f instanceof Unit) {
		System.out.println("f�� unitŬ������ �ڼ��Դϴ�.");
	}
	if(f instanceof Fightable) {
		System.out.println("f�� fightable �������̽��� �����߽��ϴ�.");
	}
	if(f instanceof Movable) {
		System.out.println("f�� movable �������̽��� �����߽��ϴ�. ");
	}
	if(f instanceof Attackable) {
		System.out.println("f�� attackable�� �������̽��� �����ؽ��ϴ�.");
	}
	if(f instanceof Object) {
		System.out.println("f�� object Ŭ������ �ڼ��Դϴ�.");
	}
	}

}
