package com.example.algorithm.dao;

import com.example.algorithm.util.MD5Util;
import com.example.algorithm.entity.Algorithm;
import com.example.algorithm.entity.Contributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ContributorDaoImp implements ContributorDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addContributor(Contributor contributor)
    {
        String sql = "insert into Contributor(Name,Password,Email,Createdtime,Photo) " +
                "values(?,?,?,now(),?)";
        return (int) jdbcTemplate.update(sql, contributor.getName(), MD5Util.string2MD5(contributor.getPassword()), contributor.getEmail(), contributor.getPhoto());
    }

    @Override
    public int updatePassword(long id, String password)
    {
        password = MD5Util.string2MD5(password);
        String sql = "UPDATE Contributor SET Password = ? where ID = ?";
        return jdbcTemplate.update(sql,password,id);
    }

    @Override
    public int deleteContributor(Long id)
    {
        return 0;
    }

    @Override
    public List<Contributor> getContributors()
    {
        return null;
    }

    @Override
    public Contributor findContributorbyID(long id)
    {
        return null;
    }

    @Override
    public Contributor findContributorbyName(String name)
    {
        return null;
    }

    @Override
    public int login(String username, String password)
    {
        password = MD5Util.string2MD5(password);
        String sql = "select count(*) from Contributor where Name=? and Password=?";
        return jdbcTemplate.queryForObject(sql, Integer.class, username, password);
    }

    @Override
    public int setPhoto(long id, String Photo)
    {
        String sql = "UPDATE Contributor SET Photo = ? where ID = ?";
        return jdbcTemplate.update(sql,Photo,id);
    }

    @Override
    public int editIntro(long id, String intro)
    {
        String sql = "UPDATE Contributor SET Intro = ? where ID = ?";
        return jdbcTemplate.update(sql,intro,id);
    }
}
