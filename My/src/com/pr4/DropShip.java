package com.pr4;

public class DropShip extends AirUnit implements Repairable {
	DropShip() {
		super(125);
		hitPoint = MAX_HP;
	}
	public String toString() {
		return "DropShip";
	}
}
