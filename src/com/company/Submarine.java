package com.company;

import java.util.Date;

public class Submarine {
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
        System.out.println("1.海图。道\n" +
                "2.准确的时钟\n" +
                "3.精确地测速（包括方向的变化）\n" +
                "4.辅助导航设备调整航行方向。\n" +
                "导航员根据潜艇的速度、方向和时间，在海图上标出自己的航内迹，这样就能控制好航线了，再加上适时适地的通过其他设备调整偏差，这就可以航行到到很远很复杂的地方去了。\n" +
                "至于驾驶员，那就是根据导航的资料和舰长的命令，加速或者转向，和一般的船舶没啥容大的不同。");
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

    public Submarine(String id, String name, int useTime, String owner, Date dateOfpurchase) {
        this.id = id;
        this.name = name;
        this.useTime = useTime;
        this.owner = owner;
        this.dateOfpurchase = dateOfpurchase;
    }

    public Submarine() {
    }
}
