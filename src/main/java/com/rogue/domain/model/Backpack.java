package com.rogue.domain.model;

import com.rogue.domain.exceptions.InventoryFullException;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    public Backpack() {}

    public Backpack(int capacity, List<Item> items) {
        this.capacity = capacity;
        this.items= items;
    }

    private int capacity = 10;
    private List<Item> items = new ArrayList<>();

    public boolean addItem(Item item) {
        try {
            if (items.size() >= capacity) throw new InventoryFullException();
            items.add(item);
            return true;
        }
        catch (InventoryFullException e) {
            return false;
        }
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public boolean contains(Item item) {
        return items.contains(item);
    }

    public int getSize() {
        return items.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
