package com.example.demo.repositories;

import com.example.demo.models.Kursus;

import java.util.List;

public class FakeKursusRepo implements IKursusRepo{

    @Override
    public boolean create(Kursus kursus) {
        return false;
    }

    @Override
    public Kursus read(int id_kursus) {
        return null;
    }

    @Override
    public List<Kursus> readAll() {
        return null;
    }

    @Override
    public boolean update(Kursus kursus) {
        return false;
    }

    @Override
    public boolean delete(int id_kursus) {
        return false;
    }
}
