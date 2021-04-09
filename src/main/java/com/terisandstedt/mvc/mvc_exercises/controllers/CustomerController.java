package com.terisandstedt.mvc.mvc_exercises.controllers;

import com.terisandstedt.mvc.mvc_exercises.model.Customer;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController implements WebMvcConfigurer {

    private Customer customer;

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(false);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @PostMapping("/")
    public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult result) {
        if (result.hasErrors()) {
            return "customer-form";
        } else {
            if (customer.getDetails().getStreet().isEmpty()) {
                customer.getDetails().setStreet("Default street");
            }
            if (customer.getDetails().getPostcode().isEmpty()) {
                customer.getDetails().setPostcode("12345");
            }
            if (customer.getDetails().getCity().isEmpty()) {
                customer.getDetails().setCity("Default city");
            }
            if (customer.getDetails().getHomePhone().isEmpty()) {
                customer.getDetails().setHomePhone("1234-567 89");
            }
            if (customer.getDetails().getMobilePhone().isEmpty()) {
                customer.getDetails().setMobilePhone("123-456 7890");
            }

            return "customer-confirmation";
        }
    }
}
