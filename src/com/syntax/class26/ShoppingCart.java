package com.syntax.class26;

public class ShoppingCart {
    private double originalPrice;
    private double discount=.15;

    void setDiscount(double discount){
        if(discount>0&&discount<=.15){
            this.discount=discount;
        } else {
            System.out.println("Invalid discount");
        }
    }
    void setOriginalPrice(double originalPrice){
        this.originalPrice=originalPrice;
    }


    void calculatePrice(){
        double price=originalPrice*(1-discount);
        System.out.println(price);
    }
}
