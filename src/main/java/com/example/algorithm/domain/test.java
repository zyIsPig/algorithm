package com.example.algorithm.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class test {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

}
