package com.test7;

class Car{
	int gasolinegauge;
}
class HybridCar extends Car {
	int electronicGauge;
	HybridCar(int gasolinegauge, int electronicGauge) {
		super();
		this.electronicGauge = electronicGauge;
	}
}
class HybridWaterCar extends HybridCar {
	int waterGauge;
	HybridWaterCar(int gasolinegauge, int electronicGauge,int waterGauge) {
		super(gasolinegauge, electronicGauge);
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
