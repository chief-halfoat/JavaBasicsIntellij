package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use keys to start me");
    }

    void stop(){
        System.out.println("Use brakes to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Start me with button");
    }
    void stop(){
        System.out.println("Can use brakes or I can autobrake");
    }
    void park(){
        System.out.println("Use parking sensors to park me");
    }
}
class Tesla extends Car{
    void start(){
        System.out.println("Start me with button");
    }
    void stop(){
        System.out.println("Can use brakes or I can autobrake");
    }
    void park(){
        System.out.println("Use parking sensors to park me");
    }
}
