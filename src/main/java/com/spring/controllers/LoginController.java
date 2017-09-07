//package com.spring.controllers;
//
//import com.spring.services.login.LoginService;
//import com.spring.validators.login.PostValidator;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.validation.Valid;
//
//@Controller
//public class LoginController {
//
//    @Autowired
//    public LoginService loginService;
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String get(ModelMap model) {
//        model.addAttribute("loginForm", new PostValidator());
//        return "/login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String post(@ModelAttribute("loginForm") @Valid PostValidator login, BindingResult result) {
//        if (result.hasErrors()) {
//            return "/login";
//        }
//        return "/home";
//    }
//
//    @RequestMapping(value = "/logout")
//    public ModelAndView logout() {
//        return new ModelAndView("/login");
//    }
//}