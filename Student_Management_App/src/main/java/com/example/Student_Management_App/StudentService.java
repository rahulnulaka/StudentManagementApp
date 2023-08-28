package com.example.Student_Management_App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentrepository;
    public Student getStudent(int regno){
        return studentrepository.getStudent(regno);
    }

}
