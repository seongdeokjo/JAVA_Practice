package ws1.java2.controller;
import ws1.java2.entity.*;
import java.util.*;
// 사용자 정의 클래스를 만들어서 사용할 수 있다. 
//class UserComparator implements Comparator<Vehicle> {
//	public int compare(Vehicle a, Vehicle b) {
//		// a 먼저 작성하고 b 와 비교하면 오름차순
//		// b 먼저 작성하고 a 와 비교하면 내림차순 
//		return a.getModelName().compareTo(b.getModelName());
//	}
//} 
public class VehicleManager {
	ArrayList<Vehicle> al = new ArrayList(7);
	public VehicleManager() {
		// 이메서드안에서 초기화되게 분리
		al.add(new Airplane("보잉747", 1300, 300, 4));
		al.add(new Airplane("F-15", 1600, 1, 1));
		al.add(new Car("그랜저", 180, 5, 10));
		al.add(new Car("스파크", 130, 4, 15));
		al.add(new Car("스타렉스", 150, 10, 11));
		al.add(new Ship("크루즈2", 30, 400, 35000));
		al.add(new Ship("노틸러스", 25, 150, 15000));
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
		for (int i = al.size() - 1; i >= 0; i--) { // 자바에서 문자열이 입력되면 1번재부터 세어지는게 아니라
													// 0번째 부터 시작함. 그래서 al.size()-1을 해주는것이다.
			Object o = al.get(i);
			model = (Vehicle) o;
			if (model.getModelName().equals(name)) {
				al.remove(i);
			}
		}
		System.out.println(name + " 가 삭제되었습니다. ");
	}
}
