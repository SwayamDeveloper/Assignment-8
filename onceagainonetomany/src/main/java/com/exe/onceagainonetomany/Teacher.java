package com.exe.onceagainonetomany;

import java.util.ArrayList;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import java.util.*;


 

@Entity  
@Table(name="Teacher")  
public class Teacher {    
      
	@Id
	@PrimaryKeyJoinColumn
  
private int Id;    
private String TeacherName;        

public int getId() {
	return Id;
}
public void setId(int id) {
	this.Id = id;
}
public String getTeacherName() {
	return TeacherName;
}
public void setTeacherName(String teacherName) {
	TeacherName = teacherName;
}

public List<Courses> getLaptop() {
	return laptop;
}
public void setLaptop(List<Courses> laptop) {
	this.laptop = laptop;
}

@OneToMany(cascade = CascadeType.ALL)

List<Courses> laptop = new ArrayList<>();  
 

  
}  

