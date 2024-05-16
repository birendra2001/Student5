package com.student.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entites.Student;
import com.student.repository.StudentRepository;
import com.student.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	public StudentRepository studentRepository;

	@Override
	public Student studentSave(Student student) {
		// TODO Auto-generated method stub
		return  studentRepository.save(student);
	}

	public List<Student> getStudent() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getSinglerecord(Long studentId) {
		// TODO Auto-generated method stub
		return studentRepository.findById(studentId).orElseThrow();
	}
	
	@Override
	public void getDeliterecord(Long studentId) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(studentId);
		
		
	}

	
	

	}


