package com.example.android.wednesday.models;

/**
 * Created by hp pc on 3/22/2017.
 */

public class AnswerModel {

    public String answer;
    public String answerId;
    public Upvotes upvotes;

    public AnswerModel(){}

    public AnswerModel(String answer, Upvotes upvotes){
        this.answer = answer;
        this.upvotes = upvotes;
    }
}
