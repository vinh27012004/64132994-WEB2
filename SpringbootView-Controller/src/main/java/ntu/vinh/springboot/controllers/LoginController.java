package ntu.vinh.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {	

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // This will return the login.html template
    }

    @PostMapping("/login")
    public String handleLogin(
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        if ("admin".equals(username) && "admin".equals(password)) {
            model.addAttribute("message", "Đăng nhập thành công");
        } else {
            model.addAttribute("message", "Lỗi unsername hoặc password");
        }

        return "login";
    }
}