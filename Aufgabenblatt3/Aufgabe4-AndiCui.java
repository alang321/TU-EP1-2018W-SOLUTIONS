/*
    Aufgabe 4) Grafische Aufbereitung v. "GuessingGame" und Verwendung v. Methoden
*/

import java.awt.*;
import java.util.Scanner;

public class Aufgabe4 {

    public static void main(String[] args) {

        int pixelWidth = 300;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);

        // Partially adapted from GuessingGame.java
        int from = -100;
        int to = 100;
        int trialLimit = 8;
        int number = generateRandomIntInRange(from, to);

        int guess;
        boolean guessCorrect = false;
        int trial = 0;
        do {
            updateGameGraphic(trialLimit - trial, guessCorrect);
            guess = getScannerIntInRange(from, to);
            guessCorrect = guess == number;
            if (!guessCorrect) {
                System.out.println(guess + " is too " + ((guess > number) ? "large" : "small"));
                trial = trial + 1;
            }
        } while (!guessCorrect && trial < trialLimit);
        updateGameGraphic(trialLimit - trial, guessCorrect);
    }

    private static int generateRandomIntInRange(int from, int to) {
        if (from > to) throw new IllegalArgumentException();
        return (int) (Math.random() * (to - from + 1) + from);
    }

    private static Scanner scanner = new Scanner(System.in);

    private static int getScannerIntInRange(int acceptFrom, int acceptTo) {
        // Adapted from GuessingGame.java
        if (acceptFrom > acceptTo) throw new IllegalArgumentException();
        System.out.print("Which number in the range from " + acceptFrom + " to " + acceptTo + " has been chosen? ");
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input >= acceptFrom && input <= acceptTo) return input;
                else {
                    System.err.println("Input not in the accepted range.");
                }
            } else {
                scanner.next();
                System.err.println("Input not an integer.");
            }
            System.err.print("Enter an integer from " + acceptFrom + " to " + acceptTo + ": ");
        }
        throw new RuntimeException();
    }

    private static void outputMessage(String mesg) {
        System.out.println(mesg);
    }

    private static void updateGameGraphic(int remainingTrails, boolean gameWon) {
        StdDraw.clear();
        switch (remainingTrails) {
            case 8:
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledRectangle(150, 100, 45, 45);
            case 7:
                StdDraw.setPenColor(StdDraw.GREEN);
                StdDraw.filledRectangle(125, 100, 10, 10);
            case 6:
                StdDraw.setPenColor(StdDraw.CYAN);
                StdDraw.filledRectangle(75, 45, 30, 15);
            case 5:
                StdDraw.setPenColor(StdDraw.CYAN);
                StdDraw.filledRectangle(225, 45, 30, 15);
            case 4:
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(75, 15, 15);
            case 3:
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(225, 15, 15);
            case 2:
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.filledCircle(75, 15, 5);
            case 1:
                StdDraw.setPenColor(StdDraw.GRAY);
                StdDraw.filledCircle(225, 15, 5);
            default:
                break;
        }

        if (remainingTrails == 0) {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(150, 150, "You LOST!!!");
        }
        if (gameWon) {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.text(150, 150, "You WON!!!");
        }
    }


}

