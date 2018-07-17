package com.edit.viberBot.controller;

import com.edit.viberBot.model.Route;
import com.edit.viberBot.model.User;
import com.edit.viberBot.repository.RouteRep;
import com.edit.viberBot.repository.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;


@Controller
public class RouteRepController {
    @Autowired
    RouteRep repository;

    @RequestMapping(value = "/save", method = RequestMethod.GET)
    public String SaveRoutes() {
        LocalDate d =  LocalDate.now();
        LocalTime t = LocalTime.now();
        Date date = Date.from(d.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        Time time = new Time(t.getHour(), t.getMinute(), t.getSecond());

        repository.save(new Route("pozicija5","pozicija6",date,time,12));

        return "test2";
    }

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public String FindAll(Model model) {
        model.addAttribute("routes", repository.findAll());
        return "Routes";
    }
}
