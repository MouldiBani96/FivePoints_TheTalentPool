package com.sondage.sondage.controller;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class RegisterController {


    @Autowired
    PersonService personService;
    @GetMapping("/register")
    public String register(Person person){
        return "register";
    }

    @PostMapping(value = "/createPerson")
    public String create(Person person){

        Person newPerson = this.personService.createUser(person.getUserName(),person.getPassword());
        if( null!= newPerson)
            return "vote";
        return this.register(person);
    }
}
