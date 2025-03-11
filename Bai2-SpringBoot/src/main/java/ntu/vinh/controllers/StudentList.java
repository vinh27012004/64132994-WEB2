package ntu.vinh.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.vinh.models.Student;
@Controller
public class StudentList {
	@GetMapping("/studentlist")
	public String studentList(Model model) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("64132994", "Phạm Nguyễn Trí Vinh", 2004, "Nam"));
		students.add(new Student("64132995", "Nguyễn Văn A", 2004, "Nam"));
		
		model.addAttribute("students", students);
		
		return "studentlist";
	}

}
