package com.example.algorithm.entity;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Trade
{

    private long id;
    private java.sql.Timestamp startTime;
    private java.sql.Timestamp dueTime;
    private long customer;
    private long state;

    Trade(long customer)
    {
        this.customer = customer;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String tradeId = customer + simpleDateFormat.format(new Date());
        this.id = Long.parseLong(tradeId);
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public java.sql.Timestamp getStartTime()
    {
        return startTime;
    }

    public void setStartTime(java.sql.Timestamp startTime)
    {
        this.startTime = startTime;
    }


    public java.sql.Timestamp getDueTime()
    {
        return dueTime;
    }

    public void setDueTime(java.sql.Timestamp dueTime)
    {
        this.dueTime = dueTime;
    }


    public long getCustomer()
    {
        return customer;
    }

    public void setCustomer(long customer)
    {
        this.customer = customer;
    }


    public long getState()
    {
        return state;
    }

    public void setState(long state)
    {
        this.state = state;
    }

}
