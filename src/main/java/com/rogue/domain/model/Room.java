package com.rogue.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int x, y;
    private int width, height;
    private List<Enemy> enemies = new ArrayList<>();
    private List<Item> items = new ArrayList<>();
    private boolean isVisited;

    public Room(int x, int y, int width, int height, List<Enemy> enemies,
         List<Item> items, boolean isVisited) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.enemies = enemies;
        this.items = items;
        this.isVisited = isVisited;
    }

    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public List<Enemy> getEnemies() {
        return enemies;
    }
    public List<Item> getItems() {
        return items;
    }
    public boolean isVisited() {
        return isVisited;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }
    public void setVisited(boolean visited) {
        isVisited = visited;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public void addEnemy(Enemy enemy) {
        enemies.add(enemy);
    }
    public void removeEnemy (Enemy enemy){
        enemies.remove(enemy);
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void removeItem(Item item) {
        items.remove(item);
    }

}
