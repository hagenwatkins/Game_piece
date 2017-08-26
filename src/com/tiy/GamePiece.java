package com.tiy;

class GamePiece {
    private int positionX;
    private int positionY;
    private boolean frozen;
    private String color;
    private String name;


    public GamePiece() {
        this.positionX = 0;
        this.positionY = 0;
        this.frozen = false;

    }


    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public boolean isFrozen() {
        return frozen;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(int newPositionX, int newPositionY) {
        if (!this.frozen) {
            this.positionX = newPositionX;
            this.positionY = newPositionY;
        }
    }

    public void freeze(boolean frozen) {
        this.frozen = true;
        System.out.println("frozen");
    }
    public void unfreeze(boolean frozen){
        this.frozen = false;
        System.out.println("unfreezef");
    }
}

