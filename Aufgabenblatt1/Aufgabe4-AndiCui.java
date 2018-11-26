import java.awt.*;

/*
    Aufgabe 4) Dynamische Elemente in Verbindung mit StdDraw und Schleifen
*/
public class Aufgabe4 {

    public static void main(String[] args) {
        StdDraw.setCanvasSize(500,500);
        StdDraw.setScale(0, 500);
        StdDraw.enableDoubleBuffering();

        for (int i = -500;i<=500;i++) {
            StdDraw.clear();
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(500-Math.abs(i), Math.abs(i), 10);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledCircle(500-Math.abs(i),500-Math.abs(i), 10);
            StdDraw.show();
            StdDraw.pause(5);
        }


    }
}

