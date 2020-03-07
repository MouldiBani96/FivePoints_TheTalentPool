package com.sondage.sondage.db.service;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.model.PersonSubjects;
import com.sondage.sondage.db.model.Subject;
import com.sondage.sondage.db.repository.PersonSubjectsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.ZonedDateTime;
import java.util.List;

@Service
public class PersonSubjectsService {
    @Autowired
    private PersonSubjectsRepository personSubjectsRepository;

    public PersonSubjects createSubjectForPerson(ZonedDateTime date, Person person, Subject subject, String answer){
        return personSubjectsRepository.save(new PersonSubjects(date, person, subject, answer));
    }
    /*public List<Person> getAll(){
        return personSubjectsRepository.findAll();
    }*/


}
