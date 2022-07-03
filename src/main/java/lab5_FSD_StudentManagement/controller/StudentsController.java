package lab5_FSD_StudentManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import lab5_FSD_StudentManagement.entity.Student;
import lab5_FSD_StudentManagement.service.StudentService;

@Controller
@RequestMapping("/students")
public class StudentsController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("/list")
	
	public String handleListStudents(Model theModel) {

		List<Student> students = studentService.listAll();

		theModel.addAttribute("students", students);

		return "students-lister";
	}

}
