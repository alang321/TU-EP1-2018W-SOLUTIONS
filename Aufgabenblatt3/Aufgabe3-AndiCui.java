/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {

    public static void main(String[] args) {
        int pixelWidth = 600;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);

        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

        //TODO: Testen Sie die Methoden
        drawLineOfH(200, 100, 20, 80, 3);
    }

    private static void drawHorizontalRect(int mx, int my, int length, int width) {
        double halfLength = (double) length / 2;
        double halfWidth = (double) width / 2;
        StdDraw.line(mx - halfWidth, my - halfLength, mx + halfWidth, my - halfLength);
        StdDraw.line(mx + halfWidth, my - halfLength, mx + halfWidth, my + halfLength);
        StdDraw.line(mx + halfWidth, my + halfLength, mx - halfWidth, my + halfLength);
        StdDraw.line(mx - halfWidth, my + halfLength, mx - halfWidth, my - halfLength);
    }

    private static void drawVerticalRect(int mx, int my, int length, int width) {
        drawHorizontalRect(mx, my, width, length);
    }

    private static void drawBigH(int mx, int my, int length, int width) {
        double halfLength = (double) length / 2;
        double halfWidth = (double) width / 2;
        drawHorizontalRect(mx, my, length, width);
        drawVerticalRect((int) (mx + (halfWidth - halfLength)), my, length, width);
        drawVerticalRect((int) (mx - (halfWidth - halfLength)), my, length, width);
    }

    private static void drawLineOfH(int sx, int sy, int length, int width, int numCopies) {
        for (int xOffset = 0; xOffset / width < numCopies; xOffset += width) {
            drawBigH(sx + xOffset, sy, length, width);
        }
    }
}


