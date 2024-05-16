package com.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entites.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@PostMapping("/save")
	public String saveStudentSave(@RequestBody Student student) {
		 studentService.studentSave(student);
		return "Data is succesfully update";
	}
		@GetMapping("/all")
		public List<Student> getStudent (){
			List<Student>allStudentList=studentService.getStudent();
			return allStudentList;
				
		}
		@GetMapping("/{id}")
		public Student getStudentSingleRecord(@PathVariable("id") Long id) {
			//studentService.getStudentSinglerecord(id);
			return studentService.getSinglerecord(id);
		}
		
		
		/*@DeleteMapping("/delete{id}")
		public String getStudentDeleteRecord(@PathVariable("id")Long id) {
			studentService.getDeliterecord(id);
			return "Student record delete successfully";
		}*/
		
		
		@DeleteMapping("/delete/{id}")
		public ResponseEntity<?> deleteStudent(@PathVariable Long id) {
		    // Logic to delete student record
			studentService.getDeliterecord(id);
		    return ResponseEntity.ok().build();
		}

}



