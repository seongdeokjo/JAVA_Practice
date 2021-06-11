package com.test02;
enum Direction { EAST, SOUTH,WEST,NORTH}
public class Sample18 {

	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		Direction d4 = Direction.NORTH;
		System.out.println("d1=" + d1);
		System.out.println("d2=" + d2);
		System.out.println("d3=" + d3);
		
		System.out.println("d1==d2 ?"+ (d1==d2));
		System.out.println("d1==d3 ?"+(d1==d3));
		System.out.println("d1.equals(d3) ?"+d1.equals(d3));
//		System.out.println("d2 > d3 ?"+(d1 >d3));
		System.out.println("d1.compareTo(d3) ?"+ d1.compareTo(d3));
		System.out.println("d1.compareTo(d2) ?"+ d1.compareTo(d2));
		
		switch(d4) {
		case EAST : //direction.East라고 쓸수 없다.
			System.out.println("The Direction is East.");
			break;
		case NORTH :
			System.out.println("The Direction is South");
			break;
		case WEST :
			System.out.println("The Direction is West");
			break;
		case SOUTH :
			System.out.println("The Direction is North");
		
		default  : 
				System.out.println("Invalid direction");
				break;		
		}
		Direction[] dArr = Direction.values();
		for(Direction d : dArr) {
			System.out.printf("%s = %d%n",d.name(),d.ordinal());
		}
	}

}
