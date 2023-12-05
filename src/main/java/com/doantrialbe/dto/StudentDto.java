package com.doantrialbe.dto;

import java.io.Serializable;


public class StudentDto{
    private Integer age;
    private Float grade;
    private String name;

    public StudentDto(Integer age, Float grade, String name) {
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public Float getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }
}