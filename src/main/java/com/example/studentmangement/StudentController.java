package com.example.studentmangement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class StudentController {

    Map<Integer,Student> db = new HashMap<>();

    @GetMapping("/get")
    public Student getdetail(@RequestParam("q") int regNo){

        return db.get(regNo);
    }

    @PostMapping("/add")
    public String addstudent(@RequestBody Student student){
        db.put(student.getRegNo() , student);
        return "Student added";
    }

    @GetMapping("/bypath/{q}")
    public Student getdetailusingpath(@PathVariable("q") int regNo){
        return db.get(regNo);
    }

    @DeleteMapping("/delete")
    public String delete(@RequestParam("q") int regNo){
        db.remove(regNo);
        return "student deleted";
    }

    @DeleteMapping("/deletebypath/{q}")
    public String deletebypath(@PathVariable("q") int regNo){
        db.remove(regNo);
        return "student deleted";
    }

    @PutMapping("/put")
    public Student changecourse(@RequestParam("q") int regNo , @RequestParam("course") String course){
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

    @PutMapping("/putbypath/{q}/{co}")
    public Student chnagecourseusingpath(@PathVariable("q") int regNo , @PathVariable("co") String course){
        db.get(regNo).setCourse(course);
        return db.get(regNo);
    }

}
