package ntu.vinh.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
// Thay package theo đúng project của bạn

@Controller
public class HomeController {

    private final List<SinhVien> studentList = new ArrayList<>();

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("students", studentList);
        return "list";
    }

    @GetMapping("/addnew")
    public String showAddForm() {
        return "addnew";
    }

    @PostMapping("/addnew")
    public String addStudent(@RequestParam String mssv,
                             @RequestParam String hoTen,
                             @RequestParam double diemTb) {
        studentList.add(new SinhVien(mssv, hoTen, diemTb));
        return "redirect:/list";
    }
}
