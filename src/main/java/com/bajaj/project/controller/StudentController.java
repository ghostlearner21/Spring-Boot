package com.bajaj.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.bajaj.project.service.StudentDaoImpl;

@Controller
public class StudentController {
	
	@Autowired
	StudentDaoImpl studentService;
	
	@GetMapping("/form")
	public String studentForm() {
		return "student_form";
	}
	
	@PostMapping("/add")
	@ResponseBody
	public String addStudent(@RequestParam("id") int id , @RequestParam("age") int age, @RequestParam("name") String name) {
		studentService.addStudent(id, name, age);
		return "success";
	}

}
