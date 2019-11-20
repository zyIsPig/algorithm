package com.example.algorithm.entity;


public class Algorithm
{

    private long id;
    private String name;
    private String path;
    private double price;
    private long contributor;
    private String intro;
    private String cover;
    private String carousel;
    private double originalPrice;
    private long popolarity;
    private long sales;
    private java.sql.Timestamp createdtime;
    private boolean Status;

    public Algorithm(){
        this.popolarity = 0;
        this.sales = 0;
        this.Status = false;
    }
    public void setStatus(boolean status)
    {
        Status = status;
    }

    public boolean getStatus()
    {
        return Status;
    }

    public long getId()
    {
        return id;
    }

    public void setId(long id)
    {
        this.id = id;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public String getPath()
    {
        return path;
    }

    public void setPath(String path)
    {
        this.path = path;
    }


    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }


    public long getContributor()
    {
        return contributor;
    }

    public void setContributor(long contributor)
    {
        this.contributor = contributor;
    }


    public String getIntro()
    {
        return intro;
    }

    public void setIntro(String intro)
    {
        this.intro = intro;
    }


    public String getCover()
    {
        return cover;
    }

    public void setCover(String cover)
    {
        this.cover = cover;
    }


    public String getCarousel()
    {
        return carousel;
    }

    public void setCarousel(String carousel)
    {
        this.carousel = carousel;
    }


    public double getOriginalPrice()
    {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice)
    {
        this.originalPrice = originalPrice;
    }


    public long getPopolarity()
    {
        return popolarity;
    }

    public void setPopolarity(long popolarity)
    {
        this.popolarity = popolarity;
    }


    public long getSales()
    {
        return sales;
    }

    public void setSales(long sales)
    {
        this.sales = sales;
    }


    public java.sql.Timestamp getCreatedtime()
    {
        return createdtime;
    }

    public void setCreatedtime(java.sql.Timestamp createdtime)
    {
        this.createdtime = createdtime;
    }

}
