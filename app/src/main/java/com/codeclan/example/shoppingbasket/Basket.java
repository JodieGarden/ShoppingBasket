package com.codeclan.example.shoppingbasket;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by user on 17/03/2017.
 */

public class Basket {
    ArrayList<Item> basket;


    public Basket(ArrayList<Item> basket){
        this.basket = new ArrayList<Item>();
    }



    public int addItemToBasket(Item item) {
        basket.add(item);
        return basket.size();
    }

    public int removeItemFromBasket(Item item) {
        basket.remove(item);
        return basket.size();
    }


    public int empty() {
        basket.clear();
       return basket.size();
    }

}
