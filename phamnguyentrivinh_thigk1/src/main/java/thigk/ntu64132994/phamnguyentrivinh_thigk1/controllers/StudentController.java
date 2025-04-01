package thigk.ntu64132994.phamnguyentrivinh_thigk1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    @GetMapping("/students")
    public String getStudents(Model model) {
        // Logic to retrieve student data can be added here
        return "student"; // Returns the student.html template
    }
}