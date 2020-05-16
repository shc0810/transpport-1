package com.company;

import java.util.Date;
import java.util.Scanner;

public class Ui {
    int distance=10;
    boolean be=false;
    Date date=new Date(10000000);
    Person person=Person.getInstance();
    Submarine submarine=new Submarine();
    Aircraft aircraft=new Aircraft();
    Automobile automobile=new Automobile();
    Bicycle bicycle=new Bicycle();
    Hovercraft hovercraft=new Hovercraft();
    Motocycle motocycle=new Motocycle();
    HotAirBallon hotAirBallon=new HotAirBallon();
    Ship ship=new Ship();
    Airship airship=new Airship();


    public void scence(){
        System.out.println("A 摩托");
        System.out.println("B 自行车");
        System.out.println("C 汽车");
        System.out.println("D 飞艇");
        System.out.println("E 飞机");
        System.out.println("F 热气球");
        System.out.println("G 船");
        System.out.println("H 潜艇");
        System.out.println("I 气垫船");

    }

    public void createTransport(){
        submarine.setDateOfpurchase(date);
        submarine.setName("潜艇");
        submarine.setOwner("无主");
        aircraft.setDateOfpurchase(date);
        aircraft.setName("飞机");
        aircraft.setOwner("无主");
        airship.setDateOfpurchase(date);
        airship.setName("飞艇");
        airship.setOwner("无主");
        bicycle.setDateOfpurchase(date);
        bicycle.setName("自行车");
        bicycle.setOwner("无主");
        automobile.setDateOfpurchase(date);
        automobile.setName("汽车");
        automobile.setOwner("无主");
        hotAirBallon.setDateOfpurchase(date);
        hotAirBallon.setName("热气球");
        hotAirBallon.setOwner("无主");
        hovercraft.setDateOfpurchase(date);
        hovercraft.setName("气垫船");
        hovercraft.setOwner("无主");
        motocycle.setDateOfpurchase(date);
        motocycle.setName("摩托");
        motocycle.setOwner("无主");
        ship.setDateOfpurchase(date);
        ship.setName("船");
        ship.setOwner("无主");
    }

    public void than(int roll,int yroll){
        System.out.println("你掷出了"+roll);
        if(roll==1){
            System.out.println("waaaah!大成功,但是这并没有什么用。");
            be=true;

        }
        else if(roll<=yroll){
            System.out.println("成功!");
            be=true;
        }
        else if(roll==100){
            System.out.println("hhhh,大失败，真是可惜啊！");
            System.out.println("你选的载具"+person.getVehicleName()+"突然发生爆炸，你最后一眼看到的是一个隐约可见的人脸！");
            System.exit(0);
        }
        else if(roll>yroll){
            System.out.println("失败");
            be=false;
        }
    }

    public void createrole(){
        System.out.println("对了，你还记得你叫什么吗？你叫");
        Scanner in = new Scanner(System.in);
        String name =in.nextLine();
        person.setName(name);
        System.out.println("哦对，你还记得你叫"+person.getName());
        System.out.println("先来解决你的地面交通工具精通吧");
        person.setDmTskill(roll());
        System.out.println("waaaah!它的数值是"+person.getDmTskill());
        System.out.println("再来看看你的空中交通工具的熟练度吧");
        person.setSkyTskill(roll());
        System.out.println("它的数值是"+person.getSkyTskill());
        System.out.println("在最后让我们来瞧瞧你的水上交通工具掌握的如何");
        person.setSmTskill(roll());
        System.out.println("不错嘛，它的数值是"+person.getSmTskill());
        person.setLuck(roll());
        System.out.println("话音刚落，你陷入了黑暗。");
    }

    public int roll(){
        int max=100,min=1;
        int ran=(int)(Math.random()*(max-min)+min);
        return ran;
    }
    public void play(){
        System.out.println("你要进行这个玩法吗，那你首先得车个卡啊，勇士！");
        createrole();
        System.out.println("你从黑暗中醒来，面前是一个巨大的仓库，你向里面走去，此时你发现后方的黑暗正在涌来，而你前方有九种驾驶工具");
        scence();
        while(true){
            Scanner in=new Scanner(System.in);
            String choose=in.nextLine();
            if(choose.equals("A")){
                than(roll(),person.getDmTskill());
                if(be) {
                    person.setVehicleName(motocycle.getName());
                    System.out.println("它的驾驶方法是");
                    motocycle.drivingMethod();
                }
            }
            else if(choose.equals("B")){
                than(roll(),person.getDmTskill());
                if(be) {
                    person.setVehicleName(bicycle.getName());
                    System.out.println("它的驾驶方法是");
                    bicycle.drivingMethod();
                }
            }
            else if(choose.equals("C")){
                than(roll(),person.getDmTskill());
                if(be) {
                    person.setVehicleName(automobile.getName());
                    System.out.println("它的驾驶方法是");
                    automobile.drivingMethod();
                }
            }
            else if(choose.equals("D")){
                than(roll(),person.getSkyTskill());
                if(be) {
                    person.setVehicleName(airship.getName());
                    System.out.println("它的驾驶方法是");
                    airship.drivingMethod();
                }
            }
            else if(choose.equals("E")){
                than(roll(),person.getSkyTskill());
                if(be) {
                    person.setVehicleName(aircraft.getName());
                    System.out.println("它的驾驶方法是");
                    aircraft.drivingMethod();
                }
            }
            else if(choose.equals("F")){
                than(roll(),person.getSkyTskill());
                if(be) {
                    person.setVehicleName(hotAirBallon.getName());
                    System.out.println("它的驾驶方法是");
                    hotAirBallon.drivingMethod();
                }
            }
            else if(choose.equals("G")){
                than(roll(),person.getSmTskill());
                if(be) {
                    person.setVehicleName(ship.getName());
                    System.out.println("它的驾驶方法是");
                    ship.drivingMethod();
                }
            }
            else if(choose.equals("H")){
                than(roll(),person.getSmTskill());
                if(be) {
                    person.setVehicleName(submarine.getName());
                    System.out.println("它的驾驶方法是");
                    submarine.drivingMethod();
                }
            }
            else if(choose.equals("I")){
                than(roll(),person.getSmTskill());
                if(be) {
                    person.setVehicleName(hovercraft.getName());
                    System.out.println("它的驾驶方法是");
                    hovercraft.drivingMethod();
                }
            }

            if(be) break;
        }
        while(true){
            System.out.println("你现在需要甩开它"+distance);
            System.out.println("按1继续");
            Scanner num=new Scanner(System.in);
            String n=num.nextLine();
            if(n.equals("1")){
                than(roll(),person.getLuck());
            }
            else if(n.equals("2")){
                System.out.println(person.getLuck());
            }
            else{
                System.out.println("黑暗瞬间吞噬了你，你那惊恐的脸色真是令人回味啊！");
                System.exit(0);
            }
            if(be){
                distance-=1;
                System.out.println("你又离摆脱这片黑暗近了一步");
            }
            else{
                distance+=1;
                System.out.println("真可惜！你离死亡又近了一步");
            }
            if(distance==0){
                System.out.println("你终于甩掉了那片黑暗，但横贯在你前方的是一片废墟，最终你究竟会通往何方呢？");
                System.exit(0);
            }
            if(distance>10){
                System.out.println("在你惊恐的眼神中，黑暗一点一点的吞噬了你，可真是美味啊！");
                System.exit(0);
            }
        }

    }
}
