package ws1.java2.controller;

import ws1.java2.entity.*;
import java.util.*;
// ����� ���� Ŭ������ ���� ����� �� �ִ�. 
//class UserComparator implements Comparator<Vehicle> {
//	public int compare(Vehicle a, Vehicle b) {
//		// a ���� �ۼ��ϰ� b �� ���ϸ� ��������
//		// b ���� �ۼ��ϰ� a �� ���ϸ� �������� 
//		return a.getModelName().compareTo(b.getModelName());
//	}
//} 

public class VehicleManager {

	ArrayList<Vehicle> al = new ArrayList(7);

	public VehicleManager() {
		// �̸޼���ȿ��� �ʱ�ȭ�ǰ� �и�
		al.add(new Airplane("����747", 1300, 300, 4));
		al.add(new Airplane("F-15", 1600, 1, 1));
		al.add(new Car("�׷���", 180, 5, 10));
		al.add(new Car("����ũ", 130, 4, 15));
		al.add(new Car("��Ÿ����", 150, 10, 11));
		al.add(new Ship("ũ����2", 30, 400, 35000));
		al.add(new Ship("��ƿ����", 25, 150, 15000));

	}

	public void sortBymodelName(String input) {
		System.out.println(input);
		Collections.sort(al, new Vehicle());
		for (Vehicle vehicle : al) {
			System.out.print("[" + vehicle.getModelName() + "]" + ", ");
			// vehicle.displayInfo();
			// System.out.println(vehicle.toString());

		}

	}

	public void displayVehicles1() {
		for (int i = 0; i < al.size(); i++) {
			Object o = al.get(i);
			Vehicle a = (Vehicle) o;
			a.displayInfo();
		}
	}

	public void displayVehicles2() {
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object o = itr.next();
			Vehicle v = (Vehicle) o;
			v.displayInfo();
		}
	}

	public void delete(String name) {
		Vehicle model = new Vehicle();

		for (int i = al.size() - 1; i >= 0; i--) { // �ڹٿ��� ���ڿ��� �ԷµǸ� 1������� �������°� �ƴ϶�
													// 0��° ���� ������. �׷��� al.size()-1�� ���ִ°��̴�.
			Object o = al.get(i);
			model = (Vehicle) o;
			if (model.getModelName().equals(name)) {
				al.remove(i);
			}
		}
		System.out.println(name + " �� �����Ǿ����ϴ�. ");

	}
}
