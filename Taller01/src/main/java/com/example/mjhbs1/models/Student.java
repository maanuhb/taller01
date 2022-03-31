package com.example.mjhbs1.models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
  public final String firstName;
  public final String lastName;
  public final String idNumber;
  public final String birthdate;
  public Integer age;

  public Student( String firstName, String lastName, String idNumber, String birthdate){
     
      this.firstName = firstName;
      this.lastName = lastName;
      this.idNumber = idNumber;
      this.birthdate = birthdate;
      this.age = this.calculateAge(birthdate);
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