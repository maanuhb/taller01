package com.example.mjhbs1.models;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class student {
	String dep; 
	String name;
	String lastName;
	String idNumber;
	String birthdate;
	
	  public student(String dep, String name, String lastName, String idNumber, String birthdate) {
        this.dep = dep;
        this.name = name;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthdate = birthdate;
    }
	  private Integer calculateAge(String lastAge) {
		    try {
		      SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		      Date currentDate = new Date();
		      long age = (currentDate.getTime() - sdf.parse(lastAge).getTime())/1000/31557600;
		      if (age <= 0){
		        return -1;
		      }

		      return (int) age;
		    }catch (ParseException e) {
		      System.out.println(e);
		      return -1;
		    }
		  }
	
	
}