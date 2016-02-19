package com.ascendcorparation.ascend4;


public class Question {
    private int ID;
    private String QUESTION;

    public Question() {
        ID = 0;
        QUESTION = "";

    }

    public Question(String qUESTION) {

        QUESTION = qUESTION;
    }

    public int getID() {
        return ID;
    }

    public String getQUESTION() {
        return QUESTION;
    }

    public void setID(int id) {
        ID = id;
    }

    public void setQUESTION(String qUESTION) {
        QUESTION = qUESTION;
    }
}
