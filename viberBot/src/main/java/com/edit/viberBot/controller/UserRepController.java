package com.edit.viberBot.controller;

import com.edit.viberBot.repository.UserRep;
import com.edit.viberBot.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class UserRepController {
    @Autowired
    UserRep repository;


   /* @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String Process() {
        repository.save(new User("1", "Jack", false));
        repository.save(new User("2", "JackDaniles", true));
        repository.save(new User("3", "CaptenMorgan", true));

        return "test";
    }*/

   /* @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String FindAll(Model model) {
        model.addAttribute("users", repository.findAll());
        return "users";
    }*/
}