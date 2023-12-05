package com.doantrialbe.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "class", schema = "do_an_trial")
public class Class {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "classSerial", length = 45)
    private String classSerial;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "ownerId")
    private Integer ownerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassSerial() {
        return classSerial;
    }

    public void setClassSerial(String classSerial) {
        this.classSerial = classSerial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

}