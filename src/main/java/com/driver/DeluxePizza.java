package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        addExtraCheese();
        addExtraToppings();
        // Since DeluxePizza includes extra cheese and toppings by default,
        // we call these methods in the constructor to automatically add them to the pizza.
    }
}
