package com.example.studentmangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentrepository;
    public Student getdetail(int regNo) {
        return studentrepository.getdetail(regNo);
    }

    public String addstudent(Student student) {
        StudentRepository.addstudent(student);
        return "Added succesfully";
    }
}
