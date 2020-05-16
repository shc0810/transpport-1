package com.company;

import java.util.Date;

public class Airship {
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
        System.out.println("按字母W是上升S是下降。");
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

    public Airship() {
    }

    public Airship(String id, String name, int useTime, String owner, Date dateOfpurchase) {
        this.id = id;
        this.name = name;
        this.useTime = useTime;
        this.owner = owner;
        this.dateOfpurchase = dateOfpurchase;
    }
}
