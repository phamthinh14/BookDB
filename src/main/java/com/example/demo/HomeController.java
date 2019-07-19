package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    BookDBRepository bookDBRepository;

    @RequestMapping("/")
    public String listCourse(Model model) {
        model.addAttribute("courses", bookDBRepository.findAll());
        return "list";
    }

}
