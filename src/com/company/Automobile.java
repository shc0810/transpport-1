package com.company;

import java.util.Date;

public class Automobile {
    private String id;
    private String name;
    private int useTime;
    private String owner;
    private Date dateOfpurchase;
    private int price;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public void drivingMethod(){
        System.out.println("开车前检查车况看轮胎，车底下是否出现漏油漏水的情况。\n点火前为防备滑动先拉手刹。");
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUseTime() {
        return useTime;
    }

    public void setUseTime(int useTime) {
        this.useTime = useTime;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Date getDateOfpurchase() {
        return dateOfpurchase;
    }

    public void setDateOfpurchase(Date dateOfpurchase) {
        this.dateOfpurchase = dateOfpurchase;
    }

    public Automobile() {
    }

    public Automobile(String id, String name, int useTime, String owner, Date dateOfpurchase) {
        this.id = id;
        this.name = name;
        this.useTime = useTime;
        this.owner = owner;
        this.dateOfpurchase = dateOfpurchase;
    }
}
