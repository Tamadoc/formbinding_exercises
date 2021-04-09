package com.terisandstedt.mvc.mvc_exercises.controllers;

import com.terisandstedt.mvc.mvc_exercises.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @GetMapping("/hello")
    public String showForm(Model model) {
        model.addAttribute("student", new Student());
        return "hello-form";
    }

    @GetMapping("/process")
    public String processForm(@ModelAttribute("student") Student student) {

        return "hello-confirmation";
    }

    @GetMapping("/shout")
    public String letsShout(@RequestParam("studentName") String name, Model model) {
        name = name.toUpperCase();

        String result = "Hey, " + name + "!";
        model.addAttribute("message", result);

        return "hello-confirmation";
    }
}
