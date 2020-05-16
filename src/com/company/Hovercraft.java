package com.company;

import java.util.Date;

public class Hovercraft {
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

    public Hovercraft(String id, String name, int useTime, String owner, Date dateOfpurchase) {
        this.id = id;
        this.name = name;
        this.useTime = useTime;
        this.owner = owner;
        this.dateOfpurchase = dateOfpurchase;
    }

    public Hovercraft() {
    }

    public void drivingMethod(){
        System.out.println("1、把气垫船当成两栖漂移车比赛玩就行；\n" +
                "2、过弯无需减速，而是需要放开胆子往弯心转向，不要怕转向过度，蹭几下弯心的墙不可怕，怕的是转向不足溜到赛道外围；\n" +
                "3、因为气垫船本身极速非常低，所以过大转弯时在弯心和出弯后补两三下NOS就能把速度提起来；\n" +
                "4、出弯补NOS能减少侧滑现象，因此NOS留在出弯后抵消侧滑和跳坡以及颠簸后速度过低用来补速度，只需要补两三秒就行。");

    }
}
