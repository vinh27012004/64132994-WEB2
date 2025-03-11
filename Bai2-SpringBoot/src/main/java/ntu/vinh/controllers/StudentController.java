package ntu.vinh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.vinh.models.Student;

@Controller
public class StudentController {
	@GetMapping("/student")
    public String studentInfo(Model model) {
        // Tạo đối tượng sinh viên
        Student student = new Student("64132994", "Phạm Nguyễn Trí Vinh", 2004, "Nam");

        // Đưa dữ liệu vào Model để truyền sang View
        model.addAttribute("student", student);

        return "student"; // Trả về trang student.html
    }

}
