package com.syntax.class25;

import jdk.swing.interop.SwingInterOpUtils;

public interface MoveAble {
    void move();
}
interface DriveAble{
    void drive();
}
interface Car extends DriveAble,MoveAble{

}

class BMW implements Car{

    @Override
    public void move() {
        System.out.println("We can move the BMW");
    }

    @Override
    public void drive() {
        System.out.println("We can drive the BMW");
    }
}