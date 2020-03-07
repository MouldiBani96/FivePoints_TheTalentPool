package com.sondage.sondage.controller;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {
    @Autowired
    private PersonService personService;

    @GetMapping({"/"})
    public String index(Person person){
        return "index";
    }

    @PostMapping(value = "/login")
    public String checklogin(Person person){
        String userName = person.getUserName();
        String password = person.getPassword();

        Boolean n = this.personService.checkLogin(userName, password);
        if(this.personService.checkLogin(userName,password)){
            Person currentUser = this.personService.findOnePersonByUserNameAndPassword(userName, password);
            this.personService.setCurrentUser(currentUser);
            return "home";
        }
        return "index";
    }

}
