package com.by.imooc.service;

import com.by.imooc.entity.Student;
import com.by.imooc.entity.base.StudentDTO;
import com.by.imooc.repository.StudentJpaRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentJpaRepository studentJpaRepository;

    public List<StudentDTO> findByName(String name){
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(1));
        list.add(new Integer(2));
        studentJpaRepository.findByID(list);
        System.out.println(studentJpaRepository.findByID(list));
//        return studentJpaRepository.findByName(name);
        return studentJpaRepository.findByID(list);
    }

    public StudentDTO createOne(StudentDTO studentDTO){
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO,student);
        return studentJpaRepository.save(studentDTO);

    }
}
