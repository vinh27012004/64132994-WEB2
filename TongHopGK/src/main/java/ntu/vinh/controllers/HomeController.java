package ntu.vinh.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeController {
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
        List<SinhVien> listSv = Arrays.asList(
            new SinhVien("SV001", "Nguyễn Văn A", 8.0),
            new SinhVien("SV002", "Trần Thị B", 7.5),
            new SinhVien("SV003", "Lê Văn C", 9.0)
        );
        model.addAttribute("dssv", listSv);
        model.addAttribute("content", "list");
        return "layout";
    }

    @GetMapping("/addnew")
    public String addNew() {
        return "addnew";
    }
}
