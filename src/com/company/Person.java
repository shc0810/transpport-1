package com.company;

public class Person {

    private int dmTskill;
    private int skyTskill;
    private int smTskill;
    private int luck;
    private String vehicleName="双腿";

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getDmTskill() {
        return dmTskill;
    }

    public void setDmTskill(int dmTskill) {
        this.dmTskill = dmTskill;
    }

    public int getSkyTskill() {
        return skyTskill;
    }

    public void setSkyTskill(int skyTskill) {
        this.skyTskill = skyTskill;
    }

    public int getSmTskill() {
        return smTskill;
    }

    public void setSmTskill(int smTskill) {
        this.smTskill = smTskill;
    }

    public int getLuck() {
        return luck;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    private static volatile Person instance=null;

    private Person(){
    }
    public static Person getInstance(){
        if(instance==null){
            synchronized (Person.class){
                if(instance==null){
                    instance=new Person();
                }
            }
        }
        return instance;
    }
    private String sex;
    private String age;
    private String name;
    private String id;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public void driveTransport(Ship ship){
        ship.drivingMethod();
    }
    public void driveTransport(Airship airship){
        airship.drivingMethod();
    }
    public void driveTransport(Aircraft aircraft){
        aircraft.drivingMethod();
    }
    public void driveTransport(Automobile automobile){
        automobile.drivingMethod();
    }
    public void driveTransport(Bicycle bicycle){
        bicycle.drivingMethod();
    }
    public void driveTransport(HotAirBallon hotAirBallon){
        hotAirBallon.drivingMethod();
    }
    public void driveTransport(Hovercraft hovercraft){
        hovercraft.drivingMethod();
    }
    public void driveTransport(Motocycle motocycle){
        motocycle.drivingMethod();
    }
    public void driveTransport(Submarine submarine){
        submarine.drivingMethod();
    }
}
