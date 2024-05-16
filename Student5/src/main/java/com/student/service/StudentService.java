package com.student.service;

import java.util.List;

import com.student.entites.Student;

public interface StudentService  {
	
	public Student studentSave(Student student);
	
	public List<Student>getStudent();
	
	public Student getSinglerecord(Long studentId);
	
	public void getDeliterecord(Long studentId);
	

}
