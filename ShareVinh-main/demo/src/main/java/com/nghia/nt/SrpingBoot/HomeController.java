package com.nghia.nt.SrpingBoot;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
@Controller
public class HomeController {
    
    public ArrayList<Student> list = new ArrayList<>();
    
    public HomeController() {
        list.add(new Student("SV001", "Nguyễn Văn A", 8.5));
        list.add(new Student("SV002", "Trần Thị B", 9.0));
        list.add(new Student("SV003", "Lê Văn C", 7.8));
        list.add(new Student("SV004", "Phạm Thị D", 8.2));
        list.add(new Student("SV005", "Hoàng Văn E", 9.5));
        list.add(new Student("SV006", "Đỗ Thị F", 8.7));
        list.add(new Student("SV007", "Vũ Văn G", 8.9));
        list.add(new Student("SV008", "Mai Thị H", 7.5));
        list.add(new Student("SV009", "Lý Văn I", 8.8));
        list.add(new Student("SV010", "Bùi Thị K", 9.2));
    }
    
    @GetMapping("/")
    public String home(ModelMap model) {
        return "Home";
    }

    @GetMapping("/about")
    public String about(ModelMap model) {
        return "About";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        model.addAttribute("listSV", list);
        return "List";
    }
    @GetMapping("/addnew")
    public String displayaddnew(ModelMap model) {
        model.addAttribute("listSV", list);
        return "Addnew";
    }
    @PostMapping("/addnew")
    public String addnew(ModelMap model,String studentId,String name,double averageScore) {
        list.add(new Student(studentId, name, averageScore));
        model.addAttribute("listSV", list);
        return "Addnew";
    }
}