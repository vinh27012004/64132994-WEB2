package ntu.vinh.springboot;

import org.springframework.stereotype.Controller;
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
    public String contact() {
        return "contact"; 
    }
	@GetMapping("addNew")
	public String addNew() {
		return "addnew"; 
	}
}
