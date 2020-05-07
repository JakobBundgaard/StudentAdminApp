package com.example.demo.repositories;

import com.example.demo.models.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class FakeStudentRepo implements IStudentRepo{
    private List<Student> fakeStudentDatabase;

    public FakeStudentRepo() {
        this.fakeStudentDatabase = new ArrayList<Student>(
                Arrays.asList(
                        new Student(1, "Jakob", "Bundgaard", new Date(20190826), "110674-xxxx"),
                        new Student(2, "Jesper", "Preisler", new Date(20190826), "xxxxxx-xxxx"),
                        new Student(3, "Kristian", "Engberg", new Date(20190826), "xxxxxx-xxxx"),
                        new Student(4, "Christian", "Elmelund", new Date(20190826), "xxxxxx-xxxx")
                )
        );
    }

    @Override
    public boolean create(Student student) {
        return false;
    }

    @Override
    public Student read(int id_student) {
        for(Student stu : fakeStudentDatabase) {
            if(stu.getId_student() == id_student) {
            return stu;
            }
        }
        return null;
    }

    @Override
    public List<Student> readAll() {
        return fakeStudentDatabase;
    }

    @Override
    public boolean update(Student student) {
        return false;
    }

    @Override
    public boolean delete(int id_student) {
        return false;
    }
}
