package com.example.springboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
  @GetMapping("/")
  public String greeting() {
    return "hello";
  }

  @GetMapping("/greeting")
  public String greeting(@RequestParam(required = false) String message, Model model) {
    model.addAttribute("sample", message);
    return "hello";
  }
}
