package com.driver;

public class Pizza {

    protected int price;
    protected Boolean isVeg;
    protected boolean extraCheeseAdded = false;
    protected boolean extraToppingsAdded = false;
    protected boolean takeawayAdded = false;
    protected StringBuilder bill = new StringBuilder();

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        bill.append("Base Price Of The Pizza: ").append(this.price).append("\n");
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            this.price += 80;
            extraCheeseAdded = true;
            bill.append("Extra Cheese Added: 80\n");
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            int toppingsPrice = isVeg ? 70 : 120;
            this.price += toppingsPrice;
            extraToppingsAdded = true;
            bill.append("Extra Toppings Added: ").append(toppingsPrice).append("\n");
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            this.price += 20;
            takeawayAdded = true;
            bill.append("Paperbag Added: 20\n");
        }
    }

    public String getBill() {
        bill.append("Total Price: ").append(this.price);
        return bill.toString();
    }
}
