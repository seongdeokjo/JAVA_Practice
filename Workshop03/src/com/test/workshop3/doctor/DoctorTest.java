package com.test.workshop3.doctor;
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
		System.out.println(surg.get(0));
		surg.get(0).treatPatient();
		surg.get(0).performSurgery();
		System.out.println();
	}
}