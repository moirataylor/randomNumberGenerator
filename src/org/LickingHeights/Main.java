package org.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //todo requirements
        //must use 2 do/while loops
        //must use one method public static String guessFeedback(int guess, int answer) {}
        //must use random number generator and be explicit on #'s to guess from
        //must have 5 commits or more (method,game loop, logic loop)

        int pickedNumber, number, guess;


        do {
            number = generateGuess(100, 1);
            System.out.println("pick a number between 1 and 100");
            do {
                Scanner keyboard;
                keyboard = new Scanner(System.in);
                guess = keyboard.nextInt();
                if (guess > number) {
                    System.out.println("too high, please guess again");
                }
                else if (guess < number) {
                    System.out.println("too low, please guess again");
                }
                else {
                    System.out.println("Correct! Do you want to play again?");
                }
            } while (guess != number);
        } while (!(number < 2));
    }


    public static int generateGuess(int options, int startingNum) {
        int pickedNumber;
        pickedNumber = (int) (Math.random() * options) + startingNum;
        return pickedNumber;
    }



}




