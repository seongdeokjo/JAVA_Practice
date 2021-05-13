package com.test.workshop3.doctor;

import java.util.*;


public class DoctorTest {

	public static void main(String[] args) {
	
		List<Dentist> dent = new ArrayList<Dentist>();
		List<Surgeon> surg = new ArrayList<Surgeon>();
		dent.add(new Dentist("홍길동","치과"));
//		dent.get(0).toString();
		System.out.println(dent.get(0));
		dent.get(0).treatPatient();
		dent.get(0).pullOutTooth();
//		for(int i =0; i< dent.size(); i++) {
//			System.out.println(dent.get(i));
//		}
//		
//		dent.add(new Dentist("전우치","치과"));
//		System.out.println(dent.get(1));
//		dent.get(1).treatPatient();
//		dent.get(1).pullOutTooth();
		
	
		surg.add(new Surgeon("광개토","외과"));
		surg.get(0);
		System.out.println(surg.get(0));
		surg.get(0).treatPatient();
		surg.get(0).performSurgery();
		System.out.println();
		surg.get(0);
		System.out.println(surg.get(0));
		surg.get(0).treatPatient();
		surg.get(0).performSurgery();
		// TODO 의사 정보 출력
	}
}