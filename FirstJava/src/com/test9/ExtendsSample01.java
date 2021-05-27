package com.test9;

class Car{
	int gasolinegauge;
	Car(int gas){
		this.gasolinegauge = gas;
	}
}
class HybridCar extends Car {
	int electronicGauge;
	HybridCar(int gas, int eg) {
		super(gas);
		electronicGauge = eg;
	}
	HybridCar(int gas) {
		super(gas);
	}
}
class HybridWaterCar extends HybridCar {
	int waterGauge;
	HybridWaterCar(int gas) {
		super(gas);
	}
	HybridWaterCar(int gas, int eg) {
		super(gas, eg);
	}
	HybridWaterCar(int gas, int eg,int waterGauge) {
		super(gas, eg);
		this.waterGauge = waterGauge;
	}
	
	public void showCrrentGauge() {
		System.out.println("잔여 가솔린 : "+ gasolinegauge);
		System.out.println("잔여 가솔린 : "+electronicGauge);
		System.out.println("잔여 가솔린 : "+ waterGauge);
	}
}
public class ExtendsSample01 {
	
	public static void main(String[] args) {
		HybridWaterCar car = new HybridWaterCar(50,30,40);
		car.showCrrentGauge();
	}
}
