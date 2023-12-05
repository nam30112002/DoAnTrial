package com.doantrialbe.entity;

import jakarta.persistence.*;
//c32ddb8ee95cbab2a76f52cb519a6f18cd2eb556
@Entity
@Table(name = "student", schema = "do_an_trial")
public class Student {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "age")
    private Integer age;

    @Column(name = "grade")
    private Float grade;

    @Column(name = "name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getGrade() {
        return grade;
    }

    public void setGrade(Float grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}