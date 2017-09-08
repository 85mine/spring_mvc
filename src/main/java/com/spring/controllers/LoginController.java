package com.spring.controllers;

import com.spring.services.login.LoginService;
import com.spring.validators.login.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView get(@RequestParam(required = false) boolean error) {
        ModelAndView mav = new ModelAndView("/login");
        if (error) {
            mav.addObject("error", error);
        }
        mav.addObject("loginForm", new PostValidator());
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@ModelAttribute("loginForm") @Valid PostValidator login, BindingResult result) {
        if (result.hasErrors()) {
            return "/login";
        }
        return "/login";
    }
}