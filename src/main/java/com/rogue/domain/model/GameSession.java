package com.rogue.domain.model;

import java.util.ArrayList;
import java.util.List;

public class GameSession {
    private Player player;
    private List<Level> levels = new ArrayList<>();
    private Level currentLevel;
    private int currentLevelIndex;
    private boolean gameOver;

    public GameSession(Player player, Level currentLevel){
        this.player=player;
        this.currentLevel=currentLevel;
        currentLevelIndex = 1;
        gameOver = false;
    }

    void saveGame(){}
    void loadGame(){}

    public Player getPlayer() {
        return player;
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }
}
