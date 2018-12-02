/*
    Aufgabe 2) Eindimensionale Arrays - Schreiben, Lesen und Verwenden
*/

public class Aufgabe2 {

    private static int[] genRandomArray(int numValues, int maxValue) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        int arr[] = new int[numValues];
        for (int i = 0; i < arr.length; i++)
            arr[i] = (int)(Math.random() * maxValue);
        return arr;
    }

    private static int getMaxValueFromArray(int[] array) {
        int max = 0;
        for (int a : array)
            if (a > max)
                max = a;
        return max;
    }

    private static int[] calcStatistics(int[] array) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        int arr[] = new int[getMaxValueFromArray(array) + 1];
        for (int a : array)
            arr[a]++;
        return arr;
    }

    private static void drawBarChart(int[] array) {
        // TODO: Implementieren Sie hier Ihre Lösung für die Methode
        StdDraw.setCanvasSize(600, 400);
        StdDraw.setXscale(0, 600);
        StdDraw.setYscale(0, 400);

        double max = getMaxValueFromArray(array);

        StdDraw.setPenColor(150, 150, 150);

        for (int i = 0; i < max; i++)
        {
            StdDraw.line(0, 400 * i/max, 600, 400*i/max);
        }

        for (int i = 0; i < array.length; i++)
        {
            double t = (600 / array.length);
            double u = ((array[i]/max)*400)/2;

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(i * t + t / 2, u, t / 2, u);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(i * t + t / 2 - 1, u, t / 2 - 1, (u > 0) ? u : 0);

            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.text(i * t + t / 2,10, ""+i);
            StdDraw.text(i * t + t / 2, (u > 0) ? u * 2 - 15 : 30, ""+array[i]+1);
        }
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
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

