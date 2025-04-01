package thigk.ntu64132994.phamnguyentrivinh_thigk1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import thigk.ntu64132994.phamnguyentrivinh_thigk1.models.Student;
import thigk.ntu64132994.phamnguyentrivinh_thigk1.repositories.StudentRepository;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public String getStudents(Model model) {
        model.addAttribute("students", studentRepository.findAll());
        return "student";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("student", new Student());
        return "add-student";
    }

    @PostMapping("/add")
    public String addStudent(@ModelAttribute Student student) {
        studentRepository.save(student);
        return "redirect:/students";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        studentRepository.findById(id).ifPresent(student -> model.addAttribute("student", student));
        return "edit-student";
    }

    @PostMapping("/edit")
    public String editStudent(@ModelAttribute Student student) {
        studentRepository.update(student);
        return "redirect:/students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id) {
        studentRepository.deleteById(id);
        return "redirect:/students";
    }
}