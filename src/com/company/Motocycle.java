package com.company;

import java.util.Date;

public class Motocycle {
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
        System.out.println("启动：空档，捏离合把手把，挂1档，加油，慢松离合把手，走人中途换档：升档，略加油门，快捏离合把手，升档，松离合把手（此处是快速松还是慢慢松），加油门，同类再升。减档：减油门，快捏离合把手，减档，松离合把手（同样此处是快速松还是慢慢松），同类再减。快,慢松都可以, 控制好车速就行。");
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

    public Motocycle(String id, String name, int useTime, String owner, Date dateOfpurchase) {
        this.id = id;
        this.name = name;
        this.useTime = useTime;
        this.owner = owner;
        this.dateOfpurchase = dateOfpurchase;
    }

    public Motocycle() {
    }
}
