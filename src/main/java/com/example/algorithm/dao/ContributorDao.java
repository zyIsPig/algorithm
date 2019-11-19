package com.example.algorithm.dao;

import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Contributor;

import java.util.List;

public interface ContributorDao
{
    int addContributor(Contributor contributor);

    int updatePassword(long id,String password);

    int deleteContributor(Long id);

    List<Contributor> getContributors();

    Contributor findContributorbyID(long id);

    Contributor findContributorbyName(String name);

    int login(String username, String password);

    int setPhoto(long id, String Photo);

    int editIntro(long id,String intro);

}
