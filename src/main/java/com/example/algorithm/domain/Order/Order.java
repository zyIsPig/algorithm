package com.example.algorithm.domain.Order;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int status;

    @NotNull
    private int userId;

    @NotNull
    private int AlgorithmId;

    @NotNull
    private String time;

    @NotNull
    private int test;


}
