package com.rogue.domain.model;

public class Player extends Character{
    private int level;
    private int experience;
    private int gold;

    public Player(String name, int maxHealth, int health, int dex,
           int str, Weapon currentWeapon, Backpack backpack,
           int level, int experience, int gold) {
        super(name, maxHealth, health, dex, str, currentWeapon, backpack);
        this.level=level;
        this.experience=experience;
        this.gold=gold;
    }

    public void gainExperience(int amount) {
        experience += amount;
        if (experience >= level * 100) level++;
    }

    public boolean pickUpItem(Item item) {
        Backpack bp = getBackpack();
        if (bp.getSize() < bp.getCapacity()) {
            bp.addItem(item);
            return true;
        }
        return false;
    }

    public int getExperience() {
        return experience;
    }

    public int getLevel() {
        return level;
    }

    public int getGold() {
        return gold;
    }
}
