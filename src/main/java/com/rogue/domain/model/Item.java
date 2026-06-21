package com.rogue.domain.model;

import com.rogue.domain.enums.ItemType;

public class Item {
    private ItemType type;
    private String name;
    private int healthBonus;
    private int maxHealthBonus;
    private int dexBonus;
    private int strBonus;
    private int value;

    public Item(){}

    public Item(ItemType type, String name, int healthBonus,
         int maxHealthBonus, int dexBonus, int strBonus, int value) {
        this.type=type;
        this.name=name;
        this.healthBonus=healthBonus;
        this.maxHealthBonus=maxHealthBonus;
        this.dexBonus=dexBonus;
        this.strBonus=strBonus;
        this.value=value;
    }

    public ItemType getType() {return type;}

    public String getName() {return name;}

    public int getHealthBonus() {return healthBonus;}

    public int getMaxHealthBonus() {return maxHealthBonus;}

    public int getDexBonus() {return dexBonus;}

    public int getStrBonus() {return strBonus;}

    public int getValue() {return value;}

    public void use(Character user) {}

}
