package com.example.algorithm.entity;

import java.sql.Timestamp;

public class Customer
{
    private long id;
    private String email;
    private String name;
    private String password;
    private String introduce;
    private Timestamp createdtime;
    private String photo;

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setIntroduce(String introduce)
    {
        this.introduce = introduce;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setCreatedtime(Timestamp createdtime)
    {
        this.createdtime = createdtime;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPhoto(String photo)
    {
        this.photo = photo;
    }

    public String getPassword()
    {
        return password;
    }

    public String getIntroduce()
    {
        return introduce;
    }

    public long getId()
    {
        return id;
    }

    public String getEmail()
    {
        return email;
    }

    public String getName()
    {
        return name;
    }

    public String getPhoto()
    {
        return photo;
    }

    public Timestamp getCreatedtime()
    {
        return createdtime;
    }
}
