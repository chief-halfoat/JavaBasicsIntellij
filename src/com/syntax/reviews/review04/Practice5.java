package com.syntax.reviews.review04;

public class Practice5 {

    String weekDay(String day){
        day = day.toLowerCase();
        switch(day){
            case "monday":
                return "It is lazy day";
            case "tuesday":
                return "It is productive day";
            case "wednesday":
                return "It is gloomy day";
            case "thursday":
                return "It is exciting day";
            case "friday":
                return "No work day";
            default:
                return "No correct option found";
        }
    }

    public static void main(String[] args) {
        Practice5 obj = new Practice5();
        System.out.println(obj.weekDay("monday"));
    }
}
