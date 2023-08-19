package com.example.studentmangement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

     Map<Integer,Student> db = new HashMap<>();

    public  void addstudent(Student student) {
        db.put(student.getRegNo() , student);
    }

    public Student getdetail(int regNo) {
        return db.get(regNo);
    }

    public Student getdetailusingpath(int regNo) {
        return db.get(regNo);
    }

    public void delete(int regNo) {
        db.remove(regNo);
    }

    public void deletebypath(int regNo) {
        db.remove(regNo);
    }

    public Student changecourse(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    public Student chnagecourseusingpath(int regNo, String course) {
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }
}
