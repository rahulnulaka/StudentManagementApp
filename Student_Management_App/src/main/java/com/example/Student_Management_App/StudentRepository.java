package com.example.Student_Management_App;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class StudentRepository {


    HashMap<Integer,Student> hash=new HashMap<>();
    public Student getStudent(int regno) {
        return hash.get(regno);
    }
}
