package com.test.workshop3.doctor;
<<<<<<< HEAD
import java.util.*;
public class DoctorTest {
	public static void main(String[] args) {
		List<Dentist> dent = new ArrayList<Dentist>();		
		List<Surgeon> surg = new ArrayList<Surgeon>();	
//		Doctor doctor = new Doctor("�̼���","ġ��");
//		System.out.println(doctor); //toString ȣ��Ǹ鼭 �����
//		Object o = doctor;
//		System.out.println(o.toString());			
		dent.add(new Dentist("ȫ�浿")); // get(0)
		dent.add(new Dentist("��浿"));	//get(1)
//		System.out.println(dent.get(0));
//		dent.get(0).treatPatient();
//		dent.get(0).pullOutTooth();	
		//���� for ���� �̿�
		for(Dentist d : dent) {
			System.out.println(d);
			d.treatPatient();
			d.pullOutTooth();
			System.out.println();
		}
		System.out.println();		
		surg.add(new Surgeon("������"));
=======

import java.util.*;


public class DoctorTest {

	public static void main(String[] args) {
	
		List<Dentist> dent = new ArrayList<Dentist>();
		List<Surgeon> surg = new ArrayList<Surgeon>();
		dent.add(new Dentist("ȫ�浿","ġ��"));
//		dent.get(0).toString();
		System.out.println(dent.get(0));
		dent.get(0).treatPatient();
		dent.get(0).pullOutTooth();
//		for(int i =0; i< dent.size(); i++) {
//			System.out.println(dent.get(i));
//		}
//		
//		dent.add(new Dentist("����ġ","ġ��"));
//		System.out.println(dent.get(1));
//		dent.get(1).treatPatient();
//		dent.get(1).pullOutTooth();
		
	
		surg.add(new Surgeon("������","�ܰ�"));
		surg.get(0);
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
		System.out.println(surg.get(0));
		surg.get(0).treatPatient();
		surg.get(0).performSurgery();
		System.out.println();
<<<<<<< HEAD
=======
		surg.get(0);
		System.out.println(surg.get(0));
		surg.get(0).treatPatient();
		surg.get(0).performSurgery();
		// TODO �ǻ� ���� ���
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
	}
}