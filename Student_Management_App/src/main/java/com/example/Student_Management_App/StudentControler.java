package com.example.Student_Management_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Student")
public class StudentControler {
    @Autowired
    StudentService studentservice;
    @GetMapping("/get")
    public Student getStudent(@RequestParam("q") int regNo){
        return studentservice.getStudent(regNo);
    }

}
