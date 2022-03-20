package com.syntax.class26;

public class ShoppingCartTester {
    public static void main(String[] args) {
        ShoppingCart shoppingCart=new ShoppingCart();
        shoppingCart.setDiscount(.15);
        shoppingCart.setOriginalPrice(100);
        shoppingCart.calculatePrice();

    }
}
