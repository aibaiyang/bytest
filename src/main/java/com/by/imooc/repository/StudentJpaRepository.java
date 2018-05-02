package com.by.imooc.repository;

import com.by.imooc.entity.Student;
import com.by.imooc.entity.base.StudentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentJpaRepository extends JpaRepository<Student,Integer> {

    @Query("select s from Student s where s.name = ?1")
    List<StudentDTO> findByName(String name);

    StudentDTO save(StudentDTO studentDTO);

    @Query("select s from Student s where  s.id in (:ids)")
    List<StudentDTO> findByID(@Param("ids") List<Integer> ids);
}
