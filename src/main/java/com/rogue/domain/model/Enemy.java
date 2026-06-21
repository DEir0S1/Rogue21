package com.rogue.domain.model;

import com.rogue.domain.enums.EnemyType;

public class Enemy extends Character {
    private EnemyType type;
    private boolean hostile = true;
    private int attackCooldown;

    public Enemy(String name, int maxHealth, int health, int dex,
          int str, Weapon currentWeapon, Backpack backpack,
          EnemyType type, boolean hostile, int attackCooldown) {
        super(name, maxHealth, health, dex, str, currentWeapon, backpack);
        this.type=type;
        this.hostile=hostile;
        this.attackCooldown=attackCooldown;
    }

    public void performTurn(Player player) {

    }

    public EnemyType getType() {
        return type;
    }

    public boolean getIsHostile() {
        return hostile;
    }

    public int getAttackCooldown() {
        return attackCooldown;
    }
}
