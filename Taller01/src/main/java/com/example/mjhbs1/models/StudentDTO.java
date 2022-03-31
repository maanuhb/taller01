package com.example.mjhbs1.models;

import javax.validation.constraints.*;
import javax.validation.constraints.Pattern.Flag;
import lombok.Data;

@Data
public class StudentDTO {
	
	@NotNull(message = "firstName")
	@Size(min = 1, message = "You can't leave this emptyccccc. ")
	private String firstName;

	@NotNull(message = "lastName")
	@Size(min = 1, message = "You can't leave this empty.xxxxxxxxx ")
	private String lastName;

	@NotNull(message = "You can't leave this empty.vvvv ")
	@Pattern(regexp = "^\\d{8}$", message = "The uca code is invalid.")
	private String idNumber;

	@Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/((19[0-9][0-9])|(200[0-9]|201[0-5]))$", flags = { Flag.CASE_INSENSITIVE }, message = "Invalid date of birthday")
	private String birthdate;
	
	
	public Student toStudent() {
		
		return new Student(firstName,lastName,idNumber, birthdate);
	}
	 
	
}
