package thigk.ntu64132994.phamnguyentrivinh_thigk1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopicController {

    @GetMapping("/topics")
    public String getTopics(Model model) {
        return "topics";
    }
}