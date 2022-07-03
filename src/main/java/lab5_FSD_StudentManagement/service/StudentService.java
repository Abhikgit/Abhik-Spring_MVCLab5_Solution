package lab5_FSD_StudentManagement.service;

import java.util.List;

import lab5_FSD_StudentManagement.entity.Student;


public interface StudentService {

	List<Student> listAll();

	Student findById(int theId);

	void save(Student thestudent);

	void deleteById(int theId);

}