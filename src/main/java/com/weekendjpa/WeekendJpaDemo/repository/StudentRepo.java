package com.weekendjpa.WeekendJpaDemo.repository;

import com.weekendjpa.WeekendJpaDemo.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by abhi on 06/01/18.
 */
public interface StudentRepo extends JpaRepository<Student,Integer> {

    Student findByName(String name);

    Student findById(Integer id);
}
