package com.syntax.class24;

public abstract class Phone {
    void makePhoneCalls(){
        System.out.println("Making a phone call");
    }
    void sendText(){
        System.out.println("Sending a text");
    }
    abstract void displayPicture();
}
class Iphone extends Phone{
    @Override
    void displayPicture() {
        System.out.println("Use photo app");
    }
}

class PhoneTester {
    public static void main(String[] args) {
        new Iphone().displayPicture();
        new Iphone().makePhoneCalls();
        new Iphone().sendText();

    }
}