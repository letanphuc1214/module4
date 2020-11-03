package com.codegym.controller;

import com.codegym.model.Comment;
import com.codegym.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/comments")
    public ModelAndView showList(){
        ModelAndView modelAndView = new ModelAndView("list");
        List<Comment> comments = commentService.findAll();
        modelAndView.addObject("comments", comments);
        return modelAndView;
    }

    @GetMapping("/allcomment/{id}")
    public ModelAndView showList(@PathVariable("id") Long id){

        ModelAndView modelAndView = new ModelAndView("info");
        Comment comment = commentService.findOne(id);
        modelAndView.addObject("comment", comment);
        return modelAndView;
    }

    @PostMapping
    public String updateCustomer(Comment comment) {
        commentService.save(comment);
        return "redirect:/comments";
    }
}
