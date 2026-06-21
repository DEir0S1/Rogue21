package com.rogue.domain.model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Corridor {
    private List<Point> path = new ArrayList<>();
    public Corridor() {
        this.path = new ArrayList<>();
    }
    public Corridor(List<Point> path) {
        this.path=new ArrayList<>(path);
    }
    public List<Point> getPath() {
        return Collections.unmodifiableList(path);
    }
    public void addPath(int x, int y) {
        Point point = new Point(x, y);
        if (!path.contains(point)) path.add(point);
    }
    public Point getStart() {
        return path.isEmpty() ? null : path.get(0);
    }
    public Point getEnd() {
        return path.isEmpty() ? null : path.get(path.size() - 1);
    }
}
