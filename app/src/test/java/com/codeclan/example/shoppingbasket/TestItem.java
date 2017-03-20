package com.codeclan.example.shoppingbasket;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/03/2017.
 */

public class TestItem {
    Item item;

    @Before
    public void before(){
        item = new Item("Milk", 1.99);
    }

    @Test
    public void testGetName(){
        assertEquals("Milk", item.getName());
    }

    @Test
    public void testGetPrice(){
        assertEquals(1.99, item.getPrice());
    }
}
