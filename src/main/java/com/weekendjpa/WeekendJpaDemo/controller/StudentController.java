package com.weekendjpa.WeekendJpaDemo.controller;

import com.weekendjpa.WeekendJpaDemo.domain.Student;
import com.weekendjpa.WeekendJpaDemo.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by abhi on 06/01/18.
 */

@RestController
public class StudentController {

    @Autowired
    private StudentRepo studentRepo;

    @GetMapping(value="/getstudents")
    public List<Student> getdata(){

        List<Student> list=studentRepo.findAll();

        return list;
    }

    @PostMapping(value="/savestu")
    public String saveData(@RequestBody Student student){

        studentRepo.save(student);

        return "Data saved";
    }

    @GetMapping(value="/getstudent/{name}")
    public Student getStu(@PathVariable String name){

        Student list=studentRepo.findByName(name);

        return list;
    }

    @GetMapping(value="/updatestudent/{id}/{name}")
    public String updateStu(@PathVariable Integer id,@PathVariable String name){

        Student list=studentRepo.findById(id);
        list.setName(name);
        studentRepo.save(list);

        return "Data updated successfully";
    }

}
