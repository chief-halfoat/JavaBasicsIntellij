package com.syntax.class28.homework;
//Create a Card class that will have implemented
// and unimplemented methods and a constructor
// that will initializes credit card type.
//
// Create 3 subclasses of a Card card.
// Create 3 objects of different card and store them into LinkedList.
// Using for loop/advanced for loop/ iterator access all methods of the class.

public class Homework02 {
    public static void main(String[] args) {

    }
}

abstract class Card {
    String cardType;

    public Card(String cardType) {
        this.cardType = cardType;
    }

    abstract void getBalance();
    abstract void payCard();

}
class AmEx extends Card{

    public AmEx(String cardType) {
        super(cardType);
    }

    @Override
    void getBalance() {
        System.out.println("Get "+cardType+" Balance");
    }

    @Override
    void payCard() {
        System.out.println("Pay "+cardType);
    }
}

class Discover extends Card{

    public Discover(String cardType) {
        super(cardType);
    }

    @Override
    void getBalance() {
        System.out.println("Get "+cardType+" Balance");
    }

    @Override
    void payCard() {
        System.out.println("Pay "+cardType);
    }
}

class Visa extends Card{

    public Visa(String cardType) {
        super(cardType);
    }

    @Override
    void getBalance() {
        System.out.println("Get "+cardType+" Balance");
    }

    @Override
    void payCard() {
        System.out.println("Pay "+cardType);
    }
}