package com.example.algorithm.dao;

import com.example.algorithm.entity.Algorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;


@Repository
public class AlgorithmDaoImp implements AlgorithmDao
{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addAlgorithm(Algorithm algorithm)
    {
        String sql = "insert into Algorithm_Store(Name,Path,Price,Contributor,Intro,cover,carousel,original_price,popularity,sales,Createdtime,Status) " +
                "values(?,?,?,?,?,?,?,?,?,?,now(),?)";
        return (int) jdbcTemplate.update(sql, algorithm.getName(), algorithm.getPath(), algorithm.getPrice(), algorithm.getContributor(), algorithm.getIntro(), algorithm.getCover(), algorithm.getCarousel(), algorithm.getOriginalPrice(), algorithm.getPopolarity(), algorithm.getSales(), algorithm.getStatus());
    }

    @Override
    public int updatePrice(long id, double newPrice)
    {
        String sql = "UPDATE Algorithm_Store SET Price = ? where ID = ?";
        return jdbcTemplate.update(sql, newPrice, id);
    }

    @Override
    public int updateIntro(long id, String newIntro)
    {
        String sql = "UPDATE Algorithm_Store SET Intro = ? where ID = ?";
        return jdbcTemplate.update(sql, newIntro, id);
    }

    @Override
    public int updateCover(long id, String newCover)
    {
        String sql = "UPDATE Algorithm_Store SET cover = ? where ID = ?";
        return jdbcTemplate.update(sql, newCover, id);
    }


    @Override
    public int updateCarousal(long id, String carousal)
    {
        String sql = "UPDATE Algorithm_Store SET carsousel = ? where ID = ?";
        return jdbcTemplate.update(sql, carousal, id);
    }

    @Override
    public int ChangeStatus(long id)
    {
        boolean Status = !findAlbyID(id).getStatus();
        String sql = "UPDATE Algorithm_Store SET Status = ? where ID = ?";
        return jdbcTemplate.update(sql, Status, id);
    }

    @Override
    public Algorithm findAlbyID(long id)
    {
        String sql = "select * from Algorithm_Store where ID = ?";
        RowMapper<Algorithm> rowMapper = new BeanPropertyRowMapper<Algorithm>(Algorithm.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, id);//最后一个参数为id值
    }

    @Override
    public Algorithm findAlbyName(String name)
    {
        String sql = "select * from Algorithm_Store where Name = ?";
        RowMapper<Algorithm> rowMapper = new BeanPropertyRowMapper<Algorithm>(Algorithm.class);
        return jdbcTemplate.queryForObject(sql, rowMapper, name);//最后一个参数为id值
    }

    @Override
    public int gainPopularity(long id)
    {
        long popularity = findAlbyID(id).getPopolarity() + 1;
        String sql = "UPDATE Algorithm_Store SET Popularity = ? where ID = ?";
        return jdbcTemplate.update(sql, popularity, id);
    }

    @Override
    public int makeSale(long id)
    {
        long sale = findAlbyID(id).getSales() + 1;
        String sql = "UPDATE Algorithm_Store SET Popularity = ? where ID = ?";
        return jdbcTemplate.update(sql, sale, id);
    }

    @Override
    public int changPath(long id, String path)
    {
        String sql = "UPDATE Algorithm_Store SET Path = ? where ID = ?";
        return jdbcTemplate.update(sql, path, id);
    }
}
