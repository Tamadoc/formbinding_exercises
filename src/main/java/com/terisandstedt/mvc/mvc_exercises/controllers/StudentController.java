package com.terisandstedt.mvc.mvc_exercises.controllers;

import com.terisandstedt.mvc.mvc_exercises.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/show-form")
    public String showForm(Model model) {

        Student student = new Student();
        model.addAttribute("student", student);

        return "student-form";
    }

    @GetMapping("/process")
    public String processForm(@ModelAttribute("student") Student student) {
        return "student-confirmation";
    }
}
