package ws1.java2.entity;
import java.util.*;
public class Vehicle implements Comparator<Vehicle> {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	public Vehicle() {}
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + modelName);
		System.out.println(" 최고속도 : " + maxSpeed + "km/h");
		System.out.println(" 최대정원 : " + numberLimit + "명");
		

	}

	public String toString() {
		return "[modelName] : " + modelName + ", [maxSpeed] : " + maxSpeed + ", [numberLimit] :" + numberLimit;
	}


	@Override
	
	public int compare(Vehicle a, Vehicle b) {
		// a 먼저 작성하고 b 와 비교하면 오름차순
		// b 먼저 작성하고 a 와 비교하면 내림차순 
		return a.getModelName().compareTo(b.getModelName());
	}

//	@Override
//	public int compare(Vehicle o1, Vehicle o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
