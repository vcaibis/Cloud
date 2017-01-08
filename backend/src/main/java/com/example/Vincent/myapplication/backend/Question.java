package com.example.Vincent.myapplication.backend;

import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 * Created by Vincent on 03.11.2016.
 */

@Entity
public class Question implements Serializable{

    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private static final long serialVersionUID = -7406082437623008161L;
    Long Id;
    private String title;
    private List<Answer> answers = new ArrayList();

    public Question() {

    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question(String title) {
        this.title = title;
    }

    public Long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
