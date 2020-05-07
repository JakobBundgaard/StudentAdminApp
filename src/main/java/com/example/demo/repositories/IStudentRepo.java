package com.example.demo.repositories;

import com.example.demo.models.Student;

import java.util.List;

public interface IStudentRepo {
    // CRUD operations
    public boolean create(Student student);

    public Student read(int id_student);

    public List<Student> readAll();

    public boolean update(Student student);

    public boolean delete(int id_student);
}
