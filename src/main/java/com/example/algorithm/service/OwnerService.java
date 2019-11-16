package com.example.algorithm.service;

import com.example.algorithm.domain.Algorithm.Algorithm;
import com.example.algorithm.domain.User.Owner;

public interface OwnerService {


    public void publishAlgorithm(Owner owner, Algorithm algorithm);

    public void deleteAlgorithm(Owner owner,Algorithm algorithm);

    public void updateAlgorithm(Owner owner,Algorithm algorithm);


}
