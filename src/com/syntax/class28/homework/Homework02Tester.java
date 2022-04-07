package com.syntax.class28.homework;

import java.util.Iterator;
import java.util.LinkedList;

public class Homework02Tester {
    public static void main(String[] args) {
        AmEx amEx = new AmEx("American Express");
        Discover discover = new Discover("Discover");
        Visa visa = new Visa("Visa");

        LinkedList<Card> cards = new LinkedList<>();
        cards.add(amEx);
        cards.add(discover);
        cards.add(visa);

        System.out.println("=========For Loop=========");

        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).getBalance();
            cards.get(i).payCard();
        }

        System.out.println("=========Enhanced For Loop=========");
        for(Card card:cards){
            card.getBalance();
            card.payCard();
        }

        System.out.println("=========Iterator=========");
        Iterator<Card> iterator = cards.iterator();
        while(iterator.hasNext()){
            Card it = iterator.next();
            it.getBalance();
            it.payCard();
        }
    }
}
