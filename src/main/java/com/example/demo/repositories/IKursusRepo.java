package com.example.demo.repositories;

import com.example.demo.models.Kursus;

import java.util.List;

public interface IKursusRepo {
    public boolean create(Kursus kursus);

        public Kursus read(int id_kursus);

        public List<Kursus> readAll();

        public boolean update(Kursus kursus);

        public boolean delete(int id_kursus);


}
