package ex1;

import java.io.*;
import java.util.ArrayList;

public class ObjectSerializable {

	public static void main(String[] args) {
		try {
			//인스턴스 저장
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Object.ser"));
			out.writeObject(new Circle(1,1,3.4));
			out.writeObject(new Circle(3,5,7.9));
			out.writeObject("hello");
			
			ArrayList<Circle> list = new ArrayList<>();
			list.add(new Circle(1,2,3.4));
			list.add(new Circle(5,6,7.8));
			list.add(new Circle(9,12,13.14));
			list.add(new Circle(31,32,33.34));
			out.writeObject(list);
			
			
					
			out.close();
			
			System.out.println("인스턴스 저장 완료");
			
			//인스턴스 복원
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("Object.ser"));
			
			//복원 순서는 저장순서에 맞게 복원 
			Circle c1 = (Circle)in.readObject();
			Circle c2 = (Circle)in.readObject();
			String str = (String) in.readObject();
			
			ArrayList<Circle> list2 = (ArrayList<Circle>) in.readObject();
			for(Circle a : list2) {
				a.showData();
			}
			
			System.out.println("복원된 인스턴스의 데이터를 출력");
			
			c1.showData();
			c2.showData();
			System.out.println(str);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}


class Circle implements Serializable{
	
	// implements Serializable : 직렬화 대상임을 의ㅁ미 
	
	int x;
	int y;
	double r;
	
	public Circle(int x, int y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public void showData() {
		System.out.println("원점["+x+", "+y+"]");
		System.out.println("반지름: "+r);
	}
	
	
}