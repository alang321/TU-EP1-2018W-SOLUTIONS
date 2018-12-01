import java.awt.*;

/*
    Aufgabe 2) Eindimensionale Arrays - Schreiben, Lesen und Verwenden
*/
public class Aufgabe2 {

    private static int[] genRandomArray(int numValues, int maxValue) {
        int[] randomArray = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            randomArray[i] = (int) (Math.random() * maxValue);
        }
        return randomArray;
    }

    private static int getMaxValueFromArray(int[] array) {
        int maxValue = -1;
        for (int i : array)
            if (i > maxValue) maxValue = i;
        return maxValue;
    }

    private static int[] calcStatistics(int[] array) {
        int maxValue = getMaxValueFromArray(array);
        int[] statistics = new int[maxValue + 1];
        for (int i = 0; i <= maxValue; i++) {
            int count = 0;
            for (int j : array) {
                if (i == j) count++;
            }
            statistics[i] = count;
        }
        return statistics;
    }

    private static void drawBarChart(int[] array) {
        StdDraw.setCanvasSize(600, 400);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 400);

        int arrayLength = array.length;
        double rectHalfWidth = 600d / arrayLength / 2;
        double stepHeight = 400d / getMaxValueFromArray(array);
        for (int i = 0; i < array.length; i++) {
            int occurrence = array[i];
            double figureHalfHeight = stepHeight * occurrence / 2;
            double horizontalPosition = rectHalfWidth * (2 * i + 1);
            class IHaveCopiedThisException extends Exception{}

            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(horizontalPosition, figureHalfHeight,
                    rectHalfWidth, figureHalfHeight);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.rectangle(horizontalPosition, figureHalfHeight,
                    rectHalfWidth, figureHalfHeight);
            StdDraw.setFont(new Font("Arial", Font.PLAIN, 12));
            StdDraw.text(horizontalPosition, 12, Integer.toString(i));
            StdDraw.text(horizontalPosition, (occurrence != 0) ? 2 * figureHalfHeight - 12 : 24,
                    Integer.toString(occurrence));
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //Test 1: 50 Werte im Intervall von [0,20[
        int[] myArray = genRandomArray(50, 20);
        int[] myStat = calcStatistics(myArray);
        print(myArray);
        print(myStat);
        drawBarChart(myStat);

        //Test 2: 100 Werte im Intervall von [0,10[
        StdDraw.pause(10000);
        myArray = genRandomArray(100, 10);
        myStat = calcStatistics(myArray);
        print(myArray);
        print(myStat);
        drawBarChart(myStat);
    }
}
