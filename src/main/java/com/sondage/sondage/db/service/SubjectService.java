package com.sondage.sondage.db.service;

import com.sondage.sondage.db.model.Subject;
import com.sondage.sondage.db.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    @Autowired
    private SubjectRepository subjectRepository;

    public Subject createSubject(String title, String description){
        return subjectRepository.save(new Subject(title, description));
    }


}
