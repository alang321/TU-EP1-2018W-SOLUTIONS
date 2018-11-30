/*
    Aufgabe 4) Grafische Aufbereitung v. "GuessingGame" und Verwendung v. Methoden
    billy boy
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

        //TODO: Implementieren Sie hier Ihr "GuessingGame"
        Scanner scanner = new Scanner(System.in);
        int secretNum = generateRandomNumber();
        int guessNum = 0;
        boolean win = false;
        while (guessNum <= 7 && !win) {
            draw(guessNum, win);
            int playerGuess = takePlayerGuess(scanner, guessNum);
            win = playerGuess==secretNum;
            giveHint(secretNum, playerGuess);
            guessNum++;
        }
        draw(guessNum, win);
        System.out.println("The number was "+secretNum);
    }
    
    //TODO: Implementieren Sie hier Ihre Methoden
    private static void giveHint(int sn, int gn)
    {
        if (sn > gn) System.out.println("Higher!");
        else if (sn < gn) System.out.println("Lower!");
    }

    private static int generateRandomNumber()
    {
        return (int)(Math.random() * 200 - 100);
    }

    private static int takePlayerGuess(Scanner s, int gn)
    {
        String pInput = "-69420";
        System.out.println("Guess #" + (gn+1) + ": ");
        pInput = s.next();
        int ppInput = 0;
        while(true) {
            if (pInput.matches("-?\\d+")) {
                ppInput = Integer.parseInt(pInput);
                if (ppInput >= -100 && ppInput <= 100) return ppInput;
            }
            System.out.println("No-loss-of-guess-attempts-Meldung! Enter a real number between -100 and 100 bruv!");
            pInput = s.nextLine();
        }
    }

    private static void printToPlayer(String o)
    {
        System.out.println(o);
    }

    private static void draw(int gn, boolean w)
    {
        StdDraw.clear();
        if (gn > 7 || w)
        {
            StdDraw.setFont(new Font("Arial", Font.BOLD, 35));
            StdDraw.setPenColor((w) ? StdDraw.GREEN : StdDraw.RED);
            StdDraw.text(150, 165, (w) ? "You WON!!!" : "You LOST!!!");
        }

        switch(gn) {
            case 0:
            //mid
            StdDraw.setPenColor(255, 125, 125);
            StdDraw.filledRectangle(150, 100, 35, 35);
            case 1:
            //window
            StdDraw.setPenColor(125, 255, 125);
            StdDraw.filledRectangle(130, 110, 10, 10);
            case 2:
            //left chassis
            StdDraw.setPenColor(125, 125, 255);
            StdDraw.filledRectangle(80, 80, 35, 15);
            case 3:
            //right chassis
            StdDraw.setPenColor(125, 125, 255);
            StdDraw.filledRectangle(220, 80, 35, 15);
            case 4:
            //left back wheel
            StdDraw.setPenColor(50, 50, 50);
            StdDraw.filledCircle(80, 45, 20);
            case 5:
            //left front wheel
            StdDraw.setPenColor(150, 150, 150);
            StdDraw.filledCircle(80, 45, 10);
            case 6:
            //right back wheel
            StdDraw.setPenColor(50, 50, 50);
            StdDraw.filledCircle(220, 45, 20);
            case 7:
            //right front wheel
            StdDraw.setPenColor(150, 150, 150);
            StdDraw.filledCircle(220, 45, 10);
            default:
            break;
        }
    }

    // ZUSATZFRAGEN
    // 1. man kann mit instanceof unterschieden
    // 2. nein es muss nicht. das code soll weitergehen koennen.
}
