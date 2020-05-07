package com.example.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Student {
    public int id_student;
    public String fornavn;
    public String efternavn;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // needed for input field on html pages (in order to serve the right format)
    public Date startdato;
    public String cpr;

    public Student(int id_student, String fornavn, String efternavn, Date startdato, String cpr) {
        this.id_student = id_student;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.startdato = startdato;
        this.cpr = cpr;
    }


    public Student() {}

    public int getId_student() {
        return id_student;
    }

    public void setId_student(int id_student) {
        this.id_student = id_student;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public Date getStartdato() {
        return startdato;
    }

    public void setStartdato(Date startdato) {
        this.startdato = startdato;
    }

    public String getCpr() {
        return cpr;
    }

    public void setCpr(String cpr) {
        this.cpr = cpr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id_student +
                ", Fornavn='" + fornavn + '\'' +
                ", Efternavn='" + efternavn + '\'' +
                ", Startdato=" + startdato +
                ", CPR='" + cpr + '\'' +
                '}';
    }
}
