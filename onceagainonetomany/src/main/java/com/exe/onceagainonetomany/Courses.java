package com.exe.onceagainonetomany;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Courses")
public class Courses {

	@Id
    private int CId;    
private String CourseName;    
public int getCId() {
	return CId;
}
public void setCId(int CId) {
	this.CId = CId;
}
public String getCourseName() {
	return CourseName;
}
public void setCourseName(String Coursename) {
	this.CourseName = Coursename;
}


}
