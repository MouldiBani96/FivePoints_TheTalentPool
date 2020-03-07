package com.sondage.sondage.db.service;

import com.sondage.sondage.db.model.Person;
import com.sondage.sondage.db.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    private Person currentPerson;

    public Person createUser(String userName, String password){
        return personRepository.save(new Person(userName, password));
    }
    public List<Person> getAll(){
        return personRepository.findAll();
    }

    public Boolean checkLogin (String userName, String password){
        return null !=this.personRepository.findByUserNameAndPassword(userName, password);
    }

    public Person findOnePersonByUserNameAndPassword(String userName, String password){
        return this.personRepository.findByUserNameAndPassword(userName, password);
    }

    public void setCurrentUser(Person currentPerson){
        this.currentPerson = currentPerson;
    }

    public Person getCurrentPerson(){
        return this.currentPerson;
    }

}
