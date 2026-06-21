package com.rogue.domain.model;

public abstract class Character {
    private String name;
    private int maxHealth;
    private int health;
    private int dex;
    private int str;
    private Weapon currentWeapon = null;
    private Backpack backpack;

    public Character(String name, int maxHealth, int health, int dex,
              int str, Weapon currentWeapon, Backpack backpack) {
        this.name=name;
        this.maxHealth=maxHealth;
        this.health=health;
        this.dex=dex;
        this.str=str;
        this.currentWeapon=currentWeapon;
        this.backpack=backpack;
    }

    public String getName() {return name;}
    public int getMaxHealth() {return maxHealth;}
    public int getHealth() {return health;}
    public int getDex() {return dex;}
    public int getStr() {return str;}
    public Weapon getCurrentWeapon() {return currentWeapon;}
    public Backpack getBackpack() {return backpack;}

    public void setName(String name) {
        this.name = name;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setHealth(int health) {
        this.health = health;
        if (maxHealth < this.health) this.health=maxHealth;
        if (!isAlive()) health = 0;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void setCurrentWeapon(Weapon currentWeapon) {
        this.currentWeapon = currentWeapon;
    }

    public void setBackpack(Backpack backpack) {
        this.backpack = backpack;
    }

    public void attack(Character target) {
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (!isAlive()) health = 0;
    }

    public boolean isAlive() {
        return health > 0;
    }
}
