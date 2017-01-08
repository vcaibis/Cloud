package com.example.Vincent.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by Vincent on 03.11.2016.
 */

@Entity
public class Answer implements Serializable{

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private static final long serialVersionUID = -7406082437623008161L;
    Long Id;
    String content;
    Question question;

    public Answer() {

    }

    public Answer(String content) {
        this.content = content;
    }

    public Long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
