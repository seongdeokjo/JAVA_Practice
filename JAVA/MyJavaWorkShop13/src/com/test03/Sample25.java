package com.test03;
enum Transportation {
	Bus(100) {
		int fare(int distance) {
			return distance*Basic_Fare;
		}
	},
	Train(150) {
		int fare(int distance) {
			return distance*Basic_Fare;
		}
	},
	Ship(100) {
		int fare(int distance) {
			return distance*Basic_Fare;
		}
	},
	Airplane(300) {
		int fare(int distance) {
			return distance*Basic_Fare;
		}
	};
	protected final int Basic_Fare;	
	Transportation(int basicFare) {
		Basic_Fare = basicFare;
	}
	public int getBasicFare() {
		return Basic_Fare;
	}
	abstract int fare(int distance);
}
public class Sample25 {
	public static void main(String[] args) {
		System.out.println("bus fare ="+Transportation.Bus.fare(100));
		System.out.println("train fare ="+Transportation.Train.fare(100));
		System.out.println("ship fare="+ Transportation.Ship.fare(100));
		System.out.println("airplane fare="+Transportation.Airplane.fare(100));
	}
}