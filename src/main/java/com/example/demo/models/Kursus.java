package com.example.demo.models;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Kursus {
    public int id_kursus;
    public String kursusnavn;
    @DateTimeFormat(pattern = "yyyy-MM-dd") // needed for input field on html pages (in order to serve the right format)
    public Date startdato;
    public int etcs;
    public String kursusbeskrivelse;

    public Kursus(int id_kursus, String kursusnavn, Date startdato, int etcs, String kursusbeskrivelse) {
        this.id_kursus = id_kursus;
        this.kursusnavn = kursusnavn;
        this.startdato = startdato;
        this.etcs = etcs;
        this.kursusbeskrivelse = kursusbeskrivelse;
    }

    public Kursus() {}

    public int getId_kursus() {
        return id_kursus;
    }

    public void setId_kursus(int id_kursus) {
        this.id_kursus = id_kursus;
    }

    public String getKursusnavn() {
        return kursusnavn;
    }

    public void setKursusnavn(String kursusnavn) {
        this.kursusnavn = kursusnavn;
    }

    public Date getStartdato() {
        return startdato;
    }

    public void setStartdato(Date startdato) {
        this.startdato = startdato;
    }

    public int getEtcs() {
        return etcs;
    }

    public void setEtcs(int etcs) {
        this.etcs = etcs;
    }

    public String getKursusbeskrivelse() {
        return kursusbeskrivelse;
    }

    public void setKursusbeskrivelse(String kursusbeskrivelse) {
        this.kursusbeskrivelse = kursusbeskrivelse;
    }

    @Override
    public String toString() {
        return "Kursus{" +
                "id=" + id_kursus +
                ", Kursusnavn='" + kursusnavn + '\'' +
                ", Startdato='" + startdato + '\'' +
                ", Etcs=" + etcs +
                ", Kursusbeskrivelse='" + kursusbeskrivelse + '\'' +
                '}';
    }
}
