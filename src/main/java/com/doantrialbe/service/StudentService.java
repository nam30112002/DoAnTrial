package com.doantrialbe.service;

import com.doantrialbe.dto.StudentDto;
import com.doantrialbe.entity.Student;
import com.doantrialbe.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(StudentDto studentDto){
        Student student = new Student();
        student.setName(studentDto.getName());
        student.setAge(studentDto.getAge());
        student.setGrade(studentDto.getGrade());
        return studentRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public StudentDto getStudentById(Long id) throws Exception {
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isEmpty()) throw new Exception();
        Student student = optional.get();
        return new StudentDto(student.getAge(),student.getGrade(),student.getName());
    }
}
