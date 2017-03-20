package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/03/2017.
 */

public class TestTill {
    Basket basket;
    Item item;
    ArrayList<Item> Withinbasket;
    Till till;

    @Before
    public void before(){
        Item item;
        ArrayList<Item>Withinbasket;
        Till till;
    }

    @Test
    public void TestTotalCostOfItemsInBasket(){
        item = new Item("Milk", 1.99);
        item = new Item("Eggs", 2.50);
        basket.addItemToBasket("Milk", 1.99);
        assertEquals(3.49, till.total);
    }

}
