package com.by.imooc.controller;

import com.by.imooc.entity.base.StudentDTO;
import com.by.imooc.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/findbyname")
    public List<StudentDTO> findByName(String name){
        System.out.println("naddme");
        System.out.println("naddme");
        System.out.println("naddme");
        System.out.println("naddme");
        return  studentService.findByName(name);
    }

    @PostMapping("/createone")
    public StudentDTO createOne(StudentDTO studentDTO){
       return studentService.createOne(studentDTO);
    }
}
