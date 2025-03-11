package ntu.vinh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ChaoController {
	@RequestMapping("/")
	public String trangchu(ModelMap	model) {
	model.addAttribute("message", "Chào mừng bạn đến với Spring MVC");
	return "hello";
	}
}
