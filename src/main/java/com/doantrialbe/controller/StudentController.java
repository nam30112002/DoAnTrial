package com.doantrialbe.controller;

import com.doantrialbe.dto.StudentDto;
import com.doantrialbe.entity.Student;
import com.doantrialbe.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/")
    public ResponseEntity createStudent(@RequestBody StudentDto input) {
        Student student = studentService.createStudent(input);
        return ResponseEntity.ok().body(student);
    }
    @GetMapping("/all")
    public ResponseEntity getAllStudent() {
        List<Student> list = studentService.getAllStudent();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity getStudentById(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok().body(studentService.getStudentById(id));
    }
}
