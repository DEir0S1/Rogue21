package com.rogue.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Level {
    private int depth;
    private List<Room> rooms = new ArrayList<>();
    private List<Corridor> corridors = new ArrayList<>();
    private int width, height;
    private char[][] map;

    public Level(int width, int height, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.map = new char[width][height];
    }

    public void getRoomAt(int x, int y) {

    }

    public boolean isWalkable(int x, int y) {
        return true;
    }

    public void placePlayer(Player player, int startX, int startY){}
}
