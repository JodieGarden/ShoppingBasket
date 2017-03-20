package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestBasket {
    Basket basket;
    Customer customer;
    Item item;


    @Before
    public void before() {
        Item item;
        basket = new Basket(new ArrayList<Item>());
        customer = new Customer();


    }

    @Test
    public void testAddItemToBasket() {
        item = new Item("Milk", 1.00);

        assertEquals(1, basket.addItemToBasket(item));
    }

    @Test
    public void testRemoveItemFromBasket() {
        basket.addItemToBasket(item);
        basket.addItemToBasket(item);
        basket.addItemToBasket(item);

        assertEquals(2, basket.removeItemFromBasket(item));
    }


    @Test
    public void testEmptyBasket(){
        assertEquals(0, basket.empty());
    }


}