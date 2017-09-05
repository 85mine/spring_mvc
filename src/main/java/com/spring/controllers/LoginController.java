package com.spring.controllers;

import com.spring.models.User;
import com.spring.services.login.LoginService;
import com.spring.validators.login.PostValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class LoginController {

    @Autowired
    public LoginService loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView get() {
        ModelAndView mav = new ModelAndView("/login");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ModelAndView post(PostValidator login, BindingResult result) {
        ModelAndView mav;
        if (result.hasErrors()) {
            mav = new ModelAndView("/login");
            return mav;
        }
        mav = new ModelAndView("/home");
        return mav;
    }

    @RequestMapping(value = "/logout")
    public ModelAndView logout() {
        return new ModelAndView("/login");
    }
}