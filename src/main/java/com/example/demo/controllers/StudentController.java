package com.example.demo.controllers;


import com.example.demo.models.Student;
import com.example.demo.repositories.FakeStudentRepo;
import com.example.demo.repositories.IStudentRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    private IStudentRepo studentRepository;

    public StudentController() {
        studentRepository = new FakeStudentRepo();
}

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("students", studentRepository.readAll());
        return "index";
    }

    @GetMapping("/student")
    @ResponseBody
    public String getStudentByParameter(@RequestParam int id_student) {
        Student stu = studentRepository.read(id_student);
        return "Studerende: " + stu.getFornavn() + " " + stu.getEfternavn() + " Startdato: " + stu.getStartdato();
    }

}
