package com.example.algorithm.dao;

import com.example.algorithm.entity.Algorithm;

public interface AlgorithmDao
{
    int addAlgorithm(Algorithm algorithm);

    int updatePrice(long id,double newPrice);

    int updateIntro(long id,String newIntro);

    int updateCover(long id,String newCover);

    int updateCarousal(long id,String carousal);

    int ChangeStatus(long id);

    Algorithm findAlbyID(long id);

    Algorithm findAlbyName(String name);

    int gainPopularity(long id);

    int makeSale(long id);

    int changPath(long id,String path);



}
