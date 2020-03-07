package com.sondage.sondage.controller;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoteController {


    @Autowired
    PersonService personService;
    @GetMapping("/vote")
    public String vote(){
        return "vote";
    }


}
