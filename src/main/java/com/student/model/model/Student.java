package com.student.model.model;

import java.util.Objects;

public class Student {
   private int id;
   private String FirstName;
   private String LName;
   private String email;
   private String Mobile;
public Student() {
	super();
}
public Student(String firstName, String lName, String email, String mobile) {
	super();
	FirstName = firstName;
	LName = lName;
	this.email = email;
	Mobile = mobile;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLName() {
	return LName;
}
public void setLName(String lName) {
	LName = lName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMobile() {
	return Mobile;
}
public void setMobile(String mobile) {
	Mobile = mobile;
}
@Override
public String toString() {
	return "Student [id=" + id + ", FirstName=" + FirstName + ", LName=" + LName + ", email=" + email + ", Mobile="
			+ Mobile + "]";
}

   
}
