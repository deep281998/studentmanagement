package com.example.studentmangement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db = new HashMap<>();

    public static void addstudent(Student student) {
        db.put(student.getRegNo() , student);
    }

    public Student getdetail(int regNo) {
        return db.get(regNo);
    }
}
