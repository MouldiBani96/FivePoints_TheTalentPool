package com.sondage.sondage.db.repository;

import com.sondage.sondage.db.model.PersonSubjects;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonSubjectsRepository extends MongoRepository<PersonSubjects,String> {
}
