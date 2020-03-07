package com.sondage.sondage.db.model;

import org.springframework.data.annotation.Id;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;

public class PersonSubjects {
    @Id
    String id;
    ZonedDateTime timeAnswerQuestion;
    String answer;
    Person person;
    private Subject subject;

    public PersonSubjects(ZonedDateTime timeAnswerQuestion, Person person, Subject subject, String answer) {
        this.timeAnswerQuestion = timeAnswerQuestion;
        this.person = person;
        this.subject = subject;
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public ZonedDateTime getTimeAnswerQuestion() {
        return timeAnswerQuestion;
    }

    public void setTimeAnswerQuestion(ZonedDateTime timeAnswerQuestion) {
        this.timeAnswerQuestion = timeAnswerQuestion;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
