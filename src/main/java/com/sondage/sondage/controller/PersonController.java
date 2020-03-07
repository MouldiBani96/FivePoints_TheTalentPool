package com.sondage.sondage.controller;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/create")
    public String create(@RequestParam(name="userName") String userName,@RequestParam(name="password") String password){
        Person newPerson = this.personService.createUser(userName,password);
        return newPerson.toString();
    }

}
