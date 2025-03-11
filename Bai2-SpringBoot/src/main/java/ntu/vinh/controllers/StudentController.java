package ntu.vinh.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ntu.vinh.models.Student;

@Controllers
public class StudentController {
	@GetMapping("/student")
    public String studentInfo(Model model) {
        // Tạo đối tượng sinh viên
        Student student = new Student("SV001", "Nguyễn Văn A", 2002, "Nam");

        // Đưa dữ liệu vào Model để truyền sang View
        model.addAttribute("student", student);

        return "student"; // Trả về trang student.html
    }

}
