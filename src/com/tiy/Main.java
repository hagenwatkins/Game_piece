package com.tiy;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        GamePiece gamePiece = new GamePiece();
        Scanner scanner = new Scanner(System.in);

        gamePiece.move(4,9);
        gamePiece.freeze(false);
        gamePiece.isFrozen();



        //if (gamePiece.isFrozen() == true) {
           // System.out.println("frozen");
        //} else {
            //System.out.println("unfreeze");

        }

        //System.out.println("you are at "+ gamePiece.getPositionX() +","+gamePiece.getPositionY());
       /* if(gamePiece.isFrozen()) {
            gamePiece.freeze(false);
            System.out.println(gamePiece.isFrozen());
            System.out.println("unfreeze!");
        }

        if(!gamePiece.isFrozen()) {
            gamePiece.freeze(true);

            System.out.println("Freeze!");
        }



        System.out.println("move it!");

        scanner.nextLine();
        gamePiece.move(3, 9);

        System.out.println("You are at " + gamePiece.getPositionX() + ", " + gamePiece.getPositionY());
        */

    }





