/*
    Aufgabe 3) Zeichnen mit Schleifen und Methoden
*/
public class Aufgabe3 {
    
    public static void main(String[] args) throws InterruptedException {
        int pixelWidth = 600;
        int pixelHeight = 200;
        StdDraw.setCanvasSize(pixelWidth, pixelHeight);
        StdDraw.setXscale(0, pixelWidth);
        StdDraw.setYscale(0, pixelHeight);
        
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.setPenRadius(0.005);

        drawHorizontalRect(250, 100, 100, 30);
        Thread.sleep(3000);
        StdDraw.clear();
        drawVerticalRect(250, 100, 100, 30);
        Thread.sleep(3000);
        StdDraw.clear();
        drawBigH(250, 100, 100, 30);
        Thread.sleep(3000);
        StdDraw.clear();
        drawLineOfH(100, 100, 100, 30, 5);
    }
    
    private static void drawHorizontalRect(int mx, int my, int length, int width) {
        StdDraw.line(
                mx - length / 2,
                my + width / 2,
                mx + length / 2,
                my + width / 2
        );
        StdDraw.line(
                mx + length / 2,
                my + width / 2,
                mx + length / 2,
                my - width / 2
        );
        StdDraw.line(
                mx + length / 2,
                my - width / 2,
                mx - length / 2,
                my - width / 2
        );
        StdDraw.line(
                mx - length / 2,
                my - width / 2,
                mx - length / 2,
                my + width / 2
        );
    }
    
    private static void drawVerticalRect(int mx, int my, int length, int width) {
        drawHorizontalRect(mx, my, width, length);
    }
    
    private static void drawBigH(int mx, int my, int length, int width) {
        drawHorizontalRect(mx, my, length, width);
        drawVerticalRect(
                mx - length / 2 + width / 2,
                my,
                length,
                width
        );
        drawVerticalRect(
                mx + length / 2 - width / 2,
                my,
                length,
                width
        );
    }
    
    private static void drawLineOfH(int sx, int sy, int length, int width, int numCopies) {
        for (int i = 0; i < numCopies; i++) {
            drawBigH(
                    sx + i * length,
                    sy,
                    length,
                    width
            );
        }
    }
}


