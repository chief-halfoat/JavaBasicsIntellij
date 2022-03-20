package com.syntax.class25;

public class Homework01 {
}

class Computer{
    String make;

    public Computer(String make) {
        this.make = make;
    }
    void login(){
        System.out.println("Use username and password to login");
    }
}
class Apple extends Computer{
    public Apple(String make) {
        super(make);
    }
    @Override
    void login(){
        System.out.println("Use fingerprint to login as well");
    }
}
class Lenovo extends Computer{
    public Lenovo(String make) {
        super(make);
    }

    @Override
    void login() {
        System.out.println("USe Windows Hello as well to login");
    }
}
class HP extends Computer{
    public HP(String make) {
        super(make);
    }

}
class Dell extends Computer{
    public Dell(String make) {
        super(make);
    }
}

