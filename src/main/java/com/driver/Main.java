package com.driver;

public class Main {
    public static void main(String[] args) {
        DeluxePizza dp = new DeluxePizza(true);
        System.out.println(dp.getPrice());
        dp.addTakeaway();
        dp.addExtraCheese(); // This should not add extra cheese again as it's already included
        dp.addTakeaway(); // This should not add another takeaway bag as it's already included
        System.out.println(dp.getBill());

        Pizza p = new Pizza(true);
        p.addExtraCheese();
        p.addExtraToppings();
        p.addTakeaway();
        System.out.println(p.getBill());
    }
}
