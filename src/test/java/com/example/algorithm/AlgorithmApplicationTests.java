package com.example.algorithm;

import com.example.algorithm.dao.BuyerDao;
import com.example.algorithm.dao.BuyerDaoImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootTest
class AlgorithmApplicationTests {

    @Test
    void contextLoads() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
             dataSource.setDriverClassName("com.mysql.jdbc.Driver");
                 dataSource.setUrl("jdbc:mysql://localhost:3306/ooad_project");
                 dataSource.setUsername("root");
                 dataSource.setPassword("lzy19981221");

                 // 创建JDBC模板
                 JdbcTemplate jdbcTemplate = new JdbcTemplate();
                 // 这里也可以使用构造方法
                 jdbcTemplate.setDataSource(dataSource);

                 // sql语句
                 String sql = "select count(*)  from Buyer";
                 Long num = (long) jdbcTemplate.queryForObject(sql, Long.class);

             System.out.println(num);
//        System.out.println("aaa");
    }

}
