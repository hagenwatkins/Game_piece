package com.tiy;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();


        Scanner scanner = new Scanner(System.in);

        if(gamePiece.isFrozen()) {
            gamePiece.isFrozen();
            System.out.println(gamePiece.isFrozen());
            System.out.println("unfreeze!");
        }

        if(!gamePiece.isFrozen()) {
            gamePiece.isFrozen();
            System.out.println(gamePiece.isFrozen());
            System.out.println("Freeze!");
        }



        System.out.println("move it!");
        scanner.nextLine();

        gamePiece.move(3, 9);
        System.out.println("You are at " + gamePiece.getPositionX() + ", " + gamePiece.getPositionY());


    }
}




