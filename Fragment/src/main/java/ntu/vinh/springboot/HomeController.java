package ntu.vinh.springboot;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index"; // Trả về template index.html
    }

    @GetMapping("/about")
    public String about() {
        return "about"; // Trả về template about.html
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact"; // Trả về template contact.html
    }
}

