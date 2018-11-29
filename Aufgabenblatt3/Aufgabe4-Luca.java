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

        int minNumber = -100;
        int maxNumber = 100;


        int randomNumber = genNumber(minNumber, maxNumber);
        int guessesRemaining = 8;

        System.out.println("Please guess a number between " + minNumber + " and " + maxNumber + " !");

        Scanner scanner = new Scanner(System.in);
        while (guessesRemaining > 0) {
            drawRemaining(guessesRemaining);
            int guessedNumber = readGuess(scanner, minNumber, maxNumber);
            if (guessedNumber < randomNumber) {
                printToConsole("Too Small. " + --guessesRemaining + " guesses remaining!", true);
            } else if (guessedNumber == randomNumber) {
                printToConsole("You got It!", true);
                break;
            } else {
                printToConsole("Too Big. " + --guessesRemaining + " guesses remaining!", true);
            }
        }
        scanner.close();
        if (guessesRemaining > 0) {
            printToConsole("You won with " + guessesRemaining + (guessesRemaining == 1 ? " guess" : " guesses") + " remaining!", true);
            drawResult(true);
        } else {
            printToConsole("You lost! The number was " + randomNumber + ".", true);
            drawResult(false);
        }
    }

    private static int genNumber(int min, int max) {
        /*
         *  Beispiel: 50 bis 150: 0 * (150 - 50) + 50 =  50
         *                        1 * (150 - 50) + 50 = 150
         */
        return (int) (Math.random() * (max - min)) + min;
    }

    private static int readGuess(Scanner scanner, int minNumber, int maxNumber) {
        while(true) {
            printToConsole("# ", false);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (minNumber < i && i < maxNumber) return i;
                else printToConsole("Bitte geben Sie eine ganze Zahl zwischen " + minNumber + " und " + maxNumber + " ein!", true);
            } else {
                printToConsole("Bitte geben Sie eine ganze Zahl ein!", true);
                scanner.next();
            }
        }
    }

    /*
     *  Zusatzfragen:
     *  1)  scanner.nextInt() gibt nur true zurück, wenn die Eingabe vom Typ int ist.
     *  2)  Eine ungültige Eingabe muss nicht entfernt werden, da sie vom Scanner
     *      nicht mehr betrachtet wird und somit keine weiteren Errors auslöst
     */

    private static void printToConsole(String text, boolean printBreak) {
        if (printBreak) System.out.println(text);
        else System.out.print(text);
    }

    private static void drawRemaining(int parts) {
        Color[] color = new Color[] { Color.BLACK, Color.BLACK, Color.GRAY, Color.GRAY,  Color.CYAN, Color.CYAN, Color.RED, Color.GREEN };
        int[] posX = new int[] {  75, 225,  75, 225,  75, 225, 150, 135 };
        int[] posY = new int[] {  25,  25,  25,  25,  65,  65,  90, 105 };

        int[] radius = new int[] { 25, 25, 10, 10 };

        int[] width = new int[] { 40, 40, 35, 10 };
        int[] height = new int[] { 15, 15, 40, 10 };

        StdDraw.clear();

        for (int i = 0; i < parts; i++) {
            StdDraw.setPenColor(color[i]);
            if (i < 4) {
                StdDraw.filledCircle(posX[i], posY[i], radius[i]);
            } else {
                StdDraw.filledRectangle(posX[i], posY[i], width[i - 4], height[i - 4]);
            }
        }
    }

    private static void drawResult(boolean won) {
        StdDraw.setFont(new Font("Arial", Font.BOLD, 30));
        if (won) {
            StdDraw.setPenColor(Color.GREEN);
            StdDraw.text(150, 160, "You WON!!!");
        } else {
            StdDraw.clear();
            StdDraw.setPenColor(Color.RED);
            StdDraw.text(150, 160, "You LOST!!!");
        }
    }
}
