package com.sondage.sondage.controller;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.model.PersonSubjects;
import com.sondage.sondage.db.model.Subject;
import com.sondage.sondage.db.service.PersonService;
import com.sondage.sondage.db.service.PersonSubjectsService;
import com.sondage.sondage.db.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.UUID;

@Controller
public class SubjectController {
    @Autowired
    private SubjectService subjectService;
    @Autowired
    private PersonService personService;
    @Autowired
    private PersonSubjectsService personSubjectsService;
    @GetMapping({"/subject"})
    public String index(Subject subject){
        return "subject";
    }

    @PostMapping(value = "/createSubject")
    public String createSubject(Subject subject){
        Subject newSubject = this.subjectService.createSubject(subject.getTitle(), subject.getDescription());
        if(null == newSubject)
            return "subject";
        Person currentPerson = this.personService.getCurrentPerson();
        if(null == currentPerson)
            return "index";

        ZonedDateTime now = ZonedDateTime.now(ZoneOffset.UTC);
        String answer = "yes";
        PersonSubjects addSubjectToPerson =  this.personSubjectsService.createSubjectForPerson(now,currentPerson,newSubject,answer);
        if(null == addSubjectToPerson)
            return "index";

        return "home";

    }
}
