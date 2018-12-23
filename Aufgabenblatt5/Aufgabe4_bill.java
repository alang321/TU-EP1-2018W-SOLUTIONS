/*
    Aufgabe 4) Rekursion und Zeichnen mit StdDraw
*/
public class Aufgabe4 {
    
    //constant circle radius
    private static final int RADIUS = 10;

    private static void printCirclesInLine(int val, int x, int y) {
        if (val == 0) return;
        StdDraw.setPenColor(val%2==0 ? StdDraw.ORANGE : StdDraw.BLUE);
        StdDraw.filledCircle(x, y, RADIUS);
        StdDraw.filledCircle(x, y+RADIUS * 2, RADIUS);
        printCirclesInLine(val - 1, x+RADIUS * 2, y);
    }

    private static void printShape(int val, int max, int y) {
        if (val == max) { printCirclesInLine(val, RADIUS, y); return; }
        else {
            int y2 = y + (max-val) * RADIUS * 2 * 2 * 2;
            printCirclesInLine(val, RADIUS, y);
            printCirclesInLine(val, RADIUS, y2);
        }
        printShape(++val, max, y + RADIUS * 4);
    }

    public static void main(String[] args) {
        int pixelWidth = 200;
        int pixelHeight = 760;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        StdDraw.enableDoubleBuffering();

        //Erzeugt Abbildung 2a
        printShape(1, 10, RADIUS);
        StdDraw.show();
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2b
        printShape(1, 5, RADIUS);
        StdDraw.show();
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2c
        printShape(1, 1, RADIUS);
        StdDraw.show();
        StdDraw.pause(3000);
        StdDraw.clear();

        //Erzeugt Abbildung 2d
        printShape(3, 9, RADIUS);
        StdDraw.show();
    }
}

