package com.test.workshop3.doctor;
<<<<<<< HEAD
public class Doctor {
    private String name;
    private String department;
    public Doctor() {
=======

public class Doctor {
    
    private String name;
    private String department;
    public Doctor() {
    	
>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
    }
    public Doctor( String name, String department ) {
        this.name = name;
        this.department = department;
    }
    @Override
    public String toString() {
        return department + " : " + name + " 선생님";
    }
<<<<<<< HEAD
    public void treatPatient() {
        System.out.println( "환자를 진료합니다." );
    }
=======
    
    public void treatPatient() {
        System.out.println( "환자를 진료합니다." );
    }
    

>>>>>>> e63fdffb62c4da06ea739f21cc74794b436ab200
}