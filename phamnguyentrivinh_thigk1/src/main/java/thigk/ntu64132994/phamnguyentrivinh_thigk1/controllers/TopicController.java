package thigk.ntu64132994.phamnguyentrivinh_thigk1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import thigk.ntu64132994.phamnguyentrivinh_thigk1.models.Topic;
import thigk.ntu64132994.phamnguyentrivinh_thigk1.repositories.TopicRepository;

@Controller
@RequestMapping("/topics")
public class TopicController {

    @Autowired
    private TopicRepository topicRepository;

    @GetMapping
    public String getTopics(Model model) {
        model.addAttribute("topics", topicRepository.findAll());
        return "topic";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("topic", new Topic());
        return "add-topic";
    }

    @PostMapping("/add")
    public String addTopic(@ModelAttribute Topic topic) {
        topicRepository.save(topic);
        return "redirect:/topics";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        topicRepository.findById(id).ifPresent(topic -> model.addAttribute("topic", topic));
        return "edit-topic";
    }

    @PostMapping("/edit")
    public String editTopic(@ModelAttribute Topic topic) {
        topicRepository.update(topic);
        return "redirect:/topics";
    }

    @GetMapping("/delete/{id}")
    public String deleteTopic(@PathVariable int id) {
        topicRepository.deleteById(id);
        return "redirect:/topics";
    }
}