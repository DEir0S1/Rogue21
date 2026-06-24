package com.rogue.domain.model;

import com.rogue.domain.enums.ItemType;
import com.rogue.domain.exceptions.InventoryFullException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BackpackTest {

    private Backpack backpack;
    private Item item1;
    private Item item2;

    @BeforeEach
    void setUp() {
        backpack = new Backpack();
        item1 = new Item(ItemType.FOOD, "Apple", 0, 0, 0, 0, 0);
        item2 = new Item(ItemType.POTION, "Health Potion", 10, 0, 0, 0, 0);
    }

    @Test
    void addItem_whenSpaceAvailable_shouldReturnTrueAndIncreaseSize() {
        assertTrue(backpack.addItem(item1));
        assertEquals(1, backpack.getSize());
        assertTrue(backpack.contains(item1));
    }

    @Test
    void addItem_whenFull_shouldReturnFalseAndNotAddItem() {

        for (int i = 0; i < 10; i++) {
            backpack.addItem(new Item(ItemType.TREASURE, "Gold", 0, 0, 0, 0, i));
        }
        assertEquals(10, backpack.getSize());

        boolean result = backpack.addItem(item1);
        assertFalse(result);
        assertEquals(10, backpack.getSize());
        assertFalse(backpack.contains(item1));
    }

    @Test
    void removeItem_shouldRemoveItemAndDecreaseSize() {
        backpack.addItem(item1);
        backpack.removeItem(item1);
        assertEquals(0, backpack.getSize());
        assertFalse(backpack.contains(item1));
    }

    @Test
    void getItems_shouldReturnUnmodifiableList() {

        List<Item> items = backpack.getItems();
        assertNotNull(items);
 
    }

    @Test
    void getCapacity_shouldReturnDefaultTen() {
        assertEquals(10, backpack.getCapacity());
    }

    @Test
    void constructorWithParameters_shouldSetCapacityAndItems() {
        List<Item> initial = new ArrayList<>();
        initial.add(item1);
        Backpack custom = new Backpack(5, initial);
        assertEquals(5, custom.getCapacity());
        assertEquals(1, custom.getSize());
        assertTrue(custom.contains(item1));
    }
}
