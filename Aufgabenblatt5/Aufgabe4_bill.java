/*
    Aufgabe 4) Rekursion und Zeichnen mit StdDraw
*/
public class Aufgabe4 {
    
    //constant circle radius
    private static final int RADIUS = 10;

    //no idea how to make printShape() without this. is it possible?
    private static int valLow = 0;

    private static void printCirclesInLine(int val, int x, int y) {
        if (val == 0) return;
        StdDraw.setPenColor(val%2==0 ? StdDraw.ORANGE : StdDraw.BLUE);
        StdDraw.filledCircle(x, y, RADIUS);
        StdDraw.filledCircle(x, y+RADIUS * 2, RADIUS);
        printCirclesInLine(val - 1, x+RADIUS * 2, y);
    }

    private static void printShape(int val, int max, int y) {
        if (y == RADIUS) valLow = val;
        printCirclesInLine(val, RADIUS, y);
        boolean b = y < (RADIUS + RADIUS * 4 * (max - valLow));
        if (val == valLow && !b) return;
        printShape(val + (b ? 1 : -1), max, y + RADIUS * 4);
    }

    public static void main(String[] args) {
        int pixelWidth = 200;
        int pixelHeight = 760;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);

        //Erzeugt Abbildung 2a
        printShape(1, 10, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2b
        printShape(1, 5, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2c
        printShape(1, 1, RADIUS);
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2d
        printShape(3, 9, RADIUS);
    }
}

