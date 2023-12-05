package com.doantrialbe.repository;

import com.doantrialbe.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, Long> {
    @Override
    Optional<Student> findById(Long id);
}