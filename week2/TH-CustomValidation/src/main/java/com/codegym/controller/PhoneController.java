package com.codegym.controller;

import com.codegym.model.PhoneNumber;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class PhoneController {
    @GetMapping("/phone")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("phone", new PhoneNumber());
        return modelAndView;
    }
    @PostMapping("/validatePhone")
    public ModelAndView checkValidation (@Valid @ModelAttribute("phone") PhoneNumber phoneNumber, BindingResult bindingResult){
        new PhoneNumber().validate(phoneNumber, bindingResult);
        if (bindingResult.hasFieldErrors()){
            return new ModelAndView("index");
        }
        else {
            return new ModelAndView("result");
        }
    }
}