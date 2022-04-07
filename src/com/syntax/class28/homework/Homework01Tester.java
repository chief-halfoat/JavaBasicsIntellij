package com.syntax.class28.homework;

import java.util.ArrayList;
import java.util.Iterator;

public class Homework01Tester {
    public static void main(String[] args) {
        Car car = new Car();
        Pet pet = new Pet();
        Health health = new Health();

        ArrayList<Insurance> insurances = new ArrayList<>();
        insurances.add(car);
        insurances.add(pet);
        insurances.add(health);

        for (int i = 0; i <insurances.size(); i++) {
            insurances.get(i).getQuote();
            insurances.get(i).cancelInsurance();
        }
        System.out.println("------------------------------");
        for (Insurance insurance:insurances){
            insurance.getQuote();
            insurance.cancelInsurance();
        }
        System.out.println("-------------------------------");

        Iterator<Insurance> iterator = insurances.iterator();
        while(iterator.hasNext()){
            Insurance i = iterator.next();
            i.getQuote();
            i.cancelInsurance();
        }

    }
}
