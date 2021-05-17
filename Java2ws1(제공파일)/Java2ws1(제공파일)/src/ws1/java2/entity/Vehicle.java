package ws1.java2.entity;
import java.util.*;
public class Vehicle implements Comparator<Vehicle> {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;

	public String print() {
		return modelName + "(" + maxSpeed + ")";
	}
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
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
		

	}

	public String toString() {
		return "[modelName] : " + modelName + ", [maxSpeed] : " + maxSpeed + ", [numberLimit] :" + numberLimit;
	}


	@Override
	
	public int compare(Vehicle a, Vehicle b) {
		// a ���� �ۼ��ϰ� b �� ���ϸ� ��������
		// b ���� �ۼ��ϰ� a �� ���ϸ� �������� 
		return a.getModelName().compareTo(b.getModelName());
	}

//	@Override
//	public int compare(Vehicle o1, Vehicle o2) {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
