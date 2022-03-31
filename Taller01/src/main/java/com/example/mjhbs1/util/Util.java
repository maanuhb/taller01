package com.example.mjhbs1.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Util {
  private static final String DATE_FORMAT = "dd/MM/yyyy";

  public static boolean isDateValid(String strDate) {
    
    if(strDate==null || strDate.isEmpty())return false;
    
    DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
    sdf.setLenient(false);
    
    try {
      sdf.parse(strDate);
    } catch (ParseException e) {
      return false;
    }
    return true;
  }


}