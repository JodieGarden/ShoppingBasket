package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;

/**
 * Created by user on 19/03/2017.
 */

public class Till {
    Item item;
    ArrayList<Item> basket;
    double total;

    public Till(ArrayList<Item> basket) {
        this.basket = new ArrayList<Item>();
        this.total = 0.0;
    }


    public void totalCostOfItemsInBasket() {
        double priceOfItem = 0;
        for (Item item : basket) {
            priceOfItem = item.getPrice();
        }
        this.total += priceOfItem;

    }


}
