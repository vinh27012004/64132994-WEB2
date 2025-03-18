package ntu.vinh.springboot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TruyenHoTen {
	
	@GetMapping("/v1")
	public String showTruyenHoTenForm() {
		return "v1";
	}
	
	@GetMapping("/v2")
	public String handleTruyenHoTen(
			@RequestParam String hoTen,
			Model model) {
		
		model.addAttribute("message", "Xin chào " + hoTen);
		
		return "v2";
	}

}
