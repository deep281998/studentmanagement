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
        studentrepository.addstudent(student);
        return "Added succesfully";
    }

    public Student getdetailusingpath(int regNo) {
        return studentrepository.getdetailusingpath(regNo);
    }

    public String delete(int regNo) {
        studentrepository.delete(regNo);
        return "delete successfully";
    }

    public String deletebypath(int regNo) {
        studentrepository.deletebypath(regNo);
        return "delete by path method";
    }

    public Student changecourse(int regNo, String course) {
        return studentrepository.changecourse(regNo,course);

    }

    public Student chnagecourseusingpath(int regNo, String course) {
        return studentrepository.chnagecourseusingpath(regNo,course);
    }
}
