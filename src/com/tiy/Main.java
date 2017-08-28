package com.tiy;



class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();


        gamePiece.move(4, 9);
        gamePiece.freeze(false);
        gamePiece.isFrozen();


        if (gamePiece.isFrozen() == true) {
            System.out.println("frozen");
        } else {
            //System.out.println("unfreeze");

        }

        System.out.println("you are at " + gamePiece.getPositionX() + "," + gamePiece.getPositionY());


    }
}




