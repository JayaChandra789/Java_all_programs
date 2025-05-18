package javaAdvance;
import java.util.*;

public class Students 
 {
	/*=======Private member varaibles========*/
	 private String name;
	 private int id,rollNo,standard,age;
	 
	 /*======Parameterised Constructor======*/
	 Students(String name,int id,int standard,int age,int rollNo)
	 {
		 this.name=name;
		 this.id=id;
		 this.rollNo=rollNo;
		 this.standard=standard;
		 this.age=age;
	 }/*======Parameterised Constructor======*/
	 
	 /*==============Encapsulation Implementation using method get & set=============*/
	 
	 /*=====================Set Method==========================*/
	 public void setStName(String name)
	 {
		 this.name=name;;
	 }/*=====================Get Method==========================*/
	 public String getStName()
	 {
		 return name;
	 }
	 
	 /*=====================Set Method==========================*/
	 public void setStId(int id)
	 {
		 this.id=id;
	 }/*=====================Get Method==========================*/
	 public int getStId()
	 {
		 return id;
	 }
	 /*=====================Set Method==========================*/
	 public void setStStandard(int Standard)
	 {
		 this.standard=standard;
	 }/*=====================Get Method==========================*/
	 public int getStStandard()
	 {
		 return standard;
	 }
	 /*=====================Set Method==========================*/
	 public void setStAge(int age)
	 {
		 this.age=age;
	 }/*=====================Get Method==========================*/
	 public int getStAge()
	 {
		 return age;
	 }
	 /*=====================Set Method==========================*/
	 public void setStRollNo(int rollNo)
	 {
		 this.rollNo=rollNo;
	 }/*=====================Get Method==========================*/
	 public int getStRollNo()
	 {
		 return rollNo;
	 }
	// toString method to display student information
	    @Override
	    public String toString() 
	    {
	        return "Student Name: " + name + "\nStudent ID: " + id + 
	               "\nStandard: " + standard + "\nAge: " + age + "\nRoll No: " + rollNo;
	    }
 }

